import org.junit.Test;

import static org.junit.Assert.*;

public class FindOverlappingWithCyclesTest {

    private ListNode<Integer> overlap;
    private ListNode<Integer> list1;
    private ListNode<Integer> list2;

    @Test
    public void testOverlappingWithCycles1() {
        list1 = LinkedListUtil.createLinkedList(1, 2, 3);
        list2 = LinkedListUtil.createLinkedList(4, 5, 6);
        overlap = null;

        test(overlap, list1, list2);
    }

    @Test
    public void testOverlappingWithCycles2() {
        list1 = LinkedListUtil.createLinkedList(1, 2);
        list2 = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        overlap = list1.get(2).next = list2.get(3);

        test(overlap, list1, list2);
    }

    @Test
    public void testOverlappingWithCycles3() {
        list1 = LinkedListUtil.createLinkedList(1, 2);
        list2 = LinkedListUtil.createLinkedList(2, 3, 4, 5);
        overlap = list1.get(2).next = list2.get(2);

        test(overlap, list1, list2);
    }

    @Test
    public void testOverlappingWithCycles4() {
        list1 = LinkedListUtil.createLinkedList(2);
        list2 = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        list1.get(1).next = list2.get(3);
        list2.get(5).next = list2.get(1);
        overlap = LinkedListUtil.createLinkedList(2, 3);

        test(overlap, list1, list2);
    }

    @Test
    public void testOverlappingWithCycles5() {
        list1 = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        list1.get(5).next = list1.get(1);
        list2 = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        list2.get(5).next = list2.get(1);
        overlap = null;

        test(overlap, list1, list2);
    }

    private void test(ListNode<Integer> overlap, ListNode<Integer> list1, ListNode<Integer> list2) {
        ListNode<Integer> result = FindOverlappingWithCycles.testOverlappingWithCycles(list1, list2);
        if (overlap == null)
            assertNull(result);
        else if (overlap.next != null) {
            assertNotNull(result);
            assertEquals(overlap.data, result.data);
            assertEquals(overlap.next.data, result.next.data);
        }

    }

}