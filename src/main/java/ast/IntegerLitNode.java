package ast;

public class IntegerLitNode extends LiteralNode {

    public String value;

    public IntegerLitNode(String value){
        this.value = value;
    }

    @Override
    public String getTypeName() {
        return "Integer";
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
