import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class BedBathBeyondProblemTest {

    private List<String> expected;
    private String domain;
    private Set<String> dictionary;

    @Test
    public void decompose1() throws Exception {
        expected = Arrays.asList(
                "a",
                "man",
                "a",
                "plan",
                "a",
                "canal"
        );
        domain = "amanaplanacanal";
        dictionary = new HashSet<>(Arrays.asList(
                "a",
                "man",
                "plan",
                "canal"
        ));

        test(expected, domain, dictionary);
    }

    private static void test(List<String> expected, String domain, Set<String> dictionary) {
        assertEquals(expected, BedBathBeyondProblem.decompose(domain, dictionary));
    }

}