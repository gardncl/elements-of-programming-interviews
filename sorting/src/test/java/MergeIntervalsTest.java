import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MergeIntervalsTest {

    private List<Tuple> expected;
    private List<Tuple> disjoint;
    private Tuple newInterval;

    @Test
    public void addInterval1() throws Exception {
        expected = Arrays.asList(
                new Tuple(-4,-1),
                new Tuple(0,9),
                new Tuple(11,12),
                new Tuple(14,17)
        );
        disjoint = Arrays.asList(
                new Tuple(-4,-1),
                new Tuple(0,2),
                new Tuple(3,6),
                new Tuple(7,9),
                new Tuple(11,12),
                new Tuple(14,17)
        );
        newInterval = new Tuple(1,8);

        test(expected, disjoint, newInterval);
    }

    @Test
    public void addInterval2() throws Exception {
        expected = Arrays.asList(
                new Tuple(-6,-1),
                new Tuple(0,2),
                new Tuple(3,6),
                new Tuple(7,9),
                new Tuple(11,12),
                new Tuple(14,17)
        );
        disjoint = Arrays.asList(
                new Tuple(-4,-1),
                new Tuple(0,2),
                new Tuple(3,6),
                new Tuple(7,9),
                new Tuple(11,12),
                new Tuple(14,17)
        );
        newInterval = new Tuple(-6,-1);

        test(expected, disjoint, newInterval);
    }

    @Test
    public void addInterval3() throws Exception {
        expected = Arrays.asList(
                new Tuple(-4,-1),
                new Tuple(0,2),
                new Tuple(3,6),
                new Tuple(7,10),
                new Tuple(11,12),
                new Tuple(14,17)
        );
        disjoint = Arrays.asList(
                new Tuple(-4,-1),
                new Tuple(0,2),
                new Tuple(3,6),
                new Tuple(7,9),
                new Tuple(11,12),
                new Tuple(14,17)
        );
        newInterval = new Tuple(8,10);

        test(expected, disjoint, newInterval);
    }

    private void test(List<Tuple> expected, List<Tuple> disjoint, Tuple newInterval) {
        assertEquals(expected, MergeIntervals.addInterval(disjoint, newInterval));
    }
}