import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputePowerTest {

    private final double EPSILON = .1;
    private double expected;
    private double x;
    private int y;

    @Test
    public void power1() {
        expected = 4;
        x = 2;
        y = 2;

        test(expected, x, y);
    }

    @Test
    public void power2() {
        expected = 783.11;
        x = 2.3;
        y = 8;

        test(expected, x, y);
    }

    @Test
    public void power4() {
        expected = 9;
        x = -3;
        y = 2;

        test(expected, x, y);
    }

    @Test
    public void power5() {
        expected = -27;
        x = -3;
        y = 3;

        test(expected, x, y);
    }

    private void test(double expected, double x, int y) {
        assertEquals(expected,ComputePower.power(x,y),EPSILON);
    }

}