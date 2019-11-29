package ast;

public class RealLitNode extends LiteralNode {

    public String value;

    @Override
    public String getTypeName() {
        return "Real";
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
