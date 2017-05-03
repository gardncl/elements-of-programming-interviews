import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class GenerateSubsetsKTest {

    private List<List<Integer>> expected;
    private int n;
    private int k;

    @Test
    public void combinations1() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(1,3),
                Arrays.asList( 2,3)
        );
        n = 3;
        k = 2;

        test(expected, n, k);
    }

    @Test
    public void combinations2() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(1,2,4),
                Arrays.asList(1,3,4),
                Arrays.asList(2,3,4)
        );
        n = 4;
        k = 3;

        test(expected, n, k);
    }

    @Test
    public void combinations3() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(1,3),
                Arrays.asList(1,4),
                Arrays.asList(1,5),
                Arrays.asList(2,3),
                Arrays.asList(2,4),
                Arrays.asList(2,5),
                Arrays.asList(3,4),
                Arrays.asList(3,5),
                Arrays.asList(4,5)
        );
        n = 5;
        k = 2;

        test(expected, n, k);
    }

    private void test(List<List<Integer>> expected, int n, int k) {
        List<List<Integer>> result = GenerateSubsetsK.combinations(n,k);
        assertEquals(expected.size(), result.size());
        result.forEach(i -> {
            Collections.sort(i);
            assertTrue(expected.remove(i));
        });
    }

}