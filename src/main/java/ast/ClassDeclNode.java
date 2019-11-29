package ast;

import java.util.ArrayList;

public class ClassDeclNode extends Node{

    public String name;
    public ArrayList<String> generics;
    public ArrayList<FieldDeclNode> fields;
    public ArrayList<MethodDeclNode> methods;
    public ArrayList<ConstructorDeclNode> constructors;
    public String parent;
    public ArrayList<String> parentGenerics;

    public int maxStack;

    @Override
    public String generateCode() {
        StringBuilder cil = new StringBuilder();
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
}
