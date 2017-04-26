import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputeDivisionTest {

    private long expected;
    private long x;
    private long y;

    @Test
    public void divide1() {
        expected = 5;
        x = 10;
        y = 2;

        test(expected, x, y);
    }

    @Test
    public void divide2() {
        expected = 17;
        x = 527;
        y = 31;

        test(expected, x, y);
    }

    private void test(long expected, long x, long y) {
        assertEquals(expected, ComputeDivision.divide(x,y));
    }

}