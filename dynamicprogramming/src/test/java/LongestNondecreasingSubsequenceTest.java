import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LongestNondecreasingSubsequenceTest {

    private int expected;
    private List<Integer> A;

    @Test
    public void compute1() throws Exception {
        expected = 4;
        A = Arrays.asList(0,8,4,12,2,10,6,14,1,9);

        test(expected, A);
    }

    @Test
    public void compute2() throws Exception {
        expected = 5;
        A = Arrays.asList(0,8,4,12,2,10,6,14,1,14);

        test(expected, A);
    }

    @Test
    public void compute3() throws Exception {
        expected = 4;
        A = Arrays.asList(0,8,4,12,2,15,6,14,1,9);

        test(expected, A);
    }

    private void test(int expected, List<Integer> A) {
        assertEquals(expected, LongestNondecreasingSubsequence.compute(A));
    }

}