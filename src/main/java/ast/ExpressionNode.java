package ast;

import com.sun.org.apache.xpath.internal.operations.Bool;
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
        String primaryType = null;
        if (this.primary instanceof LiteralNode){
            return ((LiteralNode)this.primary).getTypeName();
        } else {

            //this.primary
        }

        return null;
    }

    @Override
    public String generateCode() {
        StringBuilder cil = new StringBuilder();
        cil.append(primary.generateCode());

        String lastObjectType = getType(); // так незя

        for (int i = 0; i < callNames.size(); i++) {
            String callName = callNames.get(i);
            var args = callArgs.get(i);
            if (args == null) {
                String varType = getVarDeclByName(callName).initialization.getType();
                cil.append(String.format("ldfld %s %s::%s\n", varType, lastObjectType, callName));
                lastObjectType = varType;
            } else {
                for (var arg : args) {
                    arg.generateCode();
                }
                var methods = context.classTable.methods.get(lastObjectType).get(callName);
                int methodIndex = 0; // TODO: use correct method
                var method = methods.get(methodIndex);
                cil.append(String.format("callvirt instance %s %s::%s(", method.retTypeName, lastObjectType, callName));
                boolean first = false;
                for (var param : method.params) {
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
