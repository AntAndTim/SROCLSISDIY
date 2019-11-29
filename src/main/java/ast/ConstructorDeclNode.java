package ast;

import java.util.ArrayList;

public class ConstructorDeclNode extends Node {

    // Signature
    public ArrayList<ParamsDeclNode> params;
    public String retTypeName;
    public BodyNode body;

    public ConstructorDeclNode(ArrayList<ParamsDeclNode> paramsDecls, IdentNode retTypeNameId, BodyNode body) {
        this.params = paramsDecls;
        this.retTypeName = retTypeNameId.value;
        this.body = body;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
