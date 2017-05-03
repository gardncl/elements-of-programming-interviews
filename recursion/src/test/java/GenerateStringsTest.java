import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GenerateStringsTest {

    private List<String> expected;
    private int numPairs;

    @Test
    public void generateBalancedParentheses1() throws Exception {
        expected = Arrays.asList(
                ""
        );
        numPairs = 0;

        test(expected, numPairs);
    }

    @Test
    public void generateBalancedParentheses2() throws Exception {
        expected = Arrays.asList(
                "()"
        );
        numPairs = 1;

        test(expected, numPairs);
    }

    @Test
    public void generateBalancedParentheses3() throws Exception {
        expected = Arrays.asList(
                "()()",
                "(())"
        );
        numPairs = 2;

        test(expected, numPairs);
    }

    @Test
    public void generateBalancedParentheses4() throws Exception {
        expected = Arrays.asList(
                "()()()",
                "()(())",
                "(())()",
                "(()())",
                "((()))"
        );
        numPairs = 3;

        test(expected, numPairs);
    }

    private void test(List<String> expected, int numPairs) {
        AssertUtils.assertSameContentsString(expected, GenerateStrings.generateBalancedParentheses(numPairs));
    }

}