import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindDuplicateAndMissingTest {

    private DuplicateAndMissing expected;
    private List<Integer> list;

    @Test
    public void search1() throws Exception {
        expected = new DuplicateAndMissing(1,7);
        list = Arrays.asList(5,4,3,1,6,8,9,1,2);

        test(expected, list);
    }

    @Test
    public void search2() throws Exception {
        expected = new DuplicateAndMissing();
        list = StreamUtil.shuffle(StreamUtil.sequence(100));
        expected.duplicate = list.get(25);
        expected.missing = list.get(75);
        list.set(75,expected.duplicate);

        test(expected, list);
    }

    @Test
    public void search3() throws Exception {
        expected = new DuplicateAndMissing();
        list = StreamUtil.shuffle(StreamUtil.sequence(1000));
        expected.duplicate = list.get(250);
        expected.missing = list.get(750);
        list.set(750,expected.duplicate);

        test(expected, list);
    }

    private void test(DuplicateAndMissing expected, List<Integer> list) {
        assertEquals(expected, FindDuplicateAndMissing.search(list));
    }

}