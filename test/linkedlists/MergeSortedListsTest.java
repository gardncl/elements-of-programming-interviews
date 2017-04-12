package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedListsTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> list1;
    private ListNode<Integer> list2;

    @Test
    void mergeLists1() {
        expected = LinkedListTestUtil.createLinkedList(new Integer[]{1,2});


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
        expected = LinkedListTestUtil.createLinkedList(new Integer[]{1,2,3,4,5,6});

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
        LinkedListTestUtil.assertSameList(expected, result);
    }

}