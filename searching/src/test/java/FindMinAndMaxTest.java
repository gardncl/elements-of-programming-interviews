import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindMinAndMaxTest {

    private MinMax expected;
    private List<Integer> list;

    @Test
    public void findMinMax1() throws Exception {
        expected = new MinMax(1,5);
        list = Arrays.asList(3,2,5,1,2,4);

        test(expected, list);
    }

    @Test
    public void findMinMax2() throws Exception {
        expected = new MinMax(0, 9);
        list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        test(expected, list);
    }

    private void test(MinMax expected, List<Integer> list) {
        assertEquals(expected, FindMinAndMax.findMinMax(list));
    }

}