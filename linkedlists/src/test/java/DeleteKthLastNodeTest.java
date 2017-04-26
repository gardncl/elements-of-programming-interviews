import org.junit.Test;

public class DeleteKthLastNodeTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> input;
    private int k;

    @Test
    public void deleteNode1() {
        expected = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        input = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        k = 1;

        test(expected, input, k);
    }

    @Test
    public void deleteNode2() {
        expected = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        input = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        k = 3;

        test(expected, input, k);
    }

    @Test
    public void deleteNode3() {
        expected = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        input = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        k = 5;

        test(expected, input, k);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> input, int k) {
        input.get(input.length() - k + 1).insertAfter(new ListNode<>(10));
        DeleteKthLastNode.deleteNode(input, k);
        LinkedListUtil.assertSameList(expected, input);
    }


}