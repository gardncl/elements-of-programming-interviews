package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static strings.StringSinusoidal.snakeString;

class StringSinusoidalTest {

    private String expected;
    private String input;

    @Test
    void snakeString1() {
        expected = "bacd";
        input = "abcd";

        test(expected, input);
    }

    @Test
    void snakeString2() {
        expected = "e lHloWrdlo!";
        input = "Hello World!";

        test(expected, input);
    }

    private void test(String expected, String input) {
        assertEquals(expected, snakeString(input));
    }


}