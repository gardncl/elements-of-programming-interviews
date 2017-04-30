import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LongestContainedIntervalTest {

    private int expected;
    private List<Integer> list;

    @Test
    public void longestSubarray1() throws Exception {
        expected = 6;
        list = Arrays.asList(3,-2,7,9,8,1,2,0,-1,5,8);

        test(expected, list);
    }

    @Test
    public void longestSubarray2() throws Exception {
        expected = 5;
        list = Arrays.asList(92,4,13,-47,1,78,79,80,3,101,2000,2,56,45,23,5);

        test(expected, list);
    }

    private void test(int expected, List<Integer> list) {
        assertEquals(expected, LongestContainedInterval.longestInterval(list));
    }
}