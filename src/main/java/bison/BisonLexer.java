package bison;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.SneakyThrows;

public class BisonLexer implements YYParser.Lexer {

    private static final Map<String, Integer> LANGUAGE_ELEMENT_VALUES = Arrays.stream(Tokens.values())
        .collect(Collectors.toMap(Tokens::getName, Tokens::getValue));
    private static final Map<String, TokenType> LANGUAGE_ELEMENTS = Arrays.stream(Tokens.values())
        .collect(Collectors.toMap(Tokens::getName, token -> token));
    private static final char EOF = (char) -1;

    private final InputStreamReader jsFileStream;
    private int currentPosition = 1;
    private int currentLine = 1;
    private boolean startFromNextLine;
    private String lastUnhandled = null;
    Token nextToken = null;

    public BisonLexer(InputStream jsFileStream) {
        this.jsFileStream = new InputStreamReader(jsFileStream, StandardCharsets.UTF_8);
    }

    @Override
    @SneakyThrows
    public Token getLVal() {
        Token nextToken = this.nextToken;
        this.nextToken = null;
        return nextToken;
    }

    @Override
    public int yylex() throws IOException {
        if (nextToken != null) {
            return nextToken.getType().getValue();
        }
        try {
            do {
                nextToken = getToken();
            }
            while (nextToken.getType() == Tokens.SPACE | nextToken.getType() == Tokens.NEW_LINE);
            return nextToken.getType().getValue();
        } catch (EOFException e) {
            return -1;
        }
    }

    @Override
    public void yyerror(String msg) {

    }

    Token getToken() throws IOException {
        String value;

        if (lastUnhandled != null) {
            value = lastUnhandled;
            lastUnhandled = null;
        } else {
            char symbol = readSymbol();
            value = String.valueOf(symbol);
        }

        if (value.charAt(0) == EOF) {
            throw new EOFException("All the possible tokens already obtained");
        }

        if (!checkValue(value) && !value.matches("[[a-z][A-Z]$_[0-9][а-я][А-Я]]")) {
            return getUnknown(value);
        }

        boolean potentialIdentifier = value.matches("[[a-z][A-Z]$_[а-я][А-Я]]");
        boolean numberLiteral = value.matches("[0-9]");

        while (true) {
            char symbol = readSymbol();

            String newSymbolValue = String.valueOf(symbol);

            if (potentialIdentifier) {
                if (!newSymbolValue.matches("[[a-z][A-Z]$_[0-9][а-я][А-Я]]")) {
                    lastUnhandled = newSymbolValue;
                    return checkValue(value) ? getElement(value) : getIdentifier(value);
                }
            } else if (checkValue(value) && !checkValue(value + newSymbolValue)) {
                lastUnhandled = newSymbolValue;
                return getElement(value);
            }

            if (numberLiteral && !newSymbolValue.matches("[0-9]")) {
                lastUnhandled = newSymbolValue;
                return getNumberLiteral(value);
            }

            value += newSymbolValue;
        }
    }

    private boolean checkValue(String value) {
        return LANGUAGE_ELEMENT_VALUES.containsKey(value);
    }

    private Token getIdentifier(String value) {
        return new Token(Tokens.IDENTIFIER, value, currentPosition - value.length() - 1, currentLine);
    }

    private Token getElement(String value) {
        return new Token(LANGUAGE_ELEMENTS.get(value),
                         value.equals("\n") ? "\\n" : value,
                         currentPosition - value.length(),
                         currentLine);
    }

    private Token getNumberLiteral(String value) {
        return new Token(Tokens.INTEGER, value, currentPosition - value.length() - 1, currentLine);
    }

    private Token getUnknown(String value) {
        return new Token(Tokens.UNKNOWN,
                         value.equals("\n") ? "\\n" : value,
                         currentPosition - value.length(),
                         currentLine);
    }

    private char readSymbol() throws IOException {
        if (startFromNextLine) {
            currentLine++;
            currentPosition = 1;
            startFromNextLine = false;
        }
        currentPosition++;

        char nextChar = (char) jsFileStream.read();
        if (nextChar == '\n') {
            startFromNextLine = true;
        }
        return nextChar;
    }
}
