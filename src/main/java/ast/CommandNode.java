package ast;

import semantic.ClassTable;
import semantic.MethodContext;

import java.util.ArrayList;
import java.util.Map;

public abstract class CommandNode extends Node {

    public MethodContext context;
    public ArrayList<Integer> scopesList;

    private int getIndexByName(String name){
        return this.context.getIndexByName(name, this.scopesList);
    }

    private ArrayList<String> getLocalsInit(){
        for (Map.Entry<String, Integer> entry : this.context.variableIndexes.entrySet()){
            String name = entry.getKey();
            String index = entry.getValue().toString();
            String type = this.context.localVariables.get(name).initialization.getType();
        }
        return null;
    }

    public void setContext(MethodContext context) {
        this.context = context;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
