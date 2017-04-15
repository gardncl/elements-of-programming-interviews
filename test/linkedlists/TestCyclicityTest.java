package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static linkedlists.LinkedListUtil.createLinkedList;
import static linkedlists.TestCyclicity.isCyclic;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestCyclicityTest {

    private ListNode<Integer> cycleNode;
    private ListNode<Integer> list;

    @Test
    void isCyclic1() {
        list = createLinkedList(1, 2, 3, 4, 5);
        cycleNode = null;

        test(cycleNode, list);
    }

    @Test
    void isCyclic2() {
        list = createLinkedList(1, 2, 3, 4, 5);
        cycleNode = list.get(5);
        cycleNode.next = list.get(3);

        test(cycleNode, list);
    }

    @Test
    void isCyclic3() {
        list = createLinkedList(1, 2, 3, 4, 5);
        cycleNode = list.get(5);
        cycleNode.next = list;

        test(cycleNode, list);
    }

    private void test(ListNode<Integer> cycleNode, ListNode<Integer> list) {
        if (cycleNode == null)
            assertNull(isCyclic(list));
        else
            assertTrue(isCyclic(list).equals(cycleNode.next));

    }

}