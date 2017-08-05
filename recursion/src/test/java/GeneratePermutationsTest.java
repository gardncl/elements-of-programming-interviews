import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratePermutationsTest {

    private List<List<Integer>> expected;
    private List<Integer> A;

    @Test
    public void permutations1() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(2)
        );
        A = Arrays.asList(2);

        test(expected, A);
    }

    @Test
    public void permutations2() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(2,3),
                Arrays.asList(3,2)
        );
        A = Arrays.asList(2,3);

        test(expected, A);
    }

    @Test
    public void permutations3() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(2,3,5),
                Arrays.asList(2,5,3),

                Arrays.asList(3,2,5),
                Arrays.asList(3,5,2),

                Arrays.asList(5,2,3),
                Arrays.asList(5,3,2)
        );
        A = Arrays.asList(2,3,5);

        test(expected, A);
    }

    @Test
    public void permutations4() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(2,3,5,7),
                Arrays.asList(2,3,7,5),
                Arrays.asList(2,5,3,7),
                Arrays.asList(2,5,7,3),
                Arrays.asList(2,7,3,5),
                Arrays.asList(2,7,5,3),

                Arrays.asList(3,2,5,7),
                Arrays.asList(3,2,7,5),
                Arrays.asList(3,5,2,7),
                Arrays.asList(3,5,7,2),
                Arrays.asList(3,7,2,5),
                Arrays.asList(3,7,5,2),

                Arrays.asList(5,2,3,7),
                Arrays.asList(5,2,7,3),
                Arrays.asList(5,3,2,7),
                Arrays.asList(5,3,7,2),
                Arrays.asList(5,7,2,3),
                Arrays.asList(5,7,3,2),

                Arrays.asList(7,2,5,3),
                Arrays.asList(7,2,3,5),
                Arrays.asList(7,3,2,5),
                Arrays.asList(7,3,5,2),
                Arrays.asList(7,5,3,2),
                Arrays.asList(7,5,2,3)
        );
        A = Arrays.asList(2,3,5,7);

        test(expected, A);
    }

    private void test(List<List<Integer>> expected, List<Integer> A) {
        List<List<Integer>> result = GeneratePermutations.permutations(A);
        assertEquals(expected.size(), result.size());
        expected.forEach(i -> {
            assertTrue(result.remove(i));
        });
    }

}