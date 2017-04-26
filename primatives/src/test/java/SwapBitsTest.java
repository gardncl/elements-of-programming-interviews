import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapBitsTest {

    private long expected;
    private long x;
    private int i;
    private int j;

    @Test
    public void swapBits1() {
        expected = 7;
        x = 7;
        i = 0;
        j = 2;

        test(expected, x, i, j);
    }

    @Test
    public void swapBits2() {
        expected = 22;
        x = 7;
        i = 0;
        j = 4;

        test(expected, x, i, j);
    }

    @Test
    public void swapBits3() {
        expected = 1066;
        x = 1570;
        i = 3;
        j = 9;

        test(expected, x, i, j);
    }

    private void test(long expected, long x, int i, int j) {
        assertEquals(expected, SwapBits.swapBits(x, i, j));

    }


}