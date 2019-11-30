package ast;

import utils.Pair;

import javax.xml.stream.FactoryConfigurationError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodDeclNode extends Node {

    // Signature
    public String name;
    public ArrayList<ParamsDeclNode> params;
    public String retTypeName;
    public BodyNode body;

    public int maxStack;
    public List<Pair<String, String>> localInit;    // First -> type, second -> name

    public MethodDeclNode(IdentNode nameId, ArrayList<ParamsDeclNode> paramsDecls, IdentNode retTypeNameId, BodyNode body) {
        this.name = nameId.value;
        this.params = paramsDecls;
        this.retTypeName = retTypeNameId.value;
        this.body = body;
    }

    @Override
    public String generateCode() {
        StringBuilder cil = new StringBuilder();
        cil.append(".method public hidebysig instance ");
        cil.append(retTypeName);
        cil.append(" ");
        cil.append(name);
        cil.append("(");
        if (params.size() > 0) {
            cil.append(params.get(0).generateCode());
            for (int i = 1; i < params.size(); i++) {
                cil.append(", ");
                cil.append(params.get(i).generateCode());
            }
        }
        cil.append(")");
        // cil.append(" cil");
        // cil.append(" managed");
        cil.append("\n{");
        cil.append(body.generateCode());
        cil.append("}\n");

        return cil.toString();
    }

    public boolean compareSignature(MethodDeclNode other){
        return false; // TODO
    }

    public int getLocalIndexByName(String name){
        return 0; // TODO
    }
}
