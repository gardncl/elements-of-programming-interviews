package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestForOverlappingListsTest {

    private ListNode<Integer> overlap;
    private ListNode<Integer> list1;
    private ListNode<Integer> list2;

    @Test
    void doListsOverlap1() {
        list1 = LinkedListTestUtil.createLinkedList(1);
        list2 = LinkedListTestUtil.createLinkedList(2);
        overlap = null;

        test(overlap, list1, list2);
    }

    @Test
    void doListsOverlap2() {
        list1 = null;
        list2 = null;
        overlap = null;

        test(overlap, list1, list2);
    }

    @Test
    void doListsOverlap3() {
        list1 = LinkedListTestUtil.createLinkedList(1, 2, 3);
        list2 = LinkedListTestUtil.createLinkedList(4, 5, 6);
        overlap = null;

        test(overlap, list1, list2);
    }

    @Test
    void doListsOverlap4() {
        list1 = LinkedListTestUtil.createLinkedList(1, 2);
        list2 = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        overlap = list1.get(2).next = list2.get(3);

        test(overlap, list1, list2);
    }

    @Test
    void doListsOverlap5() {
        list1 = LinkedListTestUtil.createLinkedList(1, 2);
        list2 = LinkedListTestUtil.createLinkedList(2, 3, 4, 5);
        overlap = list1.get(2).next = list2.get(2);

        test(overlap, list1, list2);
    }

    @Test
    void doListsOverlap6() {
        list1 = LinkedListTestUtil.createLinkedList(2);
        list2 = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        overlap = list1.get(1).next = list2.get(3);

        test(overlap, list1, list2);
    }



    private void test(ListNode<Integer> overlap, ListNode<Integer> list1, ListNode<Integer> list2) {
        assertEquals(overlap, TestForOverlappingLists.doListsOverlap(list1, list2));
    }

}