package ast;

import errors.SemanticException;

public class ParamsDeclNode extends Node {

    public String name;
    public TypeNode paramType;

    public ParamsDeclNode(IdentNode nameId, TypeNode paramType) {
        this.name = nameId.value;
        this.paramType = paramType;
    }

    @Override
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        cil.append(paramType);
        cil.append(" ");
        cil.append(name);

        return cil.toString();
    }
}
