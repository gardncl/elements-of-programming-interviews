import org.junit.Test;

public class ListPivotTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> input;
    private int k;

    @Test
    public void pivot1() {
        expected = LinkedListUtil.createLinkedList(1);
        input = LinkedListUtil.createLinkedList(1);
        k = 0;

        test(expected, input, k);
    }

    @Test
    public void pivot2() {
        expected = LinkedListUtil.createLinkedList(1, 1, 1, 3, 3, 3, 2, 2, 2);
        input = LinkedListUtil.createLinkedList(3, 3, 3, 2, 2, 2, 1, 1, 1);
        k = 1;

        test(expected, input, k);
    }

    @Test
    public void pivot3() {
        expected = LinkedListUtil.createLinkedList(1, 1, 1, 2, 2, 2, 3, 3, 3);
        input = LinkedListUtil.createLinkedList(3, 3, 3, 2, 2, 2, 1, 1, 1);
        k = 2;

        test(expected, input, k);
    }

    @Test
    public void pivot4() {
        expected = LinkedListUtil.createLinkedList(3, 2, 2, 5, 7, 11, 11);
        input = LinkedListUtil.createLinkedList(3, 2, 2, 11, 7, 5, 11);
        k = 7;

        test(expected, input, k);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> input, int k) {
        LinkedListUtil.assertSameList(expected, ListPivot.pivot(input, k));
    }

}