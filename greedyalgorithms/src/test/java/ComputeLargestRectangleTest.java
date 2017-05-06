import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeLargestRectangleTest {

    private int expected;
    private List<Integer> heights;

    @Test
    public void calculateLargestRectangle1() throws Exception {
        expected = 20;
        heights = Arrays.asList(
                0,1,4,2,5,6,3,2,6,6,5,2,1,3
        );

        test(expected, heights);
    }

    private void test(int expected, List<Integer> heights) {
        assertEquals(expected, ComputeLargestRectangle.calculateLargestRectangle(heights));
    }

}