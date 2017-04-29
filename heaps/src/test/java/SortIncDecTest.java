import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortIncDecTest {

    private List<Integer> expected;
    private List<Integer> input;

    @Test
    public void sort1() throws Exception {
        expected = Arrays.asList(1,2,3,4,5,6,7,8,9);
        input = Arrays.asList(2,3,1,5,6,4,8,9,7);

        test(expected, input);
    }

    @Test
    public void sort2() throws Exception {
        expected = Arrays.asList(57,131,190,221,294,339,418,442,452,493);
        input = Arrays.asList(57,131,493,294,221,339,418,452,442,190);

        test(expected, input);
    }

    private void test(List<Integer> expected, List<Integer> input) {
        assertEquals(expected, SortIncDec.sort(input));
    }

}