package semantic;

import ast.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class ClassTable {

    LinkedHashMap <String, ClassDeclNode> table;
    HashSet <String> predefined;

    public void addClass(String name, String parent, ArrayList<String> generics){
        ClassDeclNode res = new ClassDeclNode(new ClassNameNode(new IdentNode(name), new ArrayList<>()),
                new ClassNameNode(new IdentNode(parent), new ArrayList<>()),
                new ArrayList<>());

        this.table.put(name, res);
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
