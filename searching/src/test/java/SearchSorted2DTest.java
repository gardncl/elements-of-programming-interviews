import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SearchSorted2DTest {

    private boolean expected;
    private List<List<Integer>> matrix;
    private int x;

    @Test
    public void search1() throws Exception {
        expected = false;
        matrix = Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(7,8,9,10),
                Arrays.asList(11,12,13,14)
        );
        x = 15;

        test(expected, matrix, x);
    }

    @Test
    public void search2() throws Exception {
        expected = true;
        matrix = Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(7,8,9,10),
                Arrays.asList(11,12,13,14)
        );
        x = 4;

        test(expected, matrix, x);
    }

    @Test
    public void search3() throws Exception {
        expected = true;
        matrix = Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(7,8,9,10),
                Arrays.asList(11,12,13,14)
        );
        x = 9;

        test(expected, matrix, x);
    }

    private void test(boolean expected, List<List<Integer>> matrix, int x) {
        assertEquals(expected, SearchSorted2D.search(matrix, x));
    }
}