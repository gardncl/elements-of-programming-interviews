package primatives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static primatives.FindClosestInteger.closestIntSameBitCount;

class FindClosestIntegerTest {

    private long expected;
    private long x;

    @Test
    void closestIntSameBitCount1() {
        expected = 209;
        x = 210;

        test(expected, x);
    }

    @Test
    void closestIntSameBitCount2() {
        expected = -211;
        x = -210;

        test(expected, x);
    }

    @Test
    void closestIntSameBitCount3() {
        expected = 23;
        x = 15;

        test(expected, x);
    }

    @Test
    void closestIntSameBitCount4() {
        expected = -14;
        x = -15;

        test(expected, x);
    }

    private void test(long expected, long x) {
        assertEquals(expected, closestIntSameBitCount(x));
    }

}