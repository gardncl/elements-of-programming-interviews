import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class SmallestSubarrayTest {

    private Tuple expected;
    private List<String> paragraph;
    private Set<String> keywords;

    @Test
    public void findSubarray1() throws Exception {
        expected = new Tuple(0,11);
        paragraph = Arrays.asList(
                "Mark",
                "Steve",
                "Mason",
                "Joan",
                "Jordan",
                "Greg",
                "Daisy",
                "Garth",
                "Joan",
                "Daisy",
                "Joan",
                "Marcus"
        );
        keywords = new HashSet<>(Arrays.asList(
                "Mark",
                "Marcus"
        ));

        test(expected, paragraph, keywords);
    }

    @Test
    public void findSubarray2() throws Exception {
        expected = new Tuple(4,7);
        paragraph = Arrays.asList(
                "Mark",
                "Steve",
                "Mason",
                "Joan",
                "Jordan",
                "Greg",
                "Mark",
                "Garth",
                "Joan",
                "Daisy",
                "Joan",
                "Marcus"
        );
        keywords = new HashSet<>(Arrays.asList(
                "Jordan",
                "Mark",
                "Garth"
        ));

        test(expected, paragraph, keywords);
    }

    @Test
    public void findSubarray3() throws Exception {
        expected = new Tuple(8,11);
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
        keywords = new HashSet<>(Arrays.asList(
                "Mark",
                "Joan",
                "Greg"
        ));

        test(expected, paragraph, keywords);
    }

    private void test(Tuple expected, List<String> paragraph, Set<String> keywords) {
        assertEquals(expected, SmallestSubarray.findSubarray(paragraph,keywords));
    }



}