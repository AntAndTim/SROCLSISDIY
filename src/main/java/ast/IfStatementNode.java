package ast;

import errors.SemanticException;

public class IfStatementNode extends StatementNode {

    public ExpressionNode condition;
    public BodyNode trueBranch;
    public BodyNode falseBranch;

    public IfStatementNode(ExpressionNode condition, BodyNode trueBranch, BodyNode falseBranch) {
        this.condition = condition;
        this.trueBranch = trueBranch;
        this.falseBranch = falseBranch;
    }

    public IfStatementNode(ExpressionNode condition, BodyNode trueBranch) {
        this.condition = condition;
        this.trueBranch = trueBranch;
        this.falseBranch = null;
    }

    @Override
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        cil.append(condition.generateCode());
        // Skip the true branch and jump directly to false if condition is not true
        // TODO: Change FALSE to a global label that won't repeat
        cil.append("brfalse.s FALSE\n");
        cil.append(trueBranch.generateCode());
        cil.append("FALSE: ");
        if (falseBranch != null) cil.append(falseBranch.generateCode());
        else cil.append("nop\n");
        return cil.toString();
    }
}
