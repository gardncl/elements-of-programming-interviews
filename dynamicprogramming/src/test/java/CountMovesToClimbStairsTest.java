import org.junit.Test;

import static org.junit.Assert.*;

public class CountMovesToClimbStairsTest {

    private int expected;
    private int top;
    private int maximumStep;

    @Test
    public void numberOfWays1() throws Exception {
        expected = 5;
        top = 4;
        maximumStep = 2;

        test(expected, top, maximumStep);
    }

    @Test
    public void numberOfWays2() throws Exception {
        expected = 12;
        top = 5;
        maximumStep = 3;

        test(expected, top, maximumStep);
    }

    private void test(int expected, int top, int maximumStep) {
        assertEquals(expected, CountMovesToClimbStairs.numberOfWays(top, maximumStep));
    }

}