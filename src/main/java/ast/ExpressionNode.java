package ast;

import com.sun.org.apache.xpath.internal.operations.Bool;
import errors.SemanticException;
import semantic.MethodContext;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
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

    public String getType(){
        // If call, get return type, otherwise get type of variable/literal
        // Also check if constructor

        // Get primary type first
//        String primaryType = null;
//        if (this.primary instanceof LiteralNode){
//            return ((LiteralNode)this.primary).getTypeName();
//        } else {
//
//            this.primary
//        }
        throw new UnsupportedOperationException();
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

    public MethodDeclNode getMethodReturnType(String clsName, String name, ArrayList<ExpressionNode> args) throws SemanticException{
        for (MethodDeclNode method : this.context.classTable.methods.get(clsName).get(name)){
            if (args.size() != method.params.size()){
                continue;
            }
            boolean argsOK = true;
            for (int i=0;i<args.size();i++){
                if (!args.get(i).getType().equals(method.params.get(i).paramType)){
                    argsOK = false;
                    break;
                }
            }
            if (!argsOK){
                continue;
            }
            return method;
        }

        ArrayList<String> argTypes = new ArrayList<>();
        for (ExpressionNode currArg : args){
            argTypes.add(currArg.getType());
        }
        throw new SemanticException(String.format("Method %s.%s with arguments %s", clsName, name, argTypes.toString()), this.getStartPosition());
    }



    @Override
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        cil.append(primary.generateCode());

        String lastObjectType = getType(); // так незя

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

                MethodDeclNode method = getMethodReturnType(lastObjectType, callName, args);
                cil.append(String.format("callvirt instance %s %s::%s(", method.retTypeName, lastObjectType, callName));
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
}
