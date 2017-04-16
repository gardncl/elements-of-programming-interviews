package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static strings.BaseConversion.baseConversion;

class BaseConversionTest {

    private String expected;
    private String input;
    private int b1;
    private int b2;

    @Test
    void baseConversion1() {
        expected = "314F";
        input = "12623";
        b1 = 10;
        b2 = 16;

        test(expected, input, b1, b2);
    }

    @Test
    void baseConversion2() {
        expected = "2C996B726";
        input = "114152520463";
        b1 = 7;
        b2 = 13;

        test(expected, input, b1, b2);
    }

    @Test
    void baseConversion3() {
        expected = "111";
        input = "7";
        b1 = 10;
        b2 = 2;

        test(expected, input, b1, b2);
    }

    @Test
    void baseConversion4() {
        expected = "33CD";
        input = "10001100101001";
        b1 = 2;
        b2 = 14;

        test(expected, input, b1, b2);
    }

    private void test(String expected, String input, int b1, int b2) {
        assertEquals(expected, baseConversion(input, b1, b2));
    }


}