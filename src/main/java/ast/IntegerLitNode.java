package ast;

import errors.SemanticException;

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
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        cil.append(String.format("ldc.i4 %d\n", Integer.parseInt(getValue())));
        return cil.toString();
    }
}
