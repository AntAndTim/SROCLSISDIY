package bison;

public enum Tokens implements TokenType {
    OPENING_CURLY_BRACES("{", YYParser.Lexer.OPENING_CURLY_BRACES),
    CLOSING_CURLY_BRACES("}", YYParser.Lexer.CLOSING_CURLY_BRACES),
    OPENING_PARENTHESIS("(", YYParser.Lexer.OPENING_PARENTHESIS),
    CLOSING_PARENTHESIS(")", YYParser.Lexer.CLOSING_PARENTHESIS),
    OPENING_BRACKETS("[", YYParser.Lexer.OPENING_BRACKETS),
    CLOSING_BRACKETS("]", YYParser.Lexer.CLOSING_BRACKETS),
    COMMA(",", YYParser.Lexer.COMMA),
    DOT(".", YYParser.Lexer.DOT),
    IDENTIFIER("IDENTIFIER", YYParser.Lexer.IDENTIFIER),
    ELSE("else", YYParser.Lexer.ELSE),
    FALSE("false", YYParser.Lexer.FALSE),
    IF("if", YYParser.Lexer.IF),
    IN("in", YYParser.Lexer.IN),
    THIS("this", YYParser.Lexer.THIS),
    TRUE("true", YYParser.Lexer.TRUE),
    VAR("var", YYParser.Lexer.VAR),
    WHILE("while", YYParser.Lexer.WHILE),
    CLASS("class", YYParser.Lexer.CLASS),
    EXTENDS("extends", YYParser.Lexer.EXTENDS),
    ASSIGNMENT(":=", YYParser.Lexer.ASSIGNMENT),
    COLON(":", YYParser.Lexer.COLON),
    UNKNOWN("UNKNOWN", YYParser.Lexer.UNKNOWN),
    RETURN("return", YYParser.Lexer.RETURN),
    IS("is", YYParser.Lexer.IS),
    END("end", YYParser.Lexer.END),
    LOOP("loop", YYParser.Lexer.LOOP),
    THEN("then", YYParser.Lexer.THEN),
    METHOD("method", YYParser.Lexer.METHOD),
    INTEGER("INTEGER", YYParser.Lexer.INTEGER),
    REAL("REAL", YYParser.Lexer.REAL),
    SPACE(" ", 2281337),
    NEW_LINE("\n", 2281337);

    private final String name;
    private final int type;

    Tokens(String name, int type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getValue() {
        return type;
    }
}
