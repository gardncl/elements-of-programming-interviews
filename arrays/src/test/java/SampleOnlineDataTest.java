import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SampleOnlineDataTest {

    private int k;
    private List<Integer> input;

    @Test
    public void runningSample1() {
        k = 3;
        input = Arrays.asList(1, 2, 3, 4, 5);

        test(k, input);
    }

    @Test
    public void runningSample2() {
        k = 3;
        input = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);

        test(k, input);
    }

    @Test
    public void runningSample3() {
        k = 5;
        input = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);

        test(k, input);
    }

    private void test(int k, List<Integer> input) {
        final List<Integer> result = SampleOnlineData.runningSample(k, input);
        assertEquals(k, result.size());
        for (Integer i : result) {
            assertTrue(input.contains(i));
            input.remove(i);
        }

    }


}