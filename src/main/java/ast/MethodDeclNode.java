package ast;

// import com.sun.org.apache.xpath.internal.Arg;
import errors.SemanticException;
import semantic.MethodContext;
import utils.Pair;

import java.util.ArrayList;
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

    public MethodContext context;


    private ArrayList<String> getLocalsInit() throws SemanticException{
        ArrayList<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : this.context.variableIndexes.entrySet()){
            String name = entry.getKey();
            String index = entry.getValue().toString();
            String type = this.context.localVariables.get(name).initialization.getType();
            res.add(String.format("[%s] %s %s", index, type, name));
        }
        return res;
    }

    public MethodDeclNode(IdentNode nameId, ArrayList<ParamsDeclNode> paramsDecls, IdentNode retTypeNameId, BodyNode body) {
        this.name = nameId.value;
        this.params = paramsDecls;
        if(retTypeNameId != null)
        this.retTypeName = retTypeNameId.value;
        this.body = body;
    }

    @Override
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        cil.append(".method public hidebysig virtual ");
        cil.append(retTypeName != null ? retTypeName : "void");
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
        cil.append("\n{\n");

        // MAX STACK
        // LOCALS INIT

        cil.append(String.format(".maxstack %d\n", 100));
        ArrayList<String> locals = getLocalsInit();
        if (locals == null) {
            System.err.println(".locals init is null!");
        } else {
            if (locals.size() > 0) cil.append(String.format(".locals init (%s", locals.get(0)));
            for (int i = 1; i < locals.size(); i++) { //               |
                cil.append(String.format(", %s", locals.get(i))); // Here as well
            }
            if (locals.size() > 0) cil.append(")\n");
        }

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
