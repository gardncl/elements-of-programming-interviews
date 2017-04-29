import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SearchSortedIndexTest {

    private int expected;
    private List<Integer> list;

    @Test
    public void search1() throws Exception {
        expected = 3;
        list = Arrays.asList(3,3,3,3,3);

        test(expected, list);
    }

    @Test
    public void search2() throws Exception {
        expected = 4;
        list = Arrays.asList(9,2,6,3,4);

        test(expected, list);
    }

    @Test
    public void search3() throws Exception {
        expected = 0;
        list = Arrays.asList(0,6,3,2,5,7,4,3,1);

        test(expected, list);
    }

    public void test(int expected, List<Integer> list) throws Exception {
        assertEquals(expected, SearchSortedIndex.search(list));
    }

}