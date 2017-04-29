import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerSquareRootTest {

    private int expected;
    private int n;

    @Test
    public void squareRoot1() throws Exception {
        expected = 4;
        n = 4;

        test(expected, n);
    }

    @Test
    public void squareRoot2() throws Exception {
        expected = 10;
        n = 108;

        test(expected, n);
    }

    @Test
    public void squareRoot3() throws Exception {
        expected = 13;
        n = 185;

        test(expected, n);
    }

    private void test(int expected, int n) {
        assertEquals(expected, IntegerSquareRoot.squareRoot(n));
    }

}