import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeBinomialCoefficientsTest {

    private int expected;
    private int n;
    private int m;

    @Test
    public void compute1() throws Exception {
        expected = 10;
        n = 5;
        m = 2;

        test(expected, n, m);
    }

    @Test
    public void compute2() throws Exception {
        expected = 850668;
        n = 42;
        m = 37;

        test(expected, n, m);
    }

    @Test
    public void compute3() throws Exception {
        expected = 245157;
        n = 23;
        m = 7;

        test(expected, n, m);
    }

    private void test(int expected, int n, int m) {
        assertEquals(expected, ComputeBinomialCoefficients.compute(n, m));
    }

}