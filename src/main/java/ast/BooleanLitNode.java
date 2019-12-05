package ast;

import errors.SemanticException;

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
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        cil.append(String.format("ldc.i4 %d\n", Boolean.parseBoolean(getValue()) ? 1 : 0));
        return cil.toString();
    }

}
