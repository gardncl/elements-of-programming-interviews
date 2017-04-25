package linkedlists;

import datastructures.ListNode;
import org.junit.Test;

import static linkedlists.LinkedListUtil.assertSameList;
import static linkedlists.LinkedListUtil.createLinkedList;
import static linkedlists.MergeSortedLists.mergeLists;

public class MergeSortedListsTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> list1;
    private ListNode<Integer> list2;

    @Test
    public void mergeLists1() {
        expected = createLinkedList(1, 2);
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
        expected = createLinkedList(1, 2, 3, 4, 5, 6);
        list1 = createLinkedList(1, 3, 5);
        list2 = createLinkedList(2, 4, 6);

        test(expected, list1, list2);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> list1, ListNode<Integer> list2) {
        ListNode<Integer> result = mergeLists(list1, list2);
        assertSameList(expected, result);
    }

}