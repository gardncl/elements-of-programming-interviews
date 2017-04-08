package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeAlphanumericTest {

    boolean palindrome;
    String input;

    @Test
    void isPalindrome1() {
        palindrome = true;
        input = "A man, a plan, a canal, Panama.";

        test(palindrome, input);
    }

    @Test
    void isPalindrome2() {
        palindrome = true;
        input = "Able was I, ere I saw Elba!";

        test(palindrome, input);
    }

    @Test
    void isPalindrome3() {
        palindrome = false;
        input = "Ray a Ray";

        test(palindrome, input);
    }

    public void test(boolean palindrome, String input) {
        assertEquals(palindrome, PalindromeAlphanumeric.isPalindrome(input));
    }

}