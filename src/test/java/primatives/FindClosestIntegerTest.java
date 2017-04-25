package primatives;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static primatives.FindClosestInteger.closestIntSameBitCount;

public class FindClosestIntegerTest {

    private long expected;
    private long x;

    @Test
    public void closestIntSameBitCount1() {
        expected = 209;
        x = 210;

        test(expected, x);
    }

    @Test
    public void closestIntSameBitCount2() {
        expected = -211;
        x = -210;

        test(expected, x);
    }

    @Test
    public void closestIntSameBitCount3() {
        expected = 23;
        x = 15;

        test(expected, x);
    }

    @Test
    public void closestIntSameBitCount4() {
        expected = -14;
        x = -15;

        test(expected, x);
    }

    private void test(long expected, long x) {
        assertEquals(expected, closestIntSameBitCount(x));
    }

}