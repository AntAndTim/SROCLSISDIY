package semantic;

import ast.ClassDeclNode;
import ast.ProgramNode;

import java.util.ArrayList;

public class SemanticAnalyzer {

    ClassTable classTable;
    final String predefinedClassesPath = "std.txt";

    public ClassTable indexClasses(ProgramNode root){

        this.classTable = new ClassTable(new ProgramNode(new ArrayList<>()));
        // TODO : Add parsing of standard library
//        this.classTable = new ClassTable();

        for (ClassDeclNode classDecl : root.programClasses){

        }
    }

}
