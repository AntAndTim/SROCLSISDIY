package semantic;

import ast.*;
import bison.ParserWrapper;
import errors.SemanticException;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

public class SemanticAnalyzer {

    ClassTable classTable;
    final String predefinedClassesPath = "std.o";

    public void run(ProgramNode root) throws SemanticException {
        indexClasses(root);
        updateClassTable(root);
        updateMethodsContexts(root);

    }

    public void indexClasses(ProgramNode root) throws SemanticException {

        try {
            this.classTable = new ClassTable(ParserWrapper.parseProgram(this.predefinedClassesPath));
        } catch (IOException exp){
            throw new SemanticException("Can't load standard library", "-");
        }

        for (ClassDeclNode classDecl : root.programClasses){
            this.classTable.addClass(classDecl);
        }
    }

    /**
     * Update class table with the inherited parameters
     * @param root
     * @throws SemanticException
     */
    public void updateClassTable(ProgramNode root) throws SemanticException {
//        for (ClassDeclNode classDecl : root.programClasses){
        for (ClassDeclNode classDecl : this.classTable.table.values()){
            // Get methods to add
//            ClassDeclNode currParentNode = this.classTable.get(classDecl.parent);
            ClassDeclNode currParentNode = classDecl;
            while (currParentNode != null) {
                // Add missing methods
                for (MethodDeclNode parentMethod : currParentNode.methods) {
                    this.classTable.addMethod(classDecl.name, parentMethod);
                }
                for (ConstructorDeclNode parentConstructor : currParentNode.constructors){
                    this.classTable.addConstructor(classDecl.name, parentConstructor);
                }

                // Also add missing fields
                for (FieldDeclNode parentField : currParentNode.fields){
                    this.classTable.addField(classDecl.name, parentField);
                }
                currParentNode = this.classTable.table.get(currParentNode.parent);
            }

        }
    }

    public void updateMethodsContexts(ProgramNode root) throws SemanticException{
        for (ClassDeclNode currClass : root.programClasses){
            for (MethodDeclNode currMethod : currClass.methods){
                MethodContext currContext = new MethodContext(currClass, this.classTable);
                this.buildContext(currMethod.body, currContext);
                currMethod.context = currContext;
            }
            for (ConstructorDeclNode currCtor : currClass.constructors){
                MethodContext currContext = new MethodContext(currClass, this.classTable);
                this.buildContext(currCtor.body, currContext);
                currCtor.context = currContext;
            }
        }
    }

    private void buildContext(BodyNode body, MethodContext context) throws SemanticException{
        for (CommandNode command : body.actions){
            command.setContext(context);
            command.scopesList = new ArrayList<>(context.currentScopesList);
            if (command instanceof IfStatementNode){
                IfStatementNode statement = (IfStatementNode)command;
                statement.condition.setContext(context);
                context.addNewScope();
                buildContext(statement.trueBranch, context);
                context.killPreviousScope();
                context.addNewScope();
                buildContext(statement.falseBranch, context);
                context.killPreviousScope();
            } else if (command instanceof WhileLoopNode){
                WhileLoopNode statement = (WhileLoopNode) command;
                statement.condition.setContext(context);
                context.addNewScope();
                buildContext(statement.body, context);
                context.killPreviousScope();
            } else if (command instanceof AssignmentNode){
                AssignmentNode statement = (AssignmentNode) command;
                statement.varValue.setContext(context);
                this.checkExpression(statement.varValue, context);
            } else if (command instanceof ExpressionNode){
                this.checkExpression((ExpressionNode)command, context);
            } else if (command instanceof VariableDeclNode){
                ((VariableDeclNode) command).initialization.setContext(context);
                this.checkExpression(((VariableDeclNode) command).initialization, context);
                context.addVariable((VariableDeclNode)command);
            } else {
                throw new SemanticException("Undefined node type %s", command.getStartPosition());
            }
        }
    }

    public boolean checkExpression(ExpressionNode mainExpr, MethodContext context) throws SemanticException{
        for (ExpressionNode expr : mainExpr.getAllNestedExpressions()){
            if (expr.primary instanceof IdentNode) {
                // Just try to find this variable, it will throw semantic error if it is not defined
                context.getVarDeclByName(((IdentNode) expr.primary).value, context.currentScopesList);
            }
        }
        return true;
    }
}
