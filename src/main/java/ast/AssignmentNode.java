package ast;


public class AssignmentNode extends StatementNode{

    public String varName;
    public ExpressionNode varValue;

    public AssignmentNode(IdentNode varNameId, ExpressionNode varValue) {
        this.varName = varNameId.value;
        this.varValue = varValue;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
