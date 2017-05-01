import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeStringDecompositionsTest {

    private List<String> expected;
    private String s;
    private List<String> words;

    @Test
    public void findAllSubstring1() throws Exception {
        expected = Arrays.asList(
                "aplanacan",
                "canaplana"
        );
        s = "amanaplanacanalcanaplanaalpmna";
        words = Arrays.asList(
                "can",
                "apl",
                "ana"
        );

        test(expected, s, words);
    }

    private void test(List<String> expected, String s, List<String> words) {
        AssertUtils.assertSameContentsString(expected, ComputeStringDecompositions.findAllSubstring(s, words));
    }
}