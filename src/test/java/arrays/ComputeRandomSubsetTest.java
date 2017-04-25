package arrays;

import org.junit.Test;

import java.util.List;

import static utils.StreamUtil.sequence;

import static arrays.ComputeRandomSubset.randomSubset;
import static org.junit.Assert.*;

public class ComputeRandomSubsetTest {

    private int n;
    private int k;

    @Test
    public void randomSubset1() {
        n = 5;
        k = 3;

        test(n, k);
    }

    @Test
    public void randomSubset2() {
        n = 50;
        k = 15;

        test(n, k);
    }

    @Test
    public void randomSubset3() {
        n = 500;
        k = 50;

        test(n, k);
    }

    private void test(int n, int k) {
        final List<Integer> sequence = sequence(n);
        final List<Integer> subset = randomSubset(n, k);
        assertNotEquals(sequence, subset);
        assertEquals(k, subset.size());
        for (Integer i : subset) {
            assertTrue(sequence.contains(i));
            sequence.remove(i);
        }
    }

}