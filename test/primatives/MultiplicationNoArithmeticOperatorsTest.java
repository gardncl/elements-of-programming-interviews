package primatives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static primatives.MultiplicationNoArithmeticOperators.multiply;

class MultiplicationNoArithmeticOperatorsTest {

    private long expected;
    private long x;
    private long y;

    @Test
    void multiply1() {
        expected = 4;
        x = 2;
        y = 2;

        test(expected,x,y);
    }

    @Test
    void multiply2() {
        expected = 0;
        x = 2;
        y = 0;

        test(expected,x,y);
    }

    @Test
    void multiply3() {
        expected = 27;
        x = 9;
        y = 3;

        test(expected,x,y);
    }

    private void test(long expected, long x, long y) {
        assertEquals(expected, multiply(x, y));
    }

}