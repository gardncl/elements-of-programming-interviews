package arrays;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static arrays.ComputeSpiralOrdering.matrixInSpiralOrder;
import static org.junit.Assert.assertEquals;

public class ComputeSpiralOrderingTest {

    private List<Integer> expected;
    private List<List<Integer>> matrix;

    @Test
    public void matrixInSpiralOrder1() {
        expected = Arrays.asList(1,2,3,6,9,8,7,4,5);
        matrix = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        test(expected, matrix);
    }

    @Test
    public void matrixInSpiralOrder2() {
        expected = Arrays.asList(1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10);
        matrix = Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(9,10,11,12),
                Arrays.asList(13,14,15,16)
        );

        test(expected, matrix);
    }

    private void test(List<Integer> expected, List<List<Integer>> matrix) {
        assertEquals(expected, matrixInSpiralOrder(matrix));
    }

}