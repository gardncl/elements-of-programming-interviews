import org.junit.Test;

import static org.junit.Assert.*;

public class CountPossibleTraversalsTest {

    private int expected;
    private int n;
    private int m;

    @Test
    public void numberOfWays1() throws Exception {
        expected = 2;
        n = 2;
        m = 2;

        test(expected, n, m);
    }

    @Test
    public void numberOfWays2() throws Exception {
        expected = 3;
        n = 2;
        m = 3;

        test(expected, n, m);
    }

    @Test
    public void numberOfWays3() throws Exception {
        expected = 20;
        n = 3;
        m = 4;

        test(expected, n, m);
    }

    @Test
    public void numberOfWays4() throws Exception {
        expected = 35;
        n = 4;
        m = 5;

        test(expected, n, m);
    }

    @Test
    public void numberOfWays5() throws Exception {
        expected = 70;
        n = 5;
        m = 5;

        test(expected, n, m);
    }

    private void test(int expected, int n, int m) {
        assertEquals(expected, CountPossibleTraversals.numberOfWays(n, m));
    }

}