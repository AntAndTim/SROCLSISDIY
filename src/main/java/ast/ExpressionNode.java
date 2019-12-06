package ast;

import errors.SemanticException;
import utils.Pair;

import java.util.ArrayList;

public class ExpressionNode extends CommandNode{

    public Node primary;
    public ArrayList<String> callNames;
    public ArrayList<ArrayList<ExpressionNode>> callArgs;

    public ExpressionNode(Node primary, ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>> calls) {
        this.primary = primary;
        // XXX : Here can be issue with the constructor call
        // Probably one of the solution is to insert Pair("", new ArrayList<>()) to the calls
        this.callNames = new ArrayList<>();
        this.callArgs = new ArrayList<>();
        for (Pair<IdentNode, ArrayList<ExpressionNode>> c : calls){
            this.callNames.add(c.first.value);
            this.callArgs.add(c.second);
        }
    }

    public String getType() throws SemanticException{
        // If call, get return type, otherwise get type of variable/literal
        // Also check if constructor

        // Get primary type first
        String currType = this.getPrimaryType();
        for (int idx=0;idx<this.callNames.size();idx++){
//            currType this.callNames.get(idx)
            if (this.callArgs.get(idx) == null){    // Field
                if (!this.context.classTable.fields.get(currType).containsKey(this.callNames.get(idx))){
                    throw new SemanticException(String.format("Undefined field %s in %s", this.callNames.get(idx), currType), this.getStartPosition());
                }
                currType = this.context.classTable.fields.get(currType).get(this.callNames.get(idx)).fieldType.ident.value;
            } else if (this.callNames.get(idx).equals("")){ // Constructor
                if (idx == 0) {
                    if (!this.context.classTable.table.containsKey(currType)){
                        throw new SemanticException(String.format("Invalid class name %s", currType), this.getStartPosition());
                    } else {
                        // Check if any constructor has types which conform with given ones
                        boolean argsOk = false;
                        for (ConstructorDeclNode ctorDecl : this.context.classTable.constructors.get(currType)){
                            // Compare types
                            if (ctorDecl.params.size() != this.callArgs.get(0).size()){
                                continue;
                            }

                            argsOk = true;

                            for (int i = 0;i< this.callArgs.get(0).size();i++) {
                                if (ctorDecl.params.get(0).paramType.ident.value.equals(callArgs.get(0).get(i).getType())){
                                    argsOk = false;
                                }
                            }

                            if (argsOk){
                                break;
                            }
                        }
                        if (!argsOk){
                            throw new SemanticException("Such constructors signature doesn't exist", this.getStartPosition());
                        }
                    }

                } else {
                    throw new SemanticException("Empty call name", this.getStartPosition());
                }
            } else {    // Method
                currType = this.getMethodReturnType(currType, this.callNames.get(idx), this.callArgs.get(idx)).retTypeName;
            }
        }
        return currType;
    }


    public ArrayList<ExpressionNode> getAllNestedExpressions(){
        // They can only appear in arguments
        ArrayList<ExpressionNode> res = new ArrayList<>();
        res.add(this);
        for (ArrayList<ExpressionNode> args : this.callArgs){
            for (ExpressionNode expr : args){
                res.addAll(expr.getAllNestedExpressions());
            }
        }
        return res;
    }

    public ConstructorDeclNode getConstructor(String currType, ArrayList<ExpressionNode> args) throws SemanticException{
        boolean argsOk = false;
        for (ConstructorDeclNode ctorDecl : this.context.classTable.constructors.get(currType)){
            // Compare types
            if (ctorDecl.params.size() != this.callArgs.get(0).size()){
                continue;
            }

            argsOk = true;

            for (int i = 0;i< this.callArgs.get(0).size();i++) {
                if (ctorDecl.params.get(0).paramType.ident.value.equals(args.get(i).getType())){
                    argsOk = false;
                }
            }

            if (argsOk){
                return ctorDecl;
            }
        }
        throw new SemanticException("Such constructors signature doesn't exist", this.getStartPosition());

    }

