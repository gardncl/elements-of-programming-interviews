import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

import static org.junit.Assert.*;

public class SortAlmostSortedTest {

    private Iterator<Integer> expected;
    private Iterator<Integer> sequence;
    private int k;

    @Test
    public void sort1() throws Exception {
        expected = Arrays.asList(1,2,3,4,5,6,7,8,9).iterator();
        sequence = Arrays.asList(1,4,7,2,5,8,3,6,9).iterator();
        k = 2;

        test(expected, sequence, k);
    }

    @Test
    public void sort2() throws Exception {
        expected = Arrays.asList(-1,2,3,4,5,6,8).iterator();
        sequence = Arrays.asList(3,-1,2,6,4,5,8).iterator();
        k = 2;

        test(expected, sequence, k);
    }

    private void test(Iterator<Integer> expected, Iterator<Integer> sequence, int k) {
        SortAlmostSorted.sort(sequence, k);
        assertEquals(expected, sequence);
    }

}