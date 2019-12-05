package ast;

import errors.SemanticException;

import java.util.ArrayList;

public class ProgramNode extends Node {

    public ArrayList<ClassDeclNode> programClasses;

    public ProgramNode(ArrayList<ClassDeclNode> programClasses) {
        this.programClasses = programClasses;
    }

    @Override
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        cil.append(".method static void Main()\n" +
                "{\n" +
                "    .entrypoint\n" +
                "    .maxstack 1\n" +
                "    newobj instance void class <CLASS>::.ctor()\n" +
                "    stloc.0\n" +
                "    ldloc.0\n" +
                "    callvirt instance void class <CLASS>::main()\n" +
                "    ret\n" +
                "}\n");
        return cil.toString();
    }
}
