import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceAndRemoveTest {

    private String expected;
    private String input;
    private int k;

    @Test
    public void replaceAndRemove1() {
        expected = "dd";
        input = "a ";
        k=1;

        test(expected, input, k);
    }

    @Test
    public void replaceAndRemove2() {
        expected = "dd";
        input = "ab";
        k=2;

        test(expected, input, k);
    }

    @Test
    public void replaceAndRemove3() {
        expected = "ddddc";
        input = "abac ";
        k=4;

        test(expected, input, k);
    }

    @Test
    public void replaceAndRemove4() {
        expected = "ddcdcdd";
        input = "acdbbca";
        k=7;

        test(expected, input, k);
    }

    private void test(String expected, String input, int k) {
        assertEquals(expected, ReplaceAndRemove.replaceAndRemove(input.toCharArray(), k));
    }
}