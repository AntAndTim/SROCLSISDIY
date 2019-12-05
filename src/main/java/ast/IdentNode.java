package ast;

import errors.SemanticException;

public class IdentNode extends Node{

    public String value;

    public IdentNode(String value) {
        this.value = value;
    }

    @Override
    public String generateCode() throws SemanticException {
        return value;
    }
}
