package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteKthLastNodeTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> input;
    private int k;

    @Test
    void deleteNode1() {
        expected = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        input = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        k = 1;

        test(expected, input, k);
    }

    @Test
    void deleteNode2() {
        expected = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        input = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        k = 3;

        test(expected, input, k);
    }

    @Test
    void deleteNode3() {
        expected = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        input = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        k = 5;

        test(expected, input, k);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> input, int k) {
        input.get(input.length() - k + 1).insertAfter(new ListNode<>(10));
        DeleteKthLastNode.deleteNode(input, k);
        LinkedListTestUtil.assertSameList(expected, input);
    }


}