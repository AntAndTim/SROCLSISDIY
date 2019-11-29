package ast;

public class VariableDeclNode extends Node{

    public String name;
    public ExpressionNode intialization;

    public VariableDeclNode(IdentNode nameId, ExpressionNode intialization) {
        this.name = nameId.value;
        this.intialization = intialization;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
