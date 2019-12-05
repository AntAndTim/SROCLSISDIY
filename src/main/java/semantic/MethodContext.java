package semantic;

import ast.ClassDeclNode;
import ast.ParamsDeclNode;
import ast.VariableDeclNode;
import errors.SemanticException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MethodContext {

    // TODO : localinit, generics, class table
    public HashMap <String, VariableDeclNode> localVariables;
    public HashMap <String, Integer> variableIndexes;
    private HashMap <String, Integer> scope;
    public HashMap <String, Integer> generics;
    public ClassTable classTable;
    public ClassDeclNode myClass;
    public ArrayList<Integer> currentScopesList;

    int lastVariableIndex = -1;
    private int currScope = 0;

    public MethodContext(ClassDeclNode methodClass, ClassTable classTable) {
        this.localVariables = new HashMap<>();
        this.variableIndexes = new HashMap<>();
        this.scope = new HashMap<>();

        this.generics = new HashMap<>();
        this.classTable = classTable;
        this.myClass = methodClass;

        this.currentScopesList = new ArrayList<>();
        currentScopesList.add(0);

        // Updating generics with class generics
        for (int i=0;i<methodClass.generics.size();i++){
            this.generics.put(methodClass.generics.get(i), i);
        }

    }

    /**
     * Returns index in locals init or -1 there is no such name
     *
     * @param name
     * @param scopesList
     * @return
     * @throws SemanticException
     */
    public int getIndexByName(String name, ArrayList<Integer> scopesList) throws SemanticException{
        for (int i=scopesList.size()-1; i>=0; i--){
            String localVarName = String.format("%s_%d", name, scopesList.get(i));
            if (this.variableIndexes.containsKey(localVarName)){
                return this.variableIndexes.get(localVarName);
            }
        }
        throw new SemanticException(String.format("Variable %s is undefined", name), "-");
    }

    public VariableDeclNode getVarDeclByName(String name, ArrayList<Integer> scopesList) throws SemanticException{
        for (int i=scopesList.size()-1; i>=0; i--){
            String localVarName = String.format("%s_%d", name, scopesList.get(i));
            if (this.localVariables.containsKey(localVarName)){
                return this.localVariables.get(localVarName);
            }
        }
        throw new SemanticException(String.format("Variable %s is not defined, but passed to codegen", name), "-");
    }

    private boolean findVariable(String name){
        // The same code as the getIndexByName
        ArrayList<Integer> scopesList = this.currentScopesList;
        for (int i=scopesList.size()-1; i>=0; i--){
            String localVarName = String.format("%s_%d", name, scopesList.get(i));
            if (this.variableIndexes.containsKey(localVarName)){
                return true;
            }
        }
        return false;
    }

    public void addVariable(VariableDeclNode newVariable) throws SemanticException{
        // TODO
        // If there is a variable in the method, that was declared in if statement
        // and then declared in the main body, we should throw UnsupportedException
        // Need to make some tricky naming (or even not if variables are accessed by
        // indexes).
        if (findVariable(newVariable.name)){
            throw new SemanticException(String.format("Variable %s is already declared", newVariable.name), newVariable.getStartPosition());
        }

        this.lastVariableIndex++;

        // Add variable to the current scope
        this.scope.put(newVariable.name, currScope);

        // Add variable to the local init
        String localName = newVariable.name + "_" + Integer.toString(currScope);    // It has to have a unique name
        this.localVariables.put(localName, newVariable);
        this.variableIndexes.put(localName, this.lastVariableIndex);
    }

    public void addNewScope(){
        this.currScope += 1;
        this.currentScopesList.add(currScope);
    }

    public void killPreviousScope(){
        int removedScope = this.currentScopesList.remove(this.currentScopesList.size() - 1);
        ArrayList<String> namesToRemove = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : this.scope.entrySet()){
            if (entry.getValue() == removedScope){
                namesToRemove.add(entry.getKey());
            }
        }

        for (String name : namesToRemove){
            this.scope.remove(name);
        }
    }
}
