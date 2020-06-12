package ast;

public abstract class LiteralNode extends Node {
    abstract public String getTypeName();
    abstract public String getValue();
}
