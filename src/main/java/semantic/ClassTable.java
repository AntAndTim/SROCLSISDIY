package semantic;

import ast.*;
import errors.SemanticException;

import java.util.*;

public class ClassTable {

    // TODO : Check forbidden names like this and class names

    public LinkedHashMap <String, ClassDeclNode> table;
    public HashSet <String> predefined;
    public HashMap <String, Map<String, ArrayList<MethodDeclNode>>> methods;
    public HashMap <String, Map<String, FieldDeclNode>> fields;
    public HashMap <String, ArrayList<ConstructorDeclNode>> constructors;

    public void addStubClass(String name, String parent, ArrayList<String> generics){
        ClassDeclNode res = new ClassDeclNode(new ClassNameNode(new IdentNode(name), new ArrayList<>()),
                new ClassNameNode(new IdentNode(parent), new ArrayList<>()),
                new ArrayList<>());

        this.table.put(name, res);
    }

    /**
     * Add method
     * If there exist method with same signature, it will not be overwritten
     * @param clsName
     * @param method
     */
    public void addMethod(String clsName, MethodDeclNode method){
        if (!this.methods.containsKey(clsName)){
            this.methods.put(clsName, new HashMap<>());
        }
        if (!this.methods.get(clsName).containsKey(method.name)){
            this.methods.get(clsName).put(method.name, new ArrayList<>());
        }
        for (MethodDeclNode currMethod : this.methods.get(clsName).get(method.name)){
            if (currMethod.compareSignature(method)){
                return;
            }
        }
        this.methods.get(clsName).get(method.name).add(method);
    }

    public void addField(String clsName, FieldDeclNode field) throws SemanticException{
        if (!this.fields.containsKey(clsName)){
            this.fields.put(clsName, new HashMap<>());
        }

        if (this.fields.get(clsName).containsKey(field.name)){
            throw new SemanticException(String.format("Parent field %s is being redeclared", field.name), field.getStartPosition());
        }

        this.fields.get(clsName).put(field.name, field);

    }

    public void addConstructor(String clsName, ConstructorDeclNode constructor){
        if (!this.constructors.containsKey(clsName)){
            this.constructors.put(clsName, new ArrayList<>());
        }
        for (ConstructorDeclNode existingConstructor : this.constructors.get(clsName)){
            if (existingConstructor.compareSignatures(constructor)){
                return;
            }
        }
        this.constructors.get(clsName).add(constructor);
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
        this.methods = new HashMap<>();
        this.constructors = new HashMap<>();

        // Initialize std classes
        for (ClassDeclNode classDecl : predefinedClasses.programClasses){
            this.table.put(classDecl.name, classDecl);
            this.predefined.add(classDecl.name);
        }

    }

    public boolean checkIfParentOf(String child, String parent){
        String currParent = this.table.get(child).parent;
        while (currParent != null){
            if (currParent.equals(parent)){
                return true;
            }
            currParent = this.table.get(currParent).parent;
        }
        return false;
    }
}
