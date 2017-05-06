import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IntervalCoveringProblemTest {

    private List<Integer> expected;
    private List<Tuple> intervals;

    @Test
    public void findMinimumVisits1() throws Exception {
        expected = Arrays.asList(3,6);
        intervals = Arrays.asList(
                new Tuple(0,3),
                new Tuple(2,6),
                new Tuple(3,4),
                new Tuple(6,9)
        );

        test(expected, intervals);
    }

    @Test
    public void findMinimumVisits2() throws Exception {
        expected = Arrays.asList(3,7);
        intervals = Arrays.asList(
                new Tuple(0,3),
                new Tuple(2,6),
                new Tuple(3,4),
                new Tuple(7,9)
        );

        test(expected, intervals);
    }

    @Test
    public void findMinimumVisits3() throws Exception {
        expected = Arrays.asList(0,4,7);
        intervals = Arrays.asList(
                new Tuple(0,3),
                new Tuple(4,6),
                new Tuple(7,9)
        );

        test(expected, intervals);
    }

    private void test(List<Integer> expected, List<Tuple> intervals) {
        AssertUtils.assertSameContentsInt(expected, IntervalCoveringProblem.findMinimumVisits(intervals));
    }

}