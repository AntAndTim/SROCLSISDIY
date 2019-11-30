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
        StringBuilder cil = new StringBuilder();
        cil.append(".field public ");
        cil.append(fieldType);
        cil.append(" ");
        cil.append(name);
        cil.append("\n");

        return cil.toString();
    }
}
