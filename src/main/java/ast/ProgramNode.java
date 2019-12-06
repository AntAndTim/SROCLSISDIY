package ast;

import errors.SemanticException;

import java.nio.file.Files;
import java.util.ArrayList;

public class ProgramNode extends Node {

    public ArrayList<ClassDeclNode> programClasses;

    public ProgramNode(ArrayList<ClassDeclNode> programClasses) {
        this.programClasses = programClasses;
    }

    @Override
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        cil.append(StandardLibrary.LIB);
        cil.append(".method static void __main()\n" +
                "{\n" +
                "    .entrypoint\n" +
                "    .maxstack 1\n" +
                "    newobj instance void class Main::.ctor()\n" +
                "    stloc.0\n" +
                "    ldloc.0\n" +
                "    callvirt instance void class Main::main()\n" +
                "    ret\n" +
                "}\n");

        for (int i = 0; i < programClasses.size(); i++) {
            cil.append(programClasses.get(i).generateCode());
        }
        return cil.toString();
    }
}
