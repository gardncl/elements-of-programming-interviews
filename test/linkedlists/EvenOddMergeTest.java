package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddMergeTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> input;

    @Test
    void merge1() {
        expected = LinkedListTestUtil.createLinkedList(0, 1);
        input = LinkedListTestUtil.createLinkedList(0, 1);

        test(expected, input);
    }

    @Test
    void merge2() {
        expected = LinkedListTestUtil.createLinkedList(0, 2, 1);
        input = LinkedListTestUtil.createLinkedList(0, 1, 2);

        test(expected, input);
    }

    @Test
    void merge3() {
        expected = LinkedListTestUtil.createLinkedList(0, 2, 4, 1, 3);
        input = LinkedListTestUtil.createLinkedList(0, 1, 2, 3, 4);

        test(expected, input);
    }

    @Test
    void merge4() {
        expected = LinkedListTestUtil.createLinkedList(0, 2, 4, 6, 1, 3, 5, 7);
        input = LinkedListTestUtil.createLinkedList(0, 1, 2, 3, 4, 5, 6, 7);

        test(expected, input);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> input) {
        LinkedListTestUtil.assertSameList(expected, EvenOddMerge.merge(input));
    }


}