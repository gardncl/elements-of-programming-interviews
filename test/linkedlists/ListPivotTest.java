package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static linkedlists.LinkedListUtil.assertSameList;
import static linkedlists.LinkedListUtil.createLinkedList;
import static linkedlists.ListPivot.pivot;

class ListPivotTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> input;
    private int k;

    @Test
    void pivot1() {
        expected = createLinkedList(1);
        input = createLinkedList(1);
        k = 0;

        test(expected, input, k);
    }

    @Test
    void pivot2() {
        expected = createLinkedList(1, 1, 1, 3, 3, 3, 2, 2, 2);
        input = createLinkedList(3, 3, 3, 2, 2, 2, 1, 1, 1);
        k = 1;

        test(expected, input, k);
    }

    @Test
    void pivot3() {
        expected = createLinkedList(1, 1, 1, 2, 2, 2, 3, 3, 3);
        input = createLinkedList(3, 3, 3, 2, 2, 2, 1, 1, 1);
        k = 2;

        test(expected, input, k);
    }

    @Test
    void pivot4() {
        expected = createLinkedList(3, 2, 2, 5, 7, 11, 11);
        input = createLinkedList(3, 2, 2, 11, 7, 5, 11);
        k = 7;

        test(expected, input, k);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> input, int k) {
        assertSameList(expected, pivot(input, k));
    }

}