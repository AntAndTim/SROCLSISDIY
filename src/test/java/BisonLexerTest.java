import static junit.framework.TestCase.assertEquals;

import bison.BisonLexer;
import bison.Token;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;
import org.junit.Test;

public class BisonLexerTest {

    private String fileName;

    @Test
    public void test1() throws IOException {
        fileName = "test1";
        assertEquals(expectedResult(), obtainTokens());
    }

    private String expectedResult() throws IOException {
        InputStream fileStream = Objects.requireNonNull(
            BisonLexerTest.class
                .getClassLoader()
                .getResource(String.format("results/%s", fileName)))
            .openStream();

        StringBuilder res = new StringBuilder();
        Scanner scanner = new Scanner(fileStream);
        while (scanner.hasNextLine()) {
            res.append(scanner.nextLine()).append("\n");
        }

        System.out.println("Expected output:");
        System.out.println(res.toString());
        return res.toString();
    }

    private String obtainTokens() throws IOException {
        BisonLexer bisonLexer = new BisonLexer(
            BisonLexerTest.class
                .getClassLoader()
                .getResourceAsStream(String.format("%s.o", fileName)));

        final StringBuilder res = new StringBuilder();
        int yylex = 0;
        do {
            yylex = bisonLexer.yylex();
            Token token = bisonLexer.getLVal();

            if (token == null) {
                break;
            }
            if (!token.getType().getName().equals(" ")) {
                res.append(token).append("\n");
            }
        } while (yylex != -1);
        System.out.println("Actual output:");
        System.out.println(res.toString());
        return res.toString();
    }
}