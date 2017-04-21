package primatives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static primatives.CheckIfIntegerIsPalindrome.isPalindrome;

class CheckIfIntegerIsPalindromeTest {

    boolean expected;
    int input;

    @Test
    void isPalindrome1() {
        expected = false;
        input = 12;

        test(expected, input);
    }

    @Test
    void isPalindrome2() {
        expected = true;
        input = 121;

        test(expected, input);
    }

    @Test
    void isPalindrome3() {
        expected = true;
        input = 8352538;

        test(expected, input);
    }

    @Test
    void isPalindrome4() {
        expected = true;
        input = 835538;

        test(expected, input);
    }

    @Test
    void isPalindrome5() {
        expected = false;
        input = 51342123;

        test(expected, input);
    }


    private void test(boolean expected, int input) {
        assertEquals(expected, isPalindrome(input));
    }

}