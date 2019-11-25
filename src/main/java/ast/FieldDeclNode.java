package ast;

public class FieldDeclNode extends Node {

    public String name;
    public ClassNameNode fieldType;

    public FieldDeclNode(IdentNode nameIdent, ClassNameNode fieldTypeNode) {
        this.name = nameIdent.value;
        this.fieldType = fieldTypeNode;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
