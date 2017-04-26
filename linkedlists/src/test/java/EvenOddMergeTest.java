import org.junit.Test;

public class EvenOddMergeTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> input;

    @Test
    public void merge1() {
        expected = LinkedListUtil.createLinkedList(0, 1);
        input = LinkedListUtil.createLinkedList(0, 1);

        test(expected, input);
    }

    @Test
    public void merge2() {
        expected = LinkedListUtil.createLinkedList(0, 2, 1);
        input = LinkedListUtil.createLinkedList(0, 1, 2);

        test(expected, input);
    }

    @Test
    public void merge3() {
        expected = LinkedListUtil.createLinkedList(0, 2, 4, 1, 3);
        input = LinkedListUtil.createLinkedList(0, 1, 2, 3, 4);

        test(expected, input);
    }

    @Test
    public void merge4() {
        expected = LinkedListUtil.createLinkedList(0, 2, 4, 6, 1, 3, 5, 7);
        input = LinkedListUtil.createLinkedList(0, 1, 2, 3, 4, 5, 6, 7);

        test(expected, input);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> input) {
        LinkedListUtil.assertSameList(expected, EvenOddMerge.merge(input));
    }


}