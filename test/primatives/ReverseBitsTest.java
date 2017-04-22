package primatives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static primatives.ReverseBits.reverse;

class ReverseBitsTest {

    private long expected;
    private long input;

    @Test
    void reverse1() {
        expected = 43261596;
        input = 964176192;

        test(expected, input);
    }

    private void test(long expected, long input) {
        assertEquals(expected, reverse(input));
    }

}