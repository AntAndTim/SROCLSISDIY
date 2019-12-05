package semantic;

import ast.*;
import errors.SemanticException;

import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class SemanticAnalyzer {

    ClassTable classTable;
    final String predefinedClassesPath = "std.txt";

    public void run(ProgramNode root) throws SemanticException {
        indexClasses(root);
        updateClassTable(root);
        updateMethodsContexts(root);

    }

    public void indexClasses(ProgramNode root) throws SemanticException {

        this.classTable = new ClassTable(new ProgramNode(new ArrayList<>()));
        // TODO : Add parsing of standard library
//        this.classTable = new ClassTable();

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
        for (ClassDeclNode classDecl : root.programClasses){
            // Get methods to add
            ClassDeclNode currParentNode = this.classTable.get(classDecl.parent);
            while (currParentNode != null) {
                // Add missing methods
                for (MethodDeclNode parentMethod : currParentNode.methods) {
                    classTable.addMethod(classDecl.name, parentMethod);
//                    ArrayList<MethodDeclNode> classMethods = classDecl.getMethod(parentMethod.name);
//                    // Add method if it is not present or if it has different signature from existing ones
//                    if (classMethods.size() == 0){
////                        classDecl.methods.add(parentMethod);
//                        classTable.addMethod(classDecl.name, parentMethod);
//                    } else {
//                        // check if there is a method with the same signature
//                        boolean addParentMethod = true;
//                        for (MethodDeclNode currMethod : classMethods){
//                            if (currMethod.compareSignature(parentMethod)){
//                                addParentMethod = false;
//                            }
//                        }
//                        if (addParentMethod) {
////                            classDecl.methods.add(parentMethod);
//                            classTable.addMethod(classDecl.name, parentMethod);
//                        }
//                    }
                }
                for (ConstructorDeclNode parentConstructor : currParentNode.constructors){
//                    if parentConstructor
                     this.classTable.addConstructor(classDecl.name, parentConstructor);
                }

                // Also add missing fields
                for (FieldDeclNode parentField : currParentNode.fields){
                    for (FieldDeclNode currClassField: classDecl.fields){
                        if (currClassField.name == parentField.name){
                            throw new SemanticException(String.format("Field %s is already declared in parent", currClassField.name), currClassField.getStartPosition());
                        }
                    }
//                    classDecl.fields.add(parentField);
                    this.classTable.addField(classDecl.name, parentField);
                }
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
                context.addNewScope();
                buildContext(statement.trueBranch, context);
                context.killPreviousScope();
                context.addNewScope();
                buildContext(statement.falseBranch, context);
                context.killPreviousScope();
            } else if (command instanceof WhileLoopNode){
                WhileLoopNode statement = (WhileLoopNode) command;
                context.addNewScope();
                buildContext(statement.body, context);
                context.killPreviousScope();
            } else if (command instanceof AssignmentNode){
                AssignmentNode statement = (AssignmentNode) command;
                this.checkExpression(statement.varValue, context);
            } else if (command instanceof ExpressionNode){
                this.checkExpression((ExpressionNode)command, context);
            } else if (command instanceof VariableDeclNode){
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
