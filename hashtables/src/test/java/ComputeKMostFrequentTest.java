import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ComputeKMostFrequentTest {

    private List<String> expected;
    private List<String> list;
    private int k;

    @Test
    public void mostFrequent1() throws Exception {
        expected = Arrays.asList(
                "Joan"
        );
        list = Arrays.asList(
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
        k = 1;

        test(expected, list, k);
    }

    @Test
    public void mostFrequent2() throws Exception {
        expected = Arrays.asList(
                "Mark",
                "Joan"
        );
        list = Arrays.asList(
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
        k = 2;

        test(expected, list, k);
    }

    @Test
    public void mostFrequent3() throws Exception {
        expected = Arrays.asList(
                "Mark",
                "Joan",
                "Greg"
        );
        list = Arrays.asList(
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
                "Greg",
                "Marcus"
        );
        k = 3;

        test(expected, list, k);
    }



    private static void test(List<String> expected, List<String> list, int k) {
        AssertUtils.assertSameContents(expected, ComputeKMostFrequent.mostFrequent(list, k));
    }

}