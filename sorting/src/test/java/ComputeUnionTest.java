import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeUnionTest {

    private List<ComputeUnion.Interval> expected;
    private List<ComputeUnion.Interval> intervals;

    @Test
    public void unionOfIntervals1() throws Exception {
        expected = Arrays.asList(
                new ComputeUnion.Interval(0,false,4,true),
                new ComputeUnion.Interval(5,true,11,true),
                new ComputeUnion.Interval(12,true,17,false)
        );
        intervals = Arrays.asList(
                new ComputeUnion.Interval(0,false,3,false),
                new ComputeUnion.Interval(1,true,1,true),
                new ComputeUnion.Interval(2,true,4,true),
                new ComputeUnion.Interval(3,true,4,false),
                new ComputeUnion.Interval(5,true,7,false),
                new ComputeUnion.Interval(7,true,8,false),
                new ComputeUnion.Interval(8,true,11,false),
                new ComputeUnion.Interval(9,false,11,true),
                new ComputeUnion.Interval(12,true,14,true),
                new ComputeUnion.Interval(12,false,16,true),
                new ComputeUnion.Interval(13,false,15,false),
                new ComputeUnion.Interval(16,false,17,false)
        );

        test(expected, intervals);
    }

    private void test(List<ComputeUnion.Interval> expected, List<ComputeUnion.Interval> intervals) {
        assertEquals(expected, ComputeUnion.unionOfIntervals(intervals));
    }

}