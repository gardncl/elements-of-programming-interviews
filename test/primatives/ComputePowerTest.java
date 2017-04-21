package primatives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static primatives.ComputePower.power;

class ComputePowerTest {

    private double expected;
    private double x;
    private int y;

    @Test
    void power1() {
        expected = 0;
        x = 0;
        y = 0;

        test(expected, x, y);
    }

    private void test(double expected, double x, int y) {
        assertEquals(expected, power(x,y));
    }

}