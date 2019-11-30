package semantic;

import ast.ClassDeclNode;
import ast.MethodDeclNode;
import ast.ProgramNode;
import errors.SemanticException;

import java.util.ArrayList;

public class SemanticAnalyzer {

    ClassTable classTable;
    final String predefinedClassesPath = "std.txt";

    public void run(ProgramNode root) throws SemanticException {
        indexClasses(root);
    }

    public void indexClasses(ProgramNode root) throws SemanticException {

        this.classTable = new ClassTable(new ProgramNode(new ArrayList<>()));
        // TODO : Add parsing of standard library
//        this.classTable = new ClassTable();

        for (ClassDeclNode classDecl : root.programClasses){
            this.classTable.addClass(classDecl);
        }
    }

    public void updateAST(ProgramNode root) throws SemanticException {
        for (ClassDeclNode classDecl : root.programClasses){
            // Get methods to add
            ClassDeclNode currParentNode = this.classTable.get(classDecl.parent);
            while (currParentNode != null) {
                // TODO : METHOD CAN BE NULL!!!!
                for (MethodDeclNode method : currParentNode.methods) {
                    if (!classDecl.getMethod(method.name).compareSignature(method)){
                        classDecl.methods.add(method);
                    }
                }
            }
        }
    }


}
