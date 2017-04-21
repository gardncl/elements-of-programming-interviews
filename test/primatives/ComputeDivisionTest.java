package primatives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static primatives.ComputeDivision.divide;
import static primatives.ComputePower.power;

class ComputeDivisionTest {

    private long expected;
    private long x;
    private long y;

    @Test
    void divide1() {
        expected = 0;
        x = 0;
        y = 0;

        test(expected, x, y);
    }

    private void test(long expected, long x, long y) {
        assertEquals(expected, divide(x,y));
    }

}