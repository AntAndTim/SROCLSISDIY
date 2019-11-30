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
    public Map<String, Integer> nameToIndex;    // Indexes start from 1
    public Map<Integer, String> indexToType;
    public List<Pair<String, String>> localInit;    // First -> type, second -> name

    public MethodDeclNode(IdentNode nameId, ArrayList<ParamsDeclNode> paramsDecls, IdentNode retTypeNameId, BodyNode body) {
        this.name = nameId.value;
        this.params = paramsDecls;
        this.retTypeName = retTypeNameId.value;
        this.body = body;
    }

    public boolean compareSignature(MethodDeclNode other){
        return false; // TODO
    }

    public int getLocalIndexByName(String name){
        return 0; // TODO
    }

    @Override
    public String generateCode() {
        return null;
    }
}
