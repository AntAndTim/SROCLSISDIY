package ast;

public class VariableDeclNode extends Node{

    public String name;
    public ExpressionNode initialization;

    public VariableDeclNode(IdentNode nameId, ExpressionNode initialization) {
        this.name = nameId.value;
        this.initialization = initialization;
    }

    @Override
    public String generateCode() {
        StringBuilder cil = new StringBuilder();
        cil.append(initialization.generateCode());

        return cil.toString();
    }
}
