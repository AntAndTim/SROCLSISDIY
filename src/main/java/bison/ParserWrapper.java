package bison;

import ast.ProgramNode;

import java.io.IOException;

public class ParserWrapper {
//    YYParser parser;

    public static ProgramNode parseProgram(String inputFile) throws IOException{

        YYParser.Lexer lexer = new BisonLexer(ParserWrapper.class.getClassLoader().getResourceAsStream(inputFile));
        YYParser parser = new YYParser(lexer);
        parser.setDebugLevel(0);
        parser.parse();
        ProgramNode node = parser.root;

        return node;
    }
}
