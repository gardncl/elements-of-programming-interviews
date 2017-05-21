import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(expected, ReverseBits.reverse(input));
    }

}