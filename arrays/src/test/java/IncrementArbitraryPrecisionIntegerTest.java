import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class IncrementArbitraryPrecisionIntegerTest {

    private List<Integer> input;
    private List<Integer> incremented;

    @Test
    public void incrementInteger1() {
        input = getArrayList(new int[]{1, 2, 9});
        incremented = getArrayList(new int[]{1, 3, 0});

        test(input,incremented);
    }

    @Test
    public void incrementInteger2() {
        input = getArrayList(new int[]{9,9,9,9,9,9,9});
        incremented = getArrayList(new int[]{1,0,0,0,0,0,0,0});
        test(input,incremented);
    }

    @Test
    public void incrementInteger3() {
        input = getArrayList(new int[]{8,9,9,9,9,9,9});
        incremented = getArrayList(new int[]{9,0,0,0,0,0,0});
        test(input,incremented);
    }

    private void test(List<Integer> input, List<Integer> incremented) {
        IncrementArbitraryPrecisionInteger.incrementInteger(input);
        assertEquals(incremented, input);
    }

    private List<Integer> getArrayList(int[] arr) {
        return Arrays.
                stream(arr).
                boxed().
                collect(Collectors.toList());
    }
}