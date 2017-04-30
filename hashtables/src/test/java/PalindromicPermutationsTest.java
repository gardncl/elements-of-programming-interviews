import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromicPermutationsTest {

    private boolean expected;
    private String s;

    @Test
    public void canFormPalindrome1() throws Exception {
        expected = true;
        s = "edified";

        test(expected, s);
    }

    @Test
    public void canFormPalindrome2() throws Exception {
        expected = false;
        s = "abc";

        test(expected, s);
    }

    @Test
    public void canFormPalindrome3() throws Exception {
        expected = true;
        s = "aabbcc";

        test(expected, s);
    }

    @Test
    public void canFormPalindrome4() throws Exception {
        expected = false;
        s = "aabbbccc";

        test(expected, s);
    }

    private void test(boolean expected, String s) {
        assertEquals(expected, PalindromicPermutations.canFormPalindrome(s));
    }

}