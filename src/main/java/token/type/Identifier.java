package token.type;

import token.TokenType;

public enum Identifier implements TokenType {
    IDENTIFIER("IDENTIFIER");

    private final String value;

    Identifier(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
