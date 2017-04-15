package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static linkedlists.CyclicRightShift.shift;
import static linkedlists.LinkedListUtil.assertSameList;
import static linkedlists.LinkedListUtil.createLinkedList;

class CyclicRightShiftTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> input;
    private int k;

    @Test
    void shift1() {
        expected = createLinkedList(1, 2, 3, 4, 5);
        input = createLinkedList(1, 2, 3, 4, 5);
        k = 0;

        test(expected, input, k);
    }

    @Test
    void shift2() {
        expected = createLinkedList(1, 2, 3, 4, 5);
        input = createLinkedList(2, 3, 4, 5, 1);
        k = 1;

        test(expected, input, k);
    }

    @Test
    void shift3() {
        expected = createLinkedList(1, 2, 3, 4, 5);
        input = createLinkedList(3, 4, 5, 1, 2);
        k = 2;

        test(expected, input, k);
    }

    @Test
    void shift4() {
        expected = createLinkedList(1, 2);
        input = createLinkedList(2, 1);
        k = 1;

        test(expected, input, k);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> input, int k) {
        assertSameList(expected, shift(k, input));
    }

}