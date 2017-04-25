package strings;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeAlphanumericTest {

    boolean palindrome;
    String input;

    @Test
    public void isPalindrome1() {
        palindrome = true;
        input = "A man, a plan, a canal, Panama.";

        test(palindrome, input);
    }

    @Test
    public void isPalindrome2() {
        palindrome = true;
        input = "Able was I, ere I saw Elba!";

        test(palindrome, input);
    }

    @Test
    public void isPalindrome3() {
        palindrome = false;
        input = "Ray a Ray";

        test(palindrome, input);
    }

    public void test(boolean palindrome, String input) {
        assertEquals(palindrome, strings.PalindromeAlphanumeric.isPalindrome(input));
    }

}