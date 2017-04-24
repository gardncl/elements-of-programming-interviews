package arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static utils.StreamUtil.sequence;
import static arrays.ComputeRandomPermutation.computeRandomPermutation;
import static org.junit.jupiter.api.Assertions.*;

class ComputeRandomPermutationTest {

    private int n;

    @Test
    void computeRandomPermutation1() {
        n = 1;

        test(n);
    }

    @Test
    void computeRandomPermutation2() {
        n = 10;

        test(n);
    }

    @Test
    void computeRandomPermutation3() {
        n = 100;

        test(n);
    }

    private void test(int n) {
        final List<Integer> sequence = sequence(n);
        final List<Integer> result = computeRandomPermutation(n);
        assertNotEquals(sequence, result);
        assertEquals(sequence.size(), result.size());
        for (Integer i : sequence) {
            assertTrue(result.contains(i));
            result.remove(i);
        }
    }

}