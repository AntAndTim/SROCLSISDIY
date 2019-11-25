package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MethodDeclNode extends Node {

    // Signature
    public String name;
    public ArrayList<ParamsDeclNode> params;
    public String retTypeName;
    public BodyNode body;

    public MethodDeclNode(IdentNode nameId, ArrayList<ParamsDeclNode> paramsDecls, IdentNode retTypeNameId, BodyNode body) {
        this.name = nameId.value;
        this.params = paramsDecls;
        this.retTypeName = retTypeNameId.value;
        this.body = body;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
