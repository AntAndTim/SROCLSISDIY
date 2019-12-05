package bison;

public interface TokenType {

    String getName();

    int getValue();

    default TokenType getType() {
        return this;
    }
}
