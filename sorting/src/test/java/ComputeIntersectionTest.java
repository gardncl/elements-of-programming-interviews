import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeIntersectionTest {

    private List<Integer> expected;
    private List<Integer> A;
    private List<Integer> B;

    @Test
    public void intersection1() throws Exception {
        expected = Arrays.asList(1,2,3,4,5,6);
        A = Arrays.asList(1,3,5);
        B = Arrays.asList(2,4,6);

        test(expected,A,B);
    }

    @Test
    public void intersection2() throws Exception {
        expected = Arrays.asList(1,2,3,4,5,6);
        A = Arrays.asList(1,3,5,5,5,7);
        B = Arrays.asList(2,4,5,5,6);

        test(expected,A,B);
    }

    @Test
    public void intersection3() throws Exception {
        expected = Arrays.asList(1);
        A = Arrays.asList(1,1,1,1);
        B = Arrays.asList(1,1,1,1);

        test(expected,A,B);
    }

    private void test(List<Integer> expected, List<Integer> A, List<Integer> B) {
        AssertUtils.assertSameContentsInt(expected, ComputeIntersection.intersection(A,B));
    }

}