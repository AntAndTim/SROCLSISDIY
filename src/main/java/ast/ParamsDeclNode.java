package ast;

public class ParamsDeclNode extends Node {

    public String name;
    public TypeNode paramType;

    public ParamsDeclNode(IdentNode nameId, TypeNode paramType) {
        this.name = nameId.value;
        this.paramType = paramType;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
