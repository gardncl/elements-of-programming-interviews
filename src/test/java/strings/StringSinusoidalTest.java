package strings;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static strings.StringSinusoidal.snakeString;

public class StringSinusoidalTest {

    private String expected;
    private String input;

    @Test
    public void snakeString1() {
        expected = "bacd";
        input = "abcd";

        test(expected, input);
    }

    @Test
    public void snakeString2() {
        expected = "e lHloWrdlo!";
        input = "Hello World!";

        test(expected, input);
    }

    private void test(String expected, String input) {
        assertEquals(expected, snakeString(input));
    }


}