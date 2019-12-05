package ast;

public class RealLitNode extends LiteralNode {

    public String value;

    public RealLitNode(String value){
        this.value = value;
    }

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
