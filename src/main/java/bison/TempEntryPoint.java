package bison;

import ast.ProgramNode;

import java.io.IOException;

public class TempEntryPoint {

    public static void main(String[] args) throws IOException {
        YYParser.Lexer lexer = new BisonLexer(TempEntryPoint.class.getClassLoader().getResourceAsStream("parserTest.o"));
        YYParser parser = new YYParser(lexer);
        parser.setDebugLevel(0);
        parser.parse();
        ProgramNode node = parser.root;
    }
}