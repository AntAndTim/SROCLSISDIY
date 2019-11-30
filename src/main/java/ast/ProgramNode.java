package ast;

import java.util.ArrayList;

public class ProgramNode extends Node {

    public ArrayList<ClassDeclNode> programClasses;

    public ProgramNode(ArrayList<ClassDeclNode> programClasses) {
        this.programClasses = programClasses;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
