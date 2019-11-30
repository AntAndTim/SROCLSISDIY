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
    public boolean equals(Object o) {
        TypeNode otherType = (TypeNode)o;
        if (!otherType.ident.value.equals(this.ident.value)){
            return false;
        }

        if (this.generics.size() != otherType.generics.size()){
            return false;
        }

        for (int i=0;i<this.generics.size();i++){
            if (!this.generics.get(i).equals(otherType.generics.get(i))){
                return false;
            }
        }

        return true;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
