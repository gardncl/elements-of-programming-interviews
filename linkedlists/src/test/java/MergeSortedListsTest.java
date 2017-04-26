import org.junit.Test;

public class MergeSortedListsTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> list1;
    private ListNode<Integer> list2;

    @Test
    public void mergeLists1() {
        expected = LinkedListUtil.createLinkedList(1, 2);
        list1 = new ListNode<>(1);
        list2 = new ListNode<>(2);

        test(expected, list1, list2);
    }

    @Test
    public void mergeLists2() {
        expected = new ListNode<>(1);
        list1 = new ListNode<>(1);

        test(expected, list1, list2);
    }

    @Test
    public void mergeLists3() {
        expected = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5, 6);
        list1 = LinkedListUtil.createLinkedList(1, 3, 5);
        list2 = LinkedListUtil.createLinkedList(2, 4, 6);

        test(expected, list1, list2);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> list1, ListNode<Integer> list2) {
        ListNode<Integer> result = MergeSortedLists.mergeLists(list1, list2);
        LinkedListUtil.assertSameList(expected, result);
    }

}