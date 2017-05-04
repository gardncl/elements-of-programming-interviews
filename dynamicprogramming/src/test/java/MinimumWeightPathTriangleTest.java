import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MinimumWeightPathTriangleTest {

    private int expected;
    private List<List<Integer>> triangle;

    @Test
    public void minimum1() throws Exception {
        expected = 15;
        triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(4,4),
                Arrays.asList(8,5,6),
                Arrays.asList(4,2,6,2),
                Arrays.asList(1,5,2,3,4)
        );

        test(expected, triangle);
    }

    @Test
    public void minimum2() throws Exception {
        expected = 20;
        triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(4,4),
                Arrays.asList(8,5,6),
                Arrays.asList(4,2,6,2),
                Arrays.asList(1,5,2,3,4),
                Arrays.asList(1,20,20,20,20)
        );

        test(expected, triangle);
    }

    private void test(int expected, List<List<Integer>> triangle){
        assertEquals(expected, MinimumWeightPathTriangle.minimum(triangle));
    }

}