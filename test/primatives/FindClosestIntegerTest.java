package primatives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static primatives.FindClosestInteger.closestIntSameBitCount;

class FindClosestIntegerTest {

    private long expected;
    private long x;

    @Test
    void closestIntSameBitCount1() {
        expected = 0;
        x = 0;

        test(expected, x);
    }

    private void test(long expected, long x) {
        assertEquals(expected, closestIntSameBitCount(x));
    }

}