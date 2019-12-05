package ast;

import java.util.ArrayList;

public class ConstructorDeclNode extends Node {

    // Signature
    public ArrayList<ParamsDeclNode> params;
    public BodyNode body;

    public ConstructorDeclNode(ArrayList<ParamsDeclNode> paramsDecls, BodyNode body) {
        this.params = paramsDecls;
        this.body = body;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
