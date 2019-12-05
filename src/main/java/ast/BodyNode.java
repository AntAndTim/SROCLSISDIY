package ast;

import errors.SemanticException;
import utils.Pair;

import java.util.ArrayList;
import java.util.List;

public class BodyNode extends Node {

    public ArrayList<CommandNode> actions;
    public ArrayList<ActionType> actionTypes;

    public int maxStack;
    public List<Pair<String, String>> localInit;    // First -> type, second -> name

    enum ActionType {
        VARIABLE_DECLARATION,
        STATEMENT,
        EXPRESSION,
    }

    public BodyNode(ArrayList<Node> actions) {
//        this.actions = actions;
        this.actions = new ArrayList<CommandNode>();
        for (Node currAction : actions){
            this.actions.add((CommandNode)currAction);
        }
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
                // Vlad: throw an error I think
            }
        }
    }

    @Override
    public String generateCode() throws SemanticException {
        StringBuilder cil = new StringBuilder();

        // Processing actions
        for (int i = 0; i < actions.size(); i++) {
            Node action = actions.get(i);
            switch (actionTypes.get(i)) {
                case VARIABLE_DECLARATION:
                    cil.append(action.generateCode());
                    break;
                case EXPRESSION:
                    cil.append(action.generateCode());
                    break;
                case STATEMENT:
                    cil.append(action.generateCode());
                    break;
                default:
                    break;
            }
        }

        return cil.toString();
    }

    public int getLocalIndexByName(String name){
        return 0; // TODO
    }
}
