package errors;

public class SemanticException extends Exception {
    String msg;
    String pos;

    public SemanticException(String msg, String pos) {
        this.msg = msg;
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "SemanticException{" +
                "msg='" + msg + '\'' +
                ", pos='" + pos + '\'' +
                '}';
    }
}
