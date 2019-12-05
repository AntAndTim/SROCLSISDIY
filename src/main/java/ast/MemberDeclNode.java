package ast;

import errors.SemanticException;

public class MemberDeclNode extends Node {

    public Node declaration;
    public memberType declType;

    public enum memberType {
        FIELD,
        METHOD,
        CONSTRUCTOR,
    }

    @Override
    public String generateCode() throws SemanticException {
        if (declType == memberType.METHOD){
            MethodDeclNode method = (MethodDeclNode)this.declaration;
        }

        return null;
    }
}
