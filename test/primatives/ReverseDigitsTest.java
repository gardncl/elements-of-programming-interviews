package primatives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static primatives.ReverseDigits.reverse;

class ReverseDigitsTest {

    private long expected;
    private int input;

    @Test
    void reverse1() {
        expected = 24;
        input = 42;

        test(expected, input);
    }

    @Test
    void reverse2() {
        expected = -413;
        input = -314;

        test(expected, input);
    }

    private void test(long expected, int x) {
        assertEquals(expected, reverse(x));
    }

}