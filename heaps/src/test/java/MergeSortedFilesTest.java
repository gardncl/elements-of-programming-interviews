import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MergeSortedFilesTest {

    private List<Integer> expected;
    private List<List<Integer>> input;

    @Test
    public void mergeSorted1() throws Exception {
        expected = Arrays.asList(1,2,3,4,5,6,7,8,9);
        input = Arrays.asList(
                Arrays.asList(1,4,7),
                Arrays.asList(2,5,8),
                Arrays.asList(3,6,9)
        );

        test(expected, input);
    }

    @Test
    public void mergeSorted2() throws Exception {
        expected = Arrays.asList(0,0,3,5,6,6,7,28);
        input = Arrays.asList(
                Arrays.asList(3,5,7),
                Arrays.asList(0,6),
                Arrays.asList(0,6,28)
        );

        test(expected, input);
    }

    private void test(List<Integer> expected, List<List<Integer>> input) {
        assertEquals(expected, MergeSortedFiles.mergeSorted(input));
    }
}