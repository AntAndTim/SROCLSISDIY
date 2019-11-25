package ast;

import java.util.ArrayList;

public class ClassNameNode extends Node{

    public IdentNode ident;
    public ArrayList<IdentNode> generics;

    public ClassNameNode(IdentNode ident, ArrayList<IdentNode> generics) {
        this.ident = ident;
        this.generics = generics;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
