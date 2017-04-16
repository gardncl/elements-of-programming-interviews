package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static strings.RomanToDecimal.romanToDecimal;

class RomanToDecimalTest {

    private int expected;
    private String roman;

    @Test
    void romanToDecimal1() {
        expected = 0;
        roman = "";

        test(expected, roman);
    }

    @Test
    void romanToDecimal2() {
        expected = 27;
        roman = "XXVII";

        test(expected, roman);
    }

    @Test
    void romanToDecimal3() {
        expected = 3492;
        roman = "MMMCDXCII";

        test(expected, roman);
    }

    @Test
    void romanToDecimal4() {
        expected = 4999;
        roman = "MMMMCMXCIX";

        test(expected, roman);
    }

    private void test(int expected, String roman) {
        assertEquals(expected, romanToDecimal(roman));
    }


}