    public MethodDeclNode getMethodReturnType(String clsName, String name, ArrayList<ExpressionNode> args) throws SemanticException{
        if (this.context.classTable.methods.get(clsName).containsKey(name)) {
            for (MethodDeclNode method : this.context.classTable.methods.get(clsName).get(name)) {
                if (args.size() != method.params.size()) {
                    continue;
                }
                boolean argsOK = true;
                for (int i = 0; i < args.size(); i++) {
                    if (!args.get(i).getType().equals(method.params.get(i).paramType.ident.value)) {
                        argsOK = false;
                        break;
                    }
                }
                if (!argsOK) {
                    continue;
                }
                return method;
            }
        }

        ArrayList<String> argTypes = new ArrayList<>();
        for (ExpressionNode currArg : args){
            argTypes.add(currArg.getType());
        }
        throw new SemanticException(String.format("Method %s.%s with arguments %s does not exist", clsName, name, argTypes.toString()), this.getStartPosition());
    }



    @Override
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        cil.append(primary.generateCode());

        String lastObjectType = getPrimaryType();

        for (int i = 0; i < callNames.size(); i++) {
            String callName = callNames.get(i);
            ArrayList<ExpressionNode> args = callArgs.get(i);
            if (args == null) {
                String varType = getVarDeclByName(callName).initialization.getType();
                cil.append(String.format("ldfld %s %s::%s\n", varType, lastObjectType, callName));
                lastObjectType = varType;
            } else {
                for (int j = 0; j < args.size(); j++)  {
                    args.get(j).generateCode();
                }

                if (i == 0){

                    ConstructorDeclNode ctorDecl = this.getConstructor(lastObjectType, args);
                    cil.append(String.format("callvirt instance void .ctor("));

                    boolean first = false;
                    for (int j = 0; j < args.size(); j++) {
                        ParamsDeclNode param = ctorDecl.params.get(j);
                        if (!first) {
                            cil.append(param.paramType.ident.value);
                            first = true;
                        } else cil.append(", " + param.paramType.ident.value);
                    }
                    cil.append(")\n");
                    continue;
                }

                MethodDeclNode method = getMethodReturnType(lastObjectType, callName, args);
                cil.append(String.format("callvirt instance %s %s::%s(",
                        method.retTypeName != null ? method.retTypeName : "void",
                        lastObjectType,
                        callName));

                boolean first = false;
                for (int j = 0; j < args.size(); j++) {
                    ParamsDeclNode param = method.params.get(j);
                    if (!first) {
                        cil.append(param.paramType.ident.value);
                        first = true;
                    } else cil.append(", " + param.paramType.ident.value);
                }
                cil.append(")\n");
            }
        }
        return cil.toString();
    }

    public String getPrimaryType() throws SemanticException{
        String primaryType = null;

        if (this.primary instanceof TypeNode){
//            return ((ClassNameNode)primary).ident.value;
//            return this.getVarDeclByName(((IdentNode) this.primary).value).initialization.getType();
            String name = ((TypeNode)primary).ident.value;
            // XXX : Ignoring generics for now TODO : Update to use them
            ArrayList<TypeNode> generics = ((TypeNode)primary).generics;
            // Check if name is class
            if (this.context.classTable.table.keySet().contains(name)){
                if (!this.callNames.get(0).equals("")){
                    throw new SemanticException("Static calls are not allowed", this.getStartPosition());
                }
                return name;
            } else {
                // Field or local var. Check field first
                if (this.context.classTable.fields.get(this.context.myClass.name).containsKey(name)){
                    // XXX : Generics are missed here
                    return this.context.classTable.fields.get(this.context.myClass.name).get(name).fieldType.ident.value;
                } else {
                    return this.getVarDeclByName(name).initialization.getType();
                }

            }

        } else if (this.primary instanceof LiteralNode){
            return ((LiteralNode)this.primary).getTypeName();
        } else if (this.primary instanceof IdentNode) {
            return this.getVarDeclByName(((IdentNode) this.primary).value).initialization.getType();
        } else {
            throw new SemanticException("Not supported primary type", this.getStartPosition());
        }
    }
}
