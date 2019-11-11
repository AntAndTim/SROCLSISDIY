package token.type;

import token.TokenType;

public enum Unknown implements TokenType {
    UNKNOWN("UNKNOWN");

    private final String value;

    Unknown(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
