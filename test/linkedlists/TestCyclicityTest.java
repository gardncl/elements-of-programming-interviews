package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCyclicityTest {

    private boolean cyclic;
    private ListNode<Integer> list;

    @Test
    void isCyclic1() {
        cyclic = false;
        list = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);

        test(cyclic, list);
    }

    @Test
    void isCyclic2() {
        cyclic = true;
        list = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        list.find(5).next = list.find(3);

        test(cyclic, list);
    }

    @Test
    void isCyclic3() {
        cyclic = true;
        list = LinkedListTestUtil.createLinkedList(1, 2, 3, 4, 5);
        list.find(5).next = list;

        test(cyclic, list);
    }

    private void test(boolean cyclic, ListNode<Integer> list) {
        assertEquals(cyclic, TestCyclicity.isCyclic(list));
    }

}