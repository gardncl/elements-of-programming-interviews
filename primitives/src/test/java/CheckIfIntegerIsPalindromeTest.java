import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckIfIntegerIsPalindromeTest {

    boolean expected;
    int input;

    @Test
    public void isPalindrome1() {
        expected = false;
        input = 12;

        test(expected, input);
    }

    @Test
    public void isPalindrome2() {
        expected = true;
        input = 0;

        test(expected, input);
    }

    @Test
    public void isPalindrome3() {
        expected = false;
        input = -1;

        test(expected, input);
    }

    @Test
    public void isPalindrome5() {
        expected = false;
        input = 51342123;

        test(expected, input);
    }


    private void test(boolean expected, int input) {
        assertEquals(expected, CheckIfIntegerIsPalindrome.isPalindrome(input));
    }

}