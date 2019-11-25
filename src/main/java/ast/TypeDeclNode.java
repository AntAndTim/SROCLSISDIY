package ast;

import java.util.ArrayList;

public class TypeDeclNode extends Node{

    public IdentNode ident;
    public ArrayList<TypeDeclNode> generics;

    public TypeDeclNode(IdentNode ident, ArrayList<TypeDeclNode> generics) {
        this.ident = ident;
        this.generics = generics;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
