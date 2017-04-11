package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedListsTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> list1;
    private ListNode<Integer> list2;

    @Test
    void mergeLists1() {
        expected = new ListNode<>(1);
        expected.next = new ListNode<>(2);

        list1 = new ListNode<>(1);
        list2 = new ListNode<>(2);

        test(expected, list1, list2);
    }

    @Test
    void mergeLists2() {
        expected = new ListNode<>(1);

        list1 = new ListNode<>(1);

        test(expected, list1, list2);
    }

    @Test
    void mergeLists3() {
        expected = new ListNode<>(1);
        expected.next = new ListNode<>(2);
        expected.next.next = new ListNode<>(3);
        expected.next.next.next = new ListNode<>(4);
        expected.next.next.next.next = new ListNode<>(5);
        expected.next.next.next.next.next = new ListNode<>(6);

        list1 = new ListNode<>(1);
        list1.next = new ListNode<>(3);
        list1.next.next = new ListNode<>(5);
        list2 = new ListNode<>(2);
        list2.next = new ListNode<>(4);
        list2.next.next = new ListNode<>(6);

        test(expected, list1, list2);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> list1, ListNode<Integer> list2) {
        ListNode<Integer> result = MergeSortedLists.mergeLists(list1, list2);
        while (expected != null) {
            assertEquals(expected.data, result.data);
            expected = expected.next;
            result = result.next;
        }
        assertNull(result);
    }

}