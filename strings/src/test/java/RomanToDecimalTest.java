import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToDecimalTest {

    private int expected;
    private String roman;

    @Test
    public void romanToDecimal1() {
        expected = 1;
        roman = "I";

        test(expected, roman);
    }

    @Test
    public void romanToDecimal2() {
        expected = 27;
        roman = "XXVII";

        test(expected, roman);
    }

    @Test
    public void romanToDecimal3() {
        expected = 3492;
        roman = "MMMCDXCII";

        test(expected, roman);
    }

    @Test
    public void romanToDecimal4() {
        expected = 4999;
        roman = "MMMMCMXCIX";

        test(expected, roman);
    }

    private void test(int expected, String roman) {
        assertEquals(expected, RomanToDecimal.romanToDecimal(roman));
    }


}