package ast;

import java.util.ArrayList;

public class TypeNode extends Node{

    public IdentNode ident;
    public ArrayList<TypeNode> generics;

    public TypeNode(IdentNode ident, ArrayList<TypeNode> generics) {
        this.ident = ident;
        this.generics = generics;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
