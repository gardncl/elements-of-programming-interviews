import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class TestCyclicityTest {

    private ListNode<Integer> cycleNode;
    private ListNode<Integer> list;

    @Test
    public void isCyclic1() {
        list = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        cycleNode = null;

        test(cycleNode, list);
    }

    @Test
    public void isCyclic2() {
        list = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        cycleNode = list.get(5);
        cycleNode.next = list.get(3);

        test(cycleNode, list);
    }

    @Test
    public void isCyclic3() {
        list = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        cycleNode = list.get(5);
        cycleNode.next = list;

        test(cycleNode, list);
    }

    private void test(ListNode<Integer> cycleNode, ListNode<Integer> list) {
        if (cycleNode == null)
            assertNull(TestCyclicity.isCyclic(list));
        else
            assertTrue(TestCyclicity.isCyclic(list).equals(cycleNode.next));

    }

}