import org.junit.Test;

import static org.junit.Assert.*;

public class RealSquareRootTest {

    private final double EPSILON = .01;

    private double x;

    @Test
    public void squareRoot1() throws Exception {
        x = 2.3;

        test(x);
    }

    @Test
    public void squareRoot3() throws Exception {
        x = 534234.948;

        test(x);
    }

    @Test
    public void squareRoot4() throws Exception {
        x = 100000;

        test(x);
    }

    private void test(double x) {
        assertEquals(Math.sqrt(x), RealSquareRoot.squareRoot(x),EPSILON);
    }

}