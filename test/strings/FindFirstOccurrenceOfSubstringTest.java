package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static strings.FindFirstOccurrenceOfSubstring.findFirst;

class FindFirstOccurrenceOfSubstringTest {

    private int expected;
    private String string;
    private String substring;

    @Test
    void findFirst1() {
        expected = 0;
        string = "abc";
        substring = "abc";

        test(expected, string, substring);
    }

    @Test
    void findFirst2() {
        expected = 0;
        string = "abcabcabc";
        substring = "abc";

        test(expected, string, substring);
    }

    @Test
    void findFirst3() {
        expected = 7;
        string = "aababcdabcdeabcdef";
        substring = "abcde";

        test(expected, string, substring);
    }

    @Test
    void findFirst4() {
        expected = 12;
        string = "aababcdabcdeabcdef";
        substring = "abcdef";

        test(expected, string, substring);
    }

    private void test(int expected, String string, String substring) {
        assertEquals(expected, findFirst(string, substring));
    }

}