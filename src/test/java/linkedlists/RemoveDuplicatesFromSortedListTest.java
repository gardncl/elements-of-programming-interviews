package linkedlists;

import datastructures.ListNode;
import org.junit.Test;

import static linkedlists.LinkedListUtil.assertSameList;
import static linkedlists.LinkedListUtil.createLinkedList;
import static linkedlists.RemoveDuplicatesFromSortedList.removeDuplicates;

public class RemoveDuplicatesFromSortedListTest {

    private ListNode<Integer> expected;
    private ListNode<Integer> input;

    @Test
    public void removeDuplicates1() {
        expected = createLinkedList(1);
        input = createLinkedList(1);

        test(expected, input);
    }

    @Test
    public void removeDuplicates2() {
        expected = createLinkedList(1);
        input = createLinkedList(1, 1, 1);

        test(expected, input);
    }

    @Test
    public void removeDuplicates3() {
        expected = createLinkedList(1, 2, 3, 4, 5);
        input = createLinkedList(1, 2, 3, 4, 5);

        test(expected, input);
    }

    @Test
    public void removeDuplicates4() {
        expected = createLinkedList(1, 2, 3, 4, 5);
        input = createLinkedList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5);

        test(expected, input);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> input) {
        removeDuplicates(input);
        assertSameList(expected, input);
    }

}