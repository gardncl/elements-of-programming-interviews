package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static linkedlists.DeleteNode.deleteNode;
import static linkedlists.LinkedListUtil.assertSameList;
import static linkedlists.LinkedListUtil.createLinkedList;

class DeleteNodeTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> listToDeleteFrom;
    private ListNode<Integer> node;

    @Test
    void deleteNode1() {
        node = new ListNode<>(10);
        expected = createLinkedList(1, 2, 3, 4, 5);
        listToDeleteFrom = createLinkedList(1, 2, 3, 4, 5);
        listToDeleteFrom.get(3).insertAfter(node);

        test(expected, listToDeleteFrom, node);
    }

    @Test
    void deleteNode2() {
        node = new ListNode<>(10);
        node.insertAfter(new ListNode<>(1));
        expected = createLinkedList(1);
        listToDeleteFrom = node;

        test(expected, listToDeleteFrom, node);
    }


    private void test(ListNode<Integer> expected, ListNode<Integer> listToDeleteFrom, ListNode<Integer> node) {
        deleteNode(node);
        assertSameList(expected, listToDeleteFrom);
    }


}