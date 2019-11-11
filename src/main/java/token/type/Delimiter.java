package token.type;

import token.TokenType;

public enum Delimiter implements TokenType {
    WHITESPACE(" "),
    OPENING_CURLY_BRACES("{"),
    CLOSING_CURLY_BRACES("}"),
    OPENING_PARENTHESIS("("),
    CLOSING_PARENTHESIS(")"),
    OPENING_BRACKETS("["),
    CLOSING_BRACKETS("]"),
    DOUBLE_QUOTES("\""),
    SINGLE_QUOTES("\'"),
    SINGLE_QUOTES_2("`"),
    COMMA(","),
    DOT("."),
    SEMICOLON(";"),
    NEWLINE("\n");

    private final String value;

    Delimiter(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
