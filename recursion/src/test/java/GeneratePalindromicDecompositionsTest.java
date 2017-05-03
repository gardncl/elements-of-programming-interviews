import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class GeneratePalindromicDecompositionsTest {

    private List<List<String>> expected;
    private String input;

    @Test
    public void palindromicPartitioning1() throws Exception {
        expected = Arrays.asList(
                Arrays.asList("6","1","1","1","1","6"),
                Arrays.asList("6","11","1","1","6"),
                Arrays.asList("6","1","1","11","6"),
                Arrays.asList("6","11","11","6"),
                Arrays.asList("6","1111","6")
        );
        input = "611116";

        test(expected, input);
    }

    @Test
    public void palindromicPartitioning2() throws Exception {
        expected = Arrays.asList(
                Arrays.asList("0","2","0","4","4","5","1","8","8","1"),
                Arrays.asList("0","2","0","44","5","1","8","8","1"),
                Arrays.asList("0","2","0","4","4","5","1","88","1"),
                Arrays.asList("0","2","0","4","4","5","1881"),
                Arrays.asList("0","2","0","44","5","1","88","1"),
                Arrays.asList("0","2","0","44","5","1881"),
                Arrays.asList("020","4","4","5","1","8","8","1"),
                Arrays.asList("020","44","5","1","8","8","1"),
                Arrays.asList("020","4","4","5","1","88","1"),
                Arrays.asList("020","4","4","5","1881"),
                Arrays.asList("020","44","5","1","88","1"),
                Arrays.asList("020","44","5","1881")
        );
        input = "0204451881";

        test(expected, input);
    }

    private void test(List<List<String>> expected, String input) {
        expected.forEach(Collections::sort);
        List<List<String>> result = GeneratePalindromicDecompositions.palindromicPartitioning(input);
        assertEquals(expected.size(), result.size());
        result.forEach( i -> {
            Collections.sort(i);
            assertTrue(expected.remove(i));
        });
    }

}