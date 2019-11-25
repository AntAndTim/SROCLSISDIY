package ast;

public class BooleanLitNode extends LiteralNode {

    String value;

    @Override
    public String getTypeName() {
        return "Boolean";
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String generateCode() {
        return null;
    }

}
