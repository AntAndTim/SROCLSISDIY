package token.type;

import token.TokenType;

public enum Operator implements TokenType {
    ASSIGNMENT("="),
    ASSIGNMENT_WITH_INCREASE("+="),
    ASSIGNMENT_WITH_DECREASE("-="),
    ASSIGNMENT_WITH_MULTIPLICATION("*="),
    ASSIGNMENT_WITH_DIVISION("/="),
    ASSIGNMENT_WITH_REMAINDER("%="),
    ASSIGNMENT_WITH_AND("&="),
    ASSIGNMENT_WITH_OR("|="),
    ASSIGNMENT_WITH_XOR("^="),
    ASSIGNMENT_WITH_LEFT_SHIFT("<<="),
    ASSIGNMENT_WITH_RIGHT_SHIFT(">>="),
    ASSIGNMENT_WITH_UNSIGNED_RIGHT_SHIFT(">>>="),

    TYPELESS_EQUALITY("=="),
    TYPELESS_INEQUALITY("!="),
    EQUALITY("==="),
    INEQUALITY("!=="),
    GREATER(">"),
    LESS("<"),
    GREATER_OR_EQUAL(">="),
    LESS_OR_EQUAL("<="),

    PLUS("+"),
    MINUS("-"),
    MILTIPLICATION("*"),
    DIVISION("/"),
    REMAINDER("%"),
    INCREMENT("++"),
    DECREMENT("--"),


    BITWISE_AND("&"),
    BITWISE_OR("|"),
    BITWISE_NOT("~"),
    BITWISE_XOR("^"),
    BITWISE_LEFT_SHIFT("<<"),
    BITWISE_RIGHT_SHIFT(">>"),
    BITWISE_UNSIGNED_RIGHT_SHIFT(">>>"),

    LOGICAL_AND("&&"),
    LOGICAL_OR("||"),
    LOGICAL_NOT("!"),

    ARROW("=>");

    private final String value;

    Operator(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
