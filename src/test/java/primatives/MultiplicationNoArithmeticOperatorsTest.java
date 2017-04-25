package primatives;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static primatives.MultiplicationNoArithmeticOperators.multiply;

public class MultiplicationNoArithmeticOperatorsTest {

    private long expected;
    private long x;
    private long y;

    @Test
    public void multiply1() {
        expected = 4;
        x = 2;
        y = 2;

        test(expected,x,y);
    }

    @Test
    public void multiply2() {
        expected = 0;
        x = 2;
        y = 0;

        test(expected,x,y);
    }

    @Test
    public void multiply3() {
        expected = 27;
        x = 9;
        y = 3;

        test(expected,x,y);
    }

    private void test(long expected, long x, long y) {
        assertEquals(expected, multiply(x, y));
    }

}