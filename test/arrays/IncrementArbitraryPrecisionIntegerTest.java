package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IncrementArbitraryPrecisionIntegerTest {

    private List<Integer> input;
    private List<Integer> incremented;

    @Test
    void incrementInteger1() {
        input = Arrays.asList(1, 2, 9);
        incremented = Arrays.asList(1, 3, 0);
        test(input,incremented);
    }

    @Test
    void incrementInteger2() {
        input = Arrays.asList(9,9,9,9,9,9,9);
        incremented = Arrays.asList(0,0,0,0,0,0,0);
        test(input,incremented);
    }

    @Test
    void incrementInteger3() {
        input = Arrays.asList(8,9,9,9,9,9,9);
        incremented = Arrays.asList(9,0,0,0,0,0,0);
        test(input,incremented);
    }

    private void test(List<Integer> input, List<Integer> incremented) {
        IncrementArbitraryPrecisionInteger.incrementInteger(input);
        assertEquals(incremented, input);
    }


}