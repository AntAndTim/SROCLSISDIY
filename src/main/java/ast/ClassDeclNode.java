package ast;

import errors.SemanticException;

import java.util.ArrayList;

public class ClassDeclNode extends Node{
    static final String defaultParentClass = "Class";

    public String name;
    public ArrayList<String> generics;
    public ArrayList<FieldDeclNode> fields;
    public ArrayList<MethodDeclNode> methods;
    public ArrayList<ConstructorDeclNode> constructors;
    public String parent;
    public ArrayList<String> parentGenerics;

    public int maxStack;

    private ClassNameNode nameNode;

    @Override
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        cil.append(nameNode.generateCode());
        cil.append("{\n");

        // Fields
        for (int i = 0; i < fields.size(); i++) {
            cil.append(fields.get(i).generateCode());
        }

        // Methods
        for (int i = 0; i < methods.size(); i++) {
            cil.append(methods.get(i).generateCode());
        }

        cil.append("}");
        cil.append("\n");

        return cil.toString();
    }

    public ClassDeclNode(ClassNameNode cName, ClassNameNode parentName, ArrayList<MemberDeclNode> members) {
        // Class identification
        this.nameNode = cName;
        this.generics = new ArrayList<>();
        name = cName.ident.value;
        for (IdentNode genericIdent : cName.generics){
            generics.add(genericIdent.value);
        }

        // Parent class identification
        this.parentGenerics = new ArrayList<>();
        this.parent = parentName.ident.value;
        for (IdentNode genericIdent : parentName.generics){
            this.parentGenerics.add(genericIdent.value);
        }

        // Class members
        this.fields = new ArrayList<>();
        this.methods = new ArrayList<>();
        this.constructors = new ArrayList<>();
        for (MemberDeclNode memberNode : members){
            switch (memberNode.declType){
                case FIELD:
                    fields.add((FieldDeclNode)memberNode.declaration);
                    break;
                case METHOD:
                    methods.add((MethodDeclNode)memberNode.declaration);
                    break;
                case CONSTRUCTOR:
                    constructors.add((ConstructorDeclNode)memberNode.declaration);
            }
        }
    }

    /**
     * Sets parent class to default value
     * @param cName
     * @param members
     */
    public ClassDeclNode(ClassNameNode cName, ArrayList<MemberDeclNode> members) {
        // Class identification
        this.generics = new ArrayList<>();
        name = cName.ident.value;
        for (IdentNode genericIdent : cName.generics){
            generics.add(genericIdent.value);
        }

        // Parent class identification
        this.parentGenerics = new ArrayList<>();
        this.parent = defaultParentClass;

        // Class members
        this.fields = new ArrayList<>();
        this.methods = new ArrayList<>();
        this.constructors = new ArrayList<>();
        for (MemberDeclNode memberNode : members){
            switch (memberNode.declType){
                case FIELD:
                    fields.add((FieldDeclNode)memberNode.declaration);
                    break;
                case METHOD:
                    methods.add((MethodDeclNode)memberNode.declaration);
                    break;
                case CONSTRUCTOR:
                    constructors.add((ConstructorDeclNode)memberNode.declaration);
            }
        }
    }

    public void addStubMethod(String name, String[] args, String[] argTypes, String retType){
        IdentNode nameId = new IdentNode(name);
        IdentNode returnTypeId = new IdentNode(retType);
        ArrayList<ParamsDeclNode> paramsDecl = new ArrayList<>();

        for (int i=0;i<args.length;i++){
            paramsDecl.add(new ParamsDeclNode(new IdentNode(args[i]),
                        new TypeNode(new IdentNode(argTypes[i]), new ArrayList<>())));
        }

        this.methods.add(new MethodDeclNode(nameId, paramsDecl, returnTypeId, null));
    }

    public ArrayList<MethodDeclNode> getMethod(String name){
        ArrayList<MethodDeclNode> res = new ArrayList<>();
        for (MethodDeclNode m : this.methods){
            if (name.equals(m.name)) {
                res.add(m);
            }
        }
        return res;
    }
}
