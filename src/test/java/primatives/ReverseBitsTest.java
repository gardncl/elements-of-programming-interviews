package primatives;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static primatives.ReverseBits.reverse;

public class ReverseBitsTest {

    private int expected;
    private int input;

    @Test
    public void reverse1() {
        expected = 43261596;
        input = 964176192;

        test(expected, input);
    }

    private void test(int expected, int input) {
        assertEquals(expected, reverse(input));
    }

}