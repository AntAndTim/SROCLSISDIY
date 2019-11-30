package ast;

import utils.Pair;

import java.util.ArrayList;
import java.util.List;

public class BodyNode extends Node {

    public ArrayList<Node> actions;
    public ArrayList<ActionType> actionTypes;

    public int maxStack;
    public List<Pair<String, String>> localInit;    // First -> type, second -> name

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
            }
        }
    }

    @Override
    public String generateCode() {
        return null;
    }

    public int getLocalIndexByName(String name){
        return 0; // TODO
    }
}
