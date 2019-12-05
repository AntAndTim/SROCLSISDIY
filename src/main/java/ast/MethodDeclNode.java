package ast;

import com.sun.org.apache.xpath.internal.Arg;
import utils.Pair;

import javax.xml.stream.FactoryConfigurationError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodDeclNode extends Node {

    // Signature
    public String name;
    public ArrayList<ParamsDeclNode> params;
    public String retTypeName;
    public BodyNode body;

    // TODO : CALCULATE FROM
    public int maxStack;
    public List<Pair<String, String>> localInit;    // First -> type, second -> name

    public MethodDeclNode(IdentNode nameId, ArrayList<ParamsDeclNode> paramsDecls, IdentNode retTypeNameId, BodyNode body) {
        this.name = nameId.value;
        this.params = paramsDecls;
        this.retTypeName = retTypeNameId.value;
        this.body = body;
    }

    @Override
    public String generateCode() {
        StringBuilder cil = new StringBuilder();
        cil.append(".method public hidebysig virtual ");
        cil.append(retTypeName);
        cil.append(" ");
        cil.append(name);
        cil.append("(");
        if (params.size() > 0) {
            cil.append(params.get(0).generateCode());
            for (int i = 1; i < params.size(); i++) {
                cil.append(", ");
                cil.append(params.get(i).generateCode());
            }
        }
        cil.append(")");
        // cil.append(" cil");
        // cil.append(" managed");
        cil.append("\n{");

        // MAX STACK
        // LOCALS INIT
        // Declaring local variables
        // TODO: Apparently body nodes are not only in actual bodies but also in statements, move declarations
//        int declarations = 0;
//        for (int i = 0; i < actionTypes.size(); i++) {
//            vars.put(((VariableDeclNode) actions.get(i)).name, declarations);
//            if (actionTypes.get(i) == ActionType.VARIABLE_DECLARATION) declarations++;
//        }
//        if (declarations > 0) {
//            cil.append(String.format(".maxstack %d\n", declarations));
//            cil.append(".locals init (int32 a_0"); // TODO: REPLACE int32 WITH ACTUAL DATA TYPES
//            for (int i = 1; i < declarations; i++) { //               |
//                cil.append(String.format(", int32 a_%d", i)); // Here as well
//            }
//            cil.append(")\n");
//        }

        cil.append(body.generateCode());
        cil.append("}\n");

        return cil.toString();
    }

    public boolean compareSignature(MethodDeclNode other){
//        return false; // TODO
        // compare name
        if (!this.name.equals(other.name)){
            return false;
        }
        // compare types of arguments
        if (this.params.size() != other.params.size()){
            return false;
        }
        for (int i=0; i<this.params.size(); i++){
            if (!this.params.get(i).paramType.equals(other.params.get(i).paramType)){
                return false;
            }
        }
        return true;
    }

    public int getLocalIndexByName(String name){
        return 0; // TODO
    }
}
