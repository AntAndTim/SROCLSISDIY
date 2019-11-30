package semantic;

import ast.*;
import errors.SemanticException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class ClassTable {

    LinkedHashMap <String, ClassDeclNode> table;
    HashSet <String> predefined;

    public void addStubClass(String name, String parent, ArrayList<String> generics){
        ClassDeclNode res = new ClassDeclNode(new ClassNameNode(new IdentNode(name), new ArrayList<>()),
                new ClassNameNode(new IdentNode(parent), new ArrayList<>()),
                new ArrayList<>());

        this.table.put(name, res);
    }

    public void addClass(ClassDeclNode clsNode) throws SemanticException{
        if (this.predefined.contains(clsNode.name)){
            String msg = String.format("Class %s is already defined", clsNode.name);
            throw new SemanticException(msg, clsNode.getStartPosition());
        }
        this.table.put(clsNode.name, clsNode);
    }

    public ClassDeclNode get(String name){
        return this.table.get(name);
    }

    public ClassTable(ProgramNode predefinedClasses) {

        this.table = new LinkedHashMap<>();
        // XXX : Not very good solution
        this.predefined = new HashSet<>();

        // Initialize std classes
        for (ClassDeclNode classDecl : predefinedClasses.programClasses){
            this.table.put(classDecl.name, classDecl);
            this.predefined.add(classDecl.name);
        }

    }
}
