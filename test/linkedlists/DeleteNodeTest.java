package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

class DeleteNodeTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> listToDeleteFrom;
    private ListNode<Integer> node;

    @Test
    void deleteNode1() {
        node = new ListNode<>(10);
        expected = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        listToDeleteFrom = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        listToDeleteFrom.get(3).insertAfter(node);

        test(expected, listToDeleteFrom, node);
    }

    @Test
    void deleteNode2() {
        node = new ListNode<>(10);
        node.insertAfter(new ListNode<>(1));
        expected = LinkedListTestUtil.createLinkedList(1);
        listToDeleteFrom = node;

        test(expected, listToDeleteFrom, node);
    }


    private void test(ListNode<Integer> expected, ListNode<Integer> listToDeleteFrom, ListNode<Integer> node) {
        DeleteNode.deleteNode(node);
        LinkedListTestUtil.assertSameList(expected, listToDeleteFrom);
    }


}