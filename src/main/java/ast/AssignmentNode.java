package ast;


import errors.SemanticException;

public class AssignmentNode extends StatementNode{

    public String varName;
    public ExpressionNode varValue;

    public AssignmentNode(IdentNode varNameId, ExpressionNode varValue) {
        this.varName = varNameId.value;
        this.varValue = varValue;
    }

    @Override
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        if (context.classTable.checkIfParentOf(varValue.getType(), "AnyValue")){
            return "";
            // TODO
        } else {
            cil.append(varValue.generateCode());
            for (int i = 0; i < context.myClass.fields.size(); i++) {
                FieldDeclNode field = context.myClass.fields.get(i);
                if (varName.equals(field.name)) { // it's a field
                    cil.append(String.format("stfld %s::'%s'\n", context.myClass.name, varName));
                    return cil.toString();
                }
            }
            int index = getIndexByName(varName);
            cil.append(String.format("stloc.s %d\n", index));
            return cil.toString();
        }
    }
}
