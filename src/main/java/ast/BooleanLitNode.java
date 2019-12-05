package ast;

public class BooleanLitNode extends LiteralNode {

    String value;

    public BooleanLitNode(String value){
        this.value = value;
    }

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
