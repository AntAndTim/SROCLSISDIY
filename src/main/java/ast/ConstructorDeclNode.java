package ast;

import errors.SemanticException;
import semantic.MethodContext;

import java.util.ArrayList;
import java.util.Map;

public class ConstructorDeclNode extends Node {

    // Signature
    public ArrayList<ParamsDeclNode> params;
    public BodyNode body;
    public MethodContext context;

    public ConstructorDeclNode(ArrayList<ParamsDeclNode> paramsDecls, BodyNode body) {
        this.params = paramsDecls;
        this.body = body;
    }

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

    public boolean compareSignatures(ConstructorDeclNode other){
        if (this.params.size() != other.params.size()){
            return false;
        }
        for (int i=0;i<this.params.size();i++){
            if (!this.params.get(i).paramType.equals(other.params.get(i).paramType)){
                return false;
            }
        }
        return true;
    }

    @Override
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        cil.append(".method public hidebysig virtual instance void ");
        cil.append(context.myClass.name);
        cil.append("::.ctor (");
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
            cil.append(String.format(".locals init (%s", locals.get(0)));
            for (int i = 1; i < locals.size(); i++) { //               |
                cil.append(String.format(", %s", locals.get(i))); // Here as well
            }
            cil.append(")\n");
        }

        cil.append(body.generateCode());
        cil.append("}\n");

        return cil.toString();
    }
}
