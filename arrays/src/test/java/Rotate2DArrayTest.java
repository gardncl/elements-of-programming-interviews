import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Rotate2DArrayTest {

    private List<List<Integer>> expected;
    private List<List<Integer>> matrix;


    @Test
    public void rotateMatix1() {
        expected = Arrays.asList(
                Arrays.asList(13,9,5,1),
                Arrays.asList(14,10,6,2),
                Arrays.asList(15,11,7,3),
                Arrays.asList(16,12,8,4)
        );
        matrix = Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(9,10,11,12),
                Arrays.asList(13,14,15,16)
        );

        test(expected, matrix);
    }

    private void test(List<List<Integer>> expected, List<List<Integer>> matrix) {
        assertEquals(expected, Rotate2DArray.rotateMatix(matrix));
    }

}