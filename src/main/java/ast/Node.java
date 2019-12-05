package ast;

import errors.SemanticException;

public abstract class Node {
    private Integer startLine;
    private Integer startOffset;
    private Integer endLine;
    private Integer endOffset;

    public String getStartPosition(){
        return startLine.toString() + " " + startOffset.toString();
    }

    public String getEndPosition(){
        if (endLine == null) {
            return "NULL";
        }
        return endLine.toString() + " " + endOffset.toString();
    }

    abstract public String generateCode();
}
