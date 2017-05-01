import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ImplementFastSortingTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> L;
    private int n;

    @Test
    public void sort1() throws Exception {
        n = 10;

        test(n);
    }

    @Test
    public void sort2() throws Exception {
        n = 50;

        test(n);
    }

    @Test
    public void sort3() throws Exception {
        n = 100;

        test(n);
    }

    private void test(int n) {
        List<Integer> list = StreamUtil.sequence(n);
        expected = NodeUtil.createList(list);
        Collections.shuffle(list);
        L = NodeUtil.createList(list);
        AssertUtils.assertSameList(expected, ImplementFastSorting.sort(L));
    }
}