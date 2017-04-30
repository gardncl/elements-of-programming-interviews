import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SmallestSequentialSubarrayTest {

    private Tuple expected;
    private List<String> paragraph;
    private Set<String> keywords;

    @Test
    public void findSubarray1() throws Exception {
        expected = new Tuple(0,8);
        paragraph = Arrays.asList(
                "Mark",
                "Steve",
                "Mason",
                "Joan",
                "Jordan",
                "Greg",
                "Daisy",
                "Garth",
                "Marcus",
                "Daisy",
                "Joan",
                "Mark"
        );
        keywords = new LinkedHashSet<>(Arrays.asList(
                "Mark",
                "Marcus"
        ));

        test(expected, paragraph, keywords);
    }

    @Test
    public void findSubarray2() throws Exception {
        expected = new Tuple(4,9);
        paragraph = Arrays.asList(
                "Mark",
                "Steve",
                "Mason",
                "Joan",
                "Jordan",
                "Greg",
                "Garth",
                "Mark",
                "Jordan",
                "Garth",
                "Joan",
                "Marcus"
        );
        keywords = new LinkedHashSet<>(Arrays.asList(
                "Jordan",
                "Mark",
                "Garth"
        ));

        test(expected, paragraph, keywords);
    }

    @Test
    public void findSubarray3() throws Exception {
        expected = new Tuple(3,7);
        paragraph = Arrays.asList(
                "Mark",
                "Steve",
                "Joan",
                "Steven",
                "Greg",
                "Jordan",
                "Mark",
                "Kevin",
                "Joan",
                "Daisy",
                "Greg",
                "Mark"
        );
        keywords = new LinkedHashSet<>(Arrays.asList(
                "Steven",
                "Greg",
                "Jordan",
                "Mark",
                "Kevin"
        ));

        test(expected, paragraph, keywords);
    }

    private void test(Tuple expected, List<String> paragraph, Set<String> keywords) {
        assertEquals(expected, SmallestSequentialSubarray.findSubarray(paragraph,keywords));
    }


}