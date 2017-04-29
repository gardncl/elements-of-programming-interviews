import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SearchSortedCyclicTest {

    private int expected;
    private List<Integer> list;

    @Test
    public void search1() throws Exception {
        expected = 0;
        list = Arrays.asList(0,1,2,3,4);

        test(expected, list);
    }

    @Test
    public void search2() throws Exception {
        expected = 2;
        list = Arrays.asList(4,5,0,1,2,3);

        test(expected, list);
    }

    @Test
    public void search3() throws Exception {
        expected = 8;
        list = Arrays.asList(2,3,4,5,6,7,8,9,0,1);

        test(expected, list);
    }

    public void test(int expected, List<Integer> list) throws Exception {
        assertEquals(expected, SearchSortedCyclic.search(list));
    }


}