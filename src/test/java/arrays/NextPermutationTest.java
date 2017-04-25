package arrays;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static arrays.NextPermutation.nextPermutation;
import static org.junit.Assert.assertEquals;

public class NextPermutationTest {

    private List<Integer> expected;
    private List<Integer> input;

    @Test
    public void nextPermutation1() {
        expected = Arrays.asList(1, 2, 0, 3);
        input = Arrays.asList(1, 0, 3, 2);

        test(expected, input);
    }

    @Test
    public void nextPermutation2() {
        expected = Arrays.asList();
        input = Arrays.asList(3, 2, 1, 0);

        test(expected, input);
    }

    @Test
    public void nextPermutation3() {
        expected = Arrays.asList(2, 1, 0);
        input = Arrays.asList(2, 0, 1);

        test(expected, input);
    }

    private void test(List<Integer> expected, List<Integer> input) {
        assertEquals(expected, nextPermutation(input));
    }

}