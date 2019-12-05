package ast;

import errors.SemanticException;

public class VariableDeclNode extends CommandNode{

    public String name;
    public ExpressionNode initialization;

    public VariableDeclNode(IdentNode nameId, ExpressionNode initialization) {
        this.name = nameId.value;
        this.initialization = initialization;
    }

    @Override
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        cil.append(initialization.generateCode());

//        // TODO: INITIALIZE VAR
//        int varId = vars.get(((VariableDeclNode) action).name);
//        cil.append(String.format("stloc.s %d\n", varId));

        return cil.toString();
    }
}
