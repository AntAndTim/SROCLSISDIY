package token.type;

import token.TokenType;

public enum NumberLiteral implements TokenType {
    NUMBER_LITERAL("NUMBER_LITERAL");

    private final String value;

    NumberLiteral(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
