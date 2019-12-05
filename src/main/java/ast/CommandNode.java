package ast;

import semantic.ClassTable;
import semantic.MethodContext;

public abstract class CommandNode extends Node {

    public MethodContext context;

    public void setContext(MethodContext context) {
        this.context = context;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
