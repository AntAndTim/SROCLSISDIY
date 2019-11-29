package ast;

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
    public String generateCode() {
        return null;
    }
}
