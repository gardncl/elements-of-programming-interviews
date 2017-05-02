import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ClosestEntriesTest {

    private int expected;
    private List<List<Integer>> sortedArrays;

    @Test
    public void findMin1() throws Exception {
        expected = 1;
        sortedArrays = Arrays.asList(
                Arrays.asList(5,10,15),
                Arrays.asList(3,6,9,12,15),
                Arrays.asList(8,16,24)
        );

        test(expected, sortedArrays);
    }

    @Test
    public void findMin2() throws Exception {
        expected = 7;
        sortedArrays = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(3,5,7,9),
                Arrays.asList(9,10,11)
        );

        test(expected, sortedArrays);
    }

    private void test(int expected, List<List<Integer>> sortedArrays) {
        assertEquals(expected, ClosestEntries.findMin(sortedArrays));
    }

}