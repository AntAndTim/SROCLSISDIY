package token;

public interface TokenType {

    String getValue();

    default TokenType getType() {
        return this;
    }
}
