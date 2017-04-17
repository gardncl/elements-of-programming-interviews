package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static strings.ReplaceAndRemove.replaceAndRemove;

class ReplaceAndRemoveTest {

    private String expected;
    private String input;
    private int k;

    @Test
    void replaceAndRemove1() {
        expected = "dd";
        input = "a ";
        k=1;

        test(expected, input, k);
    }

    @Test
    void replaceAndRemove2() {
        expected = "dd";
        input = "ab";
        k=2;

        test(expected, input, k);
    }

    @Test
    void replaceAndRemove3() {
        expected = "ddddc";
        input = "abac ";
        k=4;

        test(expected, input, k);
    }

    @Test
    void replaceAndRemove4() {
        expected = "ddcdcdd";
        input = "acdbbca";
        k=7;

        test(expected, input, k);
    }

    private void test(String expected, String input, int k) {
        assertEquals(expected, replaceAndRemove(input.toCharArray(), k));
    }
}