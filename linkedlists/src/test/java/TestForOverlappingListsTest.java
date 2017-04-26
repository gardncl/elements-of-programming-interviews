import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestForOverlappingListsTest {

    private ListNode<Integer> overlap;
    private ListNode<Integer> list1;
    private ListNode<Integer> list2;

    @Test
    public void doListsOverlap1() {
        list1 = LinkedListUtil.createLinkedList(1);
        list2 = LinkedListUtil.createLinkedList(2);
        overlap = null;

        test(overlap, list1, list2);
    }

    @Test
    public void doListsOverlap2() {
        list1 = null;
        list2 = null;
        overlap = null;

        test(overlap, list1, list2);
    }

    @Test
    public void doListsOverlap3() {
        list1 = LinkedListUtil.createLinkedList(1, 2, 3);
        list2 = LinkedListUtil.createLinkedList(4, 5, 6);
        overlap = null;

        test(overlap, list1, list2);
    }

    @Test
    public void doListsOverlap4() {
        list1 = LinkedListUtil.createLinkedList(1, 2);
        list2 = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        overlap = list1.get(2).next = list2.get(3);

        test(overlap, list1, list2);
    }

    @Test
    public void doListsOverlap5() {
        list1 = LinkedListUtil.createLinkedList(1, 2);
        list2 = LinkedListUtil.createLinkedList(2, 3, 4, 5);
        overlap = list1.get(2).next = list2.get(2);

        test(overlap, list1, list2);
    }

    @Test
    public void doListsOverlap6() {
        list1 = LinkedListUtil.createLinkedList(2);
        list2 = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5);
        overlap = list1.get(1).next = list2.get(3);

        test(overlap, list1, list2);
    }



    private void test(ListNode<Integer> overlap, ListNode<Integer> list1, ListNode<Integer> list2) {
        assertEquals(overlap, TestForOverlappingLists.doListsOverlap(list1, list2));
    }

}