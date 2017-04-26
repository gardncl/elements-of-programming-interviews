import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SampleOfflineDataTest {

    private int k;
    private List<Integer> input;

    @Test
    public void randomSampling1() {
        k = 3;
        input = Arrays.asList(1, 2, 3, 4, 5);

        test(k, input);
    }

    @Test
    public void randomSampling2() {
        k = 3;
        input = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);

        test(k, input);
    }

    @Test
    public void randomSampling3() {
        k = 5;
        input = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);

        test(k, input);
    }

    private void test(int k, List<Integer> input) {
        final int end = input.size();
        final List<Integer> original = input.subList(end - k,end);
        SampleOfflineData.randomSampling(k, input);
        final List<Integer> result = input.subList(end - k,end);
        assertNotEquals(original, result);
        assertEquals(end, input.size());
        for (Integer i : result) {
            assertTrue(input.contains(i));
            input.remove(i);
        }

    }

}