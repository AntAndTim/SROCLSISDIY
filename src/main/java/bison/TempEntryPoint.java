package bison;

import ast.ProgramNode;
import errors.SemanticException;
import semantic.SemanticAnalyzer;

import java.io.IOException;

public class TempEntryPoint {

    public static void main(String[] args) throws IOException, SemanticException {
        YYParser.Lexer lexer = new BisonLexer(TempEntryPoint.class.getClassLoader().getResourceAsStream("sample.o"));
        YYParser parser = new YYParser(lexer);
        parser.setDebugLevel(10);
        parser.parse();
        ProgramNode node = parser.root;
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.run(node);
        System.out.println("Completed");
        System.out.println(node.generateCode());
    }
}