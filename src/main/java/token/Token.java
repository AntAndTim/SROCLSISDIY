package token;

import java.util.StringJoiner;

public class Token {

    private final TokenType type;
    private final String value;
    private final int position;
    private final int line;

    public Token(TokenType type, String value, int position, int line) {
        this.type = type;
        this.value = value;
        this.position = position;
        this.line = line;
    }

    public TokenType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public int getPosition() {
        return position;
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Token.class.getSimpleName() + "[", "]")
            .add("type=" + type)
            .add("value='" + value + "'")
            .add("position=" + position)
            .add("line=" + line)
            .toString();
    }
}
