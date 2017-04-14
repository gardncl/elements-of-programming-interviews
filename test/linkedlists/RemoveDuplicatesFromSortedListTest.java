package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> input;

    @Test
    void removeDuplicates1() {
        expected = LinkedListTestUtil.createLinkedList(1);
        input = LinkedListTestUtil.createLinkedList(1);

        test(expected, input);
    }

    @Test
    void removeDuplicates2() {
        expected = LinkedListTestUtil.createLinkedList(1);
        input = LinkedListTestUtil.createLinkedList(1, 1, 1);

        test(expected, input);
    }

    @Test
    void removeDuplicates3() {
        expected = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        input = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);

        test(expected, input);
    }

    @Test
    void removeDuplicates4() {
        expected = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        input = LinkedListTestUtil.createLinkedList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5);

        test(expected, input);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> input) {
        RemoveDuplicatesFromSortedList.removeDuplicates(input);
        LinkedListTestUtil.assertSameList(expected, input);
    }

}