import org.junit.Test;

public class CyclicRightShiftTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> input;
    private int k;

    @Test
    public void shift1() {
        expected = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        input = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        k = 0;

        test(expected, input, k);
    }

    @Test
    public void shift2() {
        expected = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        input = LinkedListUtil.createLinkedList(2, 3, 4, 5, 1);
        k = 1;

        test(expected, input, k);
    }

    @Test
    public void shift3() {
        expected = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        input = LinkedListUtil.createLinkedList(3, 4, 5, 1, 2);
        k = 2;

        test(expected, input, k);
    }

    @Test
    public void shift4() {
        expected = LinkedListUtil.createLinkedList(1, 2);
        input = LinkedListUtil.createLinkedList(2, 1);
        k = 1;

        test(expected, input, k);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> input, int k) {
        LinkedListUtil.assertSameList(expected, CyclicRightShift.shift(k, input));
    }

}