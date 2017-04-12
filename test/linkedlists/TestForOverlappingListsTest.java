package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestForOverlappingListsTest {

    private boolean overlap;
    private ListNode<Integer> list1;
    private ListNode<Integer> list2;

    @Test
    void doListsOverlap1() {
        overlap = false;
        list1 = LinkedListTestUtil.createLinkedList(1, 2, 3);
        list2 = LinkedListTestUtil.createLinkedList(4, 5, 6);

        test(overlap, list1, list2);
    }

    @Test
    void doListsOverlap2() {
        overlap = false;
        list1 = LinkedListTestUtil.createLinkedList(1, 3, 5);
        list2 = LinkedListTestUtil.createLinkedList(2, 4, 6);

        test(overlap, list1, list2);
    }

    @Test
    void doListsOverlap3() {
        overlap = false;
        list1 = LinkedListTestUtil.createLinkedList(1, 2, 3);
        list2 = LinkedListTestUtil.createLinkedList(3, 4, 5);

        test(overlap, list1, list2);
    }

    @Test
    void doListsOverlap4() {
        overlap = false;
        list1 = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        list2 = LinkedListTestUtil.createLinkedList(2, 3, 4);

        test(overlap, list1, list2);
    }

    private void test(boolean overlap, ListNode<Integer> list1, ListNode<Integer> list2) {
        assertEquals(overlap, TestForOverlappingLists.doListsOverlap(list1, list2));
    }

}