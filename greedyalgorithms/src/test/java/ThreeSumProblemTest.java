import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumProblemTest {

    private boolean expected;
    private List<Integer> A;
    private int t;

    @Test
    public void hasThreeSum1() throws Exception {
        expected = true;
        A = Arrays.asList(11,2,5,7,3);
        t = 21;

        test(expected, A, t);
    }

    @Test
    public void hasThreeSum2() throws Exception {
        expected = true;
        A = Arrays.asList(2,7);
        t = 20;

        test(expected, A, t);
    }

    @Test
    public void hasThreeSum3() throws Exception {
        expected = false;
        A = Arrays.asList(2,7);
        t = 19;

        test(expected, A, t);
    }

    private void test(boolean expected, List<Integer> A, int t) {
        assertEquals(expected, ThreeSumProblem.hasThreeSum(A, t));
    }

}