import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseDigitsTest {

    private long expected;
    private int input;

    @Test
    public void reverse1() {
        expected = 24;
        input = 42;

        test(expected, input);
    }

    @Test
    public void reverse2() {
        expected = -413;
        input = -314;

        test(expected, input);
    }

    private void test(long expected, int x) {
        assertEquals(expected, ReverseDigits.reverse(x));
    }

}