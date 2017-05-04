import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SearchSequence2DTest {

    private boolean expected;
    private List<List<Integer>> grid;
    private List<Integer> pattern;

    @Test
    public void isContained1() throws Exception {
        expected = true;
        grid = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );
        pattern = Arrays.asList(1,3,4,6);

        test(expected, grid, pattern);
    }

    @Test
    public void isContained2() throws Exception {
        expected = false;
        grid = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );
        pattern = Arrays.asList(1,2,3,6,8,7);

        test(expected, grid, pattern);
    }

    @Test
    public void isContained3() throws Exception {
        expected = true;
        grid = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );
        pattern = Arrays.asList(1,2,5,4,7,8,9,6,3,2,5,4,1);

        test(expected, grid, pattern);
    }

    private void test(boolean expected, List<List<Integer>> grid, List<Integer> pattern) {
        assertEquals(expected, SearchSequence2D.isContained(grid,pattern));
    }

}