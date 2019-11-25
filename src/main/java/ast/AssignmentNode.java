package ast;

import java.beans.Expression;

public class AssignmentNode extends StatementNode{

    public String varName;
    public Expression varValue;

    public AssignmentNode(IdentNode varNameId, Expression varValue) {
        this.varName = varNameId.value;
        this.varValue = varValue;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
