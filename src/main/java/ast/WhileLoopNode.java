package ast;

public class WhileLoopNode extends StatementNode {

    public ExpressionNode condition;
    public BodyNode body;

    public WhileLoopNode(ExpressionNode condition, BodyNode body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
