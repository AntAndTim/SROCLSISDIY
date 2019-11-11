import static junit.framework.TestCase.assertEquals;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;
import org.junit.Test;
import token.Token;
import token.type.Delimiter;

public class LexerTest {

    private String fileName;

    @Test
    public void test1() throws IOException {
        fileName = "test1";
        assertEquals(expectedResult(), obtainTokens());
    }

    @Test
    public void test2() throws IOException {
        fileName = "test2";
        assertEquals(expectedResult(), obtainTokens());
    }

    @Test
    public void test3() throws IOException {
        fileName = "test3";
        assertEquals(expectedResult(), obtainTokens());
    }

    @Test
    public void test4() throws IOException {
        fileName = "test4";
        assertEquals(expectedResult(), obtainTokens());
    }

    private String obtainTokens() throws IOException {
        Lexer lexer = new Lexer(
            LexerTest.class
                .getClassLoader()
                .getResourceAsStream(String.format("%s.js", fileName)));

        final StringBuilder res = new StringBuilder();
        while (true) {
            try {
                Token token = lexer.getToken();

                if (token.getType() != Delimiter.WHITESPACE) {
                    res.append(token).append("\n");
                }
            } catch (EOFException e) {
                break;
            }
        }
        System.out.println("Actual output:");
        System.out.println(res.toString());
        return res.toString();
    }

    private String expectedResult() throws IOException {
        InputStream fileStream = Objects.requireNonNull(
            LexerTest.class
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
}