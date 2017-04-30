import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindDuplicateAndMissingTest {

    private Tuple expected;
    private List<Integer> list;

    @Test
    public void search1() throws Exception {
        expected = new Tuple(1,7);
        list = Arrays.asList(5,4,3,1,6,8,9,1,2);

        test(expected, list);
    }

    @Test
    public void search2() throws Exception {
        expected = new Tuple();
        list = StreamUtil.shuffle(StreamUtil.sequence(100));
        expected.first = list.get(25);
        expected.second = list.get(75);
        list.set(75,expected.first);

        test(expected, list);
    }

    @Test
    public void search3() throws Exception {
        expected = new Tuple();
        list = StreamUtil.shuffle(StreamUtil.sequence(1000));
        expected.first = list.get(250);
        expected.second = list.get(750);
        list.set(750,expected.first);

        test(expected, list);
    }

    private void test(Tuple expected, List<Integer> list) {
        assertEquals(expected, FindDuplicateAndMissing.search(list));
    }

}