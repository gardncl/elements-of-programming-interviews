import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class NQueensTest {

    private List<List<Integer>> expected;
    private int n;


    @Test
    public void nQueens1() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(0)
        );
        n = 1;

        test(expected, n);
    }

    @Test
    public void nQueens2() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(0),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3)
        );
        n = 2;

        test(expected, n);
    }

    @Test
    public void nQueens3() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(0,5),
                Arrays.asList(0,7),
                Arrays.asList(2,3),
                Arrays.asList(2,7),
                Arrays.asList(6,1),
                Arrays.asList(6,5),
                Arrays.asList(8,1),
                Arrays.asList(8,3),
                Arrays.asList(0),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList(4),
                Arrays.asList(5),
                Arrays.asList(6),
                Arrays.asList(7),
                Arrays.asList(8)
        );
        n = 3;

        test(expected, n);
    }

    private void test(List<List<Integer>> expected, int n) {
        List<List<Integer>> result = NQueens.nQueens(n);
        assertEquals(expected.size(), result.size());
        result.forEach(i -> {
            Collections.sort(i);
            assertTrue(expected.remove(i));
        });
    }

}