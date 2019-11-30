package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
                // Vlad: throw an error I think
            }
        }
    }

    @Override
    public String generateCode() {
        StringBuilder cil = new StringBuilder();
        HashMap<String, Integer> vars = new HashMap<>();
        // Declaring local variables
        // TODO: Apparently body nodes are not only in actual bodies but also in statements, move declarations
        int declarations = 0;
        for (int i = 0; i < actionTypes.size(); i++) {
            vars.put(((VariableDeclNode) actions.get(i)).name, declarations);
            if (actionTypes.get(i) == ActionType.VARIABLE_DECLARATION) declarations++;
        }
        if (declarations > 0) {
            cil.append(String.format(".maxstack %d\n", declarations));
            cil.append(".locals init (int32 a_0"); // TODO: REPLACE int32 WITH ACTUAL DATA TYPES
            for (int i = 1; i < declarations; i++) { //               |
                cil.append(String.format(", int32 a_%d", i)); // Here as well
            }
            cil.append(")\n");
        }

        // Processing actions
        for (int i = 0; i < actions.size(); i++) {
            Node action = actions.get(i);
            switch (actionTypes.get(i)) {
                case VARIABLE_DECLARATION:
                    cil.append(action.generateCode());

                    // TODO: This would look better in VariableDeclNode
                    int varId = vars.get(((VariableDeclNode) action).name);
                    cil.append(String.format("stloc.s %d\n", varId));

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
}
