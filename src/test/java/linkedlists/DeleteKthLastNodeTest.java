package linkedlists;

import datastructures.ListNode;
import org.junit.Test;

import static linkedlists.DeleteKthLastNode.deleteNode;
import static linkedlists.LinkedListUtil.assertSameList;
import static linkedlists.LinkedListUtil.createLinkedList;

public class DeleteKthLastNodeTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> input;
    private int k;

    @Test
    public void deleteNode1() {
        expected = createLinkedList(1, 2, 3, 4, 5);
        input = createLinkedList(1, 2, 3, 4, 5);
        k = 1;

        test(expected, input, k);
    }

    @Test
    public void deleteNode2() {
        expected = createLinkedList(1, 2, 3, 4, 5);
        input = createLinkedList(1, 2, 3, 4, 5);
        k = 3;

        test(expected, input, k);
    }

    @Test
    public void deleteNode3() {
        expected = createLinkedList(1, 2, 3, 4, 5);
        input = createLinkedList(1, 2, 3, 4, 5);
        k = 5;

        test(expected, input, k);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> input, int k) {
        input.get(input.length() - k + 1).insertAfter(new ListNode<>(10));
        deleteNode(input, k);
        assertSameList(expected, input);
    }


}