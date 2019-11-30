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
        StringBuilder cil = new StringBuilder();
        cil.append(".class public auto ansi ");

        // Generics
        int genericsLength = generics.size();
        if (genericsLength > 0) {
            cil.append(String.format("`%d<", genericsLength));
            for (int i = 0; i < genericsLength; i++) {
                cil.append(String.format("[mscorelib]System.Object %s%s",
                        generics.get(i).generateCode(),
                        i + 1 < genericsLength ? ", " : ""));
            }
            cil.append("> ");
        }

        // Class name
        cil.append(ident.generateCode());
        cil.append("\n");

        return cil.toString();
    }
}
