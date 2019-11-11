package token.type;

import token.TokenType;

public enum Keyword implements TokenType {
    ABSTRACT("abstract"),
    ARGUMENTS("arguments"),
    BOOLEAN("boolean"),
    BREAK("break"),
    BYTE("byte"),
    CASE("case"),
    CATCH("catch"),
    CHAR("char"),
    CONST("const"),
    CONTINUE("continue"),
    DEBUGGER("debugger"),
    DEFAULT("default"),
    DELETE("delete"),
    DO("do"),
    DOUBLE("double"),
    ELSE("else"),
    EVAL("eval"),
    FALSE("false"),
    FINAL("final"),
    FINALLY("finally"),
    FLOAT("float"),
    FOR("for"),
    FUNCTION("function"),
    GOTO("goto"),
    IF("if"),
    IMPLEMENTS("implements"),
    IN("in"),
    INSTANCEOF("instanceof"),
    INT("int"),
    INTERFACE("interface"),
    LET("let"),
    LONG("long"),
    NATIVE("native"),
    NEW("new"),
    NULL("null"),
    PACKAGE("package"),
    PRIVATE("private"),
    PROTECTED("protected"),
    PUBLIC("public"),
    RETURN("return"),
    SHORT("short"),
    STATIC("static"),
    SWITCH("switch"),
    SYNCHRONIZED("synchronized"),
    THIS("this"),
    THROW("throw"),
    THROWS("throws"),
    TRANSIENT("transient"),
    TRUE("true"),
    TRY("try"),
    TYPEOF("typeof"),
    VAR("var"),
    VOID("void"),
    VOLATILE("volatile"),
    WHILE("while"),
    WITH("with"),
    YIELD("yield"),
    CLASS("class"),
    ENUM("enum"),
    EXPORT("export"),
    EXTENDS("extends"),
    IMPORT("import"),
    SUPER("super");

    private final String value;

    Keyword(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
