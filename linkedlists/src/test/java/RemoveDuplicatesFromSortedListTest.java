import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> input;

    @Test
    public void removeDuplicates1() {
        expected = LinkedListUtil.createLinkedList(1);
        input = LinkedListUtil.createLinkedList(1);

        test(expected, input);
    }

    @Test
    public void removeDuplicates2() {
        expected = LinkedListUtil.createLinkedList(1);
        input = LinkedListUtil.createLinkedList(1, 1, 1);

        test(expected, input);
    }

    @Test
    public void removeDuplicates3() {
        expected = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        input = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);

        test(expected, input);
    }

    @Test
    public void removeDuplicates4() {
        expected = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        input = LinkedListUtil.createLinkedList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5);

        test(expected, input);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> input) {
        RemoveDuplicatesFromSortedList.removeDuplicates(input);
        LinkedListUtil.assertSameList(expected, input);
    }

}