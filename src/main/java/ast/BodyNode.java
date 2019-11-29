package ast;

import java.util.ArrayList;

public class BodyNode extends Node {

    public ArrayList<Node> actions;
    public ArrayList<ActionType> actionTypes;

    enum ActionType {
        VARIABLE_DECLARATION,
        STATEMENT,
        EXPRESSION,
    }

    public BodyNode(ArrayList<Node> actions) {
        this.actions = actions;
        this.actionTypes = new ArrayList<>();
        for (Node act : actions){
            if (act instanceof VariableDeclNode){
                actionTypes.add(ActionType.VARIABLE_DECLARATION);
            } else if (act instanceof StatementNode) {
                actionTypes.add(ActionType.STATEMENT);
            } else if (act instanceof ExpressionNode) {
                actionTypes.add(ActionType.EXPRESSION);
            } else {
                // TODO : What to do here?
                // Vlad: throw error I think
            }
        }
    }

    @Override
    public String generateCode() {
        return null;
    }
}
