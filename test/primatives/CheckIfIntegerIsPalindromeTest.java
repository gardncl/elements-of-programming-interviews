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
        input = 0;

        test(expected, input);
    }

    @Test
    void isPalindrome3() {
        expected = true;
        input = -1;

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