package ast;

import errors.SemanticException;

import java.util.ArrayList;

public class ConstructorDeclNode extends Node {

    // Signature
    public ArrayList<ParamsDeclNode> params;
    public BodyNode body;

    public ConstructorDeclNode(ArrayList<ParamsDeclNode> paramsDecls, BodyNode body) {
        this.params = paramsDecls;
        this.body = body;
    }

    public boolean compareSignatures(ConstructorDeclNode other){
        if (this.params.size() != other.params.size()){
            return false;
        }
        for (int i=0;i<this.params.size();i++){
            if (!this.params.get(i).paramType.equals(other.params.get(i).paramType)){
                return false;
            }
        }
        return true;
    }

    @Override
    public String generateCode() throws SemanticException {
        return null;
    }
}
