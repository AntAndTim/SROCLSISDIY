package ast;

import errors.SemanticException;

public abstract class Node {
    private Integer startLine =0;
    private Integer startOffset =0;
    private Integer endLine= 0;
    private Integer endOffset= 0;

    public String getStartPosition(){
        return startLine.toString() + " " + startOffset.toString();
    }

    public String getEndPosition(){
        if (endLine == null) {
            return "NULL";
        }
        return endLine.toString() + " " + endOffset.toString();
    }

    abstract public String generateCode() throws SemanticException;
}
