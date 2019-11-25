package ast;

public class MemberDeclNode extends Node {

    public Node declaration;
    public memberType declType;

    enum memberType {
        FIELD,
        METHOD,
        CONSTRUCTOR,
    }

    @Override
    public String generateCode() {
        if (declType == memberType.METHOD){
            MethodDeclNode method = (MethodDeclNode)this.declaration;
        }

        return null;
    }
}
