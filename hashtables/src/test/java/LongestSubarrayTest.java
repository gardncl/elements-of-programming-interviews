import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LongestSubarrayTest {

    private int expected;
    private List<Integer> list;

    @Test
    public void longestSubarray1() throws Exception {
        expected = 5;
        list = Arrays.asList(1,2,3,4,5);

        test(expected, list);
    }

    @Test
    public void longestSubarray2() throws Exception {
        expected = 5;
        list = Arrays.asList(7,1,8,7,9,3,4,1,2,3,4,5,3,7,2,9);

        test(expected, list);
    }

    private void test(int expected, List<Integer> list) {
        assertEquals(expected, LongestSubarray.longestSubarray(list));
    }

}