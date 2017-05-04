import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrettyPrintingProblemTest {

    private int expected;
    private List<String> words;
    private int lineLength;

    @Test
    public void minimumMessiness1() throws Exception {
        expected = 82;
        words = Arrays.asList(("I have inserted a large number " +
                "of new examples from the papers for the Mathematical " +
                "Tripos during the last twenty years, which should be " +
                "useful to Cambridge students.").split(" "));
        lineLength = 36;

        test(expected, words, lineLength);
    }

    private void test(int expected, List<String> words, int lineLength) {
        assertEquals(expected, PrettyPrintingProblem.minimumMessiness(words, lineLength));
    }

}