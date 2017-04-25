package strings;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static strings.RunLengthEncoding.encode;
import static strings.RunLengthEncoding.decode;

public class RunLengthEncodingTest {

    private String expected;
    private String input;


    @Test
    public void encode1() {
        expected = "4a1b3c2a";
        input = "aaaabcccaa";

        testEncode(expected, input);
    }

    @Test
    public void encode2() {
        expected = "3e4f2e";
        input = "eeeffffee";

        testEncode(expected, input);
    }

    private void testEncode(String expected, String input) {
        assertEquals(expected, encode(input));
    }

    @Test
    public void decode1() {
        expected = "aaaabcccaa";
        input = "4a1b3c2a";

        testDecode(expected, input);
    }

    @Test
    public void decode2() {
        expected = "eeeffffee";
        input = "3e4f2e";

        testDecode(expected, input);
    }

    private void testDecode(String expected, String input) {
        assertEquals(expected, decode(input));
    }

}