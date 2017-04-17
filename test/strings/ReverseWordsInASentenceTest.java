package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static strings.ReverseWordsInASentence.reverseWordsInASentence;

class ReverseWordsInASentenceTest {

    private String expected;
    private String input;

    @Test
    void reverseWordsInASentence1() {
        expected = "Alice";
        input = "Alice";

        test(expected, input);
    }

    @Test
    void reverseWordsInASentence2() {
        expected = "Alice likes";
        input = "likes Alice";

        test(expected, input);
    }

    @Test
    void reverseWordsInASentence3() {
        expected = "Alice likes Bob";
        input = "Bob likes Alice";

        test(expected, input);
    }

    @Test
    void reverseWordsInASentence4() {
        expected = "Alice doesn't like Bob";
        input = "Bob like doesn't Alice";

        test(expected, input);
    }

    private void test(String expected, String input) {
        assertEquals(expected, reverseWordsInASentence(input));
    }


}