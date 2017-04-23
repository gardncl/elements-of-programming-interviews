package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static arrays.SampleOfflineData.randomSampling;
import static org.junit.jupiter.api.Assertions.*;

class SampleOfflineDataTest {

    private int k;
    private List<Integer> input;

    @Test
    void randomSampling1() {
        k = 3;
        input = Arrays.asList(1, 2, 3, 4, 5);

        test(k, input);
    }

    @Test
    void randomSampling2() {
        k = 3;
        input = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);

        test(k, input);
    }

    @Test
    void randomSampling3() {
        k = 5;
        input = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);

        test(k, input);
    }

    private void test(int k, List<Integer> input) {
        final int end = input.size();
        final List<Integer> original = input.subList(end - k,end);
        randomSampling(k, input);
        final List<Integer> result = input.subList(end - k,end);
        assertNotEquals(original, result);
        assertEquals(end, input.size());
        for (Integer i : result) {
            assertTrue(input.contains(i));
            input.remove(i);
        }

    }

}