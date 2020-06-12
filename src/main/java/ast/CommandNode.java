package ast;

import errors.SemanticException;
import semantic.MethodContext;

import java.util.ArrayList;

public abstract class CommandNode extends Node {

    public MethodContext context;
    public ArrayList<Integer> scopesList;

    public int getIndexByName(String name) throws SemanticException{
        return this.context.getIndexByName(name, this.scopesList);
    }

    public VariableDeclNode getVarDeclByName(String name) throws SemanticException{
        return this.context.getVarDeclByName(name, this.scopesList);
    }

    public void setContext(MethodContext context) {
        this.context = context;
        this.scopesList = new ArrayList<>(context.currentScopesList);
    }

    @Override
    public String generateCode() throws SemanticException {
        return "";
    }
}
