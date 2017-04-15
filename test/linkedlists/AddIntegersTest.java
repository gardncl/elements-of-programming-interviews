package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static linkedlists.AddIntegers.addIntegers;
import static linkedlists.LinkedListUtil.assertSameList;
import static linkedlists.LinkedListUtil.createLinkedList;

class AddIntegersTest {

    private ListNode<Integer> sum;
    private ListNode<Integer> a;
    private ListNode<Integer> b;

    @Test
    void addIntegers1() {
        sum = createLinkedList(2);
        a = createLinkedList(1);
        b = createLinkedList(1);

        test(sum, a, b);
    }

    @Test
    void addIntegers2() {
        sum = createLinkedList(1);
        a = createLinkedList(1, 0, 0, 0, 0);
        b = createLinkedList(0, 0, 0);

        test(sum, a, b);
    }

    @Test
    void addIntegers3() {
        sum = createLinkedList(4, 2, 0, 1);
        a = createLinkedList(2, 1, 5);
        b = createLinkedList(2, 1, 5);

        test(sum, a, b);
    }

    @Test
    void addIntegers4() {
        sum = createLinkedList(1, 0, 0, 1);
        a = createLinkedList(1, 0, 0, 0);
        b = createLinkedList(0, 0, 0, 1);

        test(sum, a, b);
    }

    private static void test(ListNode<Integer> sum, ListNode<Integer> a, ListNode<Integer> b) {
        assertSameList(sum, addIntegers(a, b));
    }

}