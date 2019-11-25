package ast;

public class ReturnStatement extends StatementNode {

    public ExpressionNode returnVal;

    public ReturnStatement(ExpressionNode returnVal) {
        this.returnVal = returnVal;
    }

    @Override
    public String generateCode() {
        return null;
    }
}
