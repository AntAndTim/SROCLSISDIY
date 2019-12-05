package ast;

import errors.SemanticException;

public class WhileLoopNode extends StatementNode {

    public ExpressionNode condition;
    public BodyNode body;

    public WhileLoopNode(ExpressionNode condition, BodyNode body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();
        cil.append("WHILE_START: nop\n");
        cil.append(condition.generateCode());
        cil.append("brtrue.s WHILE_END\n");
        cil.append(body.generateCode());
        cil.append("br.s WHILE_START\n");
        cil.append("WHILE_END: nop\n");
        return cil.toString();
    }
}
