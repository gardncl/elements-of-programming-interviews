package linkedlists;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSingleSublistTest {

    ListNode<Integer> expected;
    ListNode<Integer> list;
    int s;
    int f;

    @Test
    void reverseSublist1() {
        expected = LinkedListTestUtil.createLinkedList(new Integer[]{1, 2, 3});
        list = LinkedListTestUtil.createLinkedList(new Integer[]{3, 2, 1});
        s = 1;
        f = 3;

        test(expected, list, s, f);
    }

    @Test
    void reverseSublist2() {
        expected = LinkedListTestUtil.createLinkedList(new Integer[]{1, 2, 6, 5, 4, 3, 7, 8, 9});
        list = LinkedListTestUtil.createLinkedList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        s = 3;
        f = 6;

        test(expected, list, s, f);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> list, int s, int f) {
        LinkedListTestUtil.assertSameList(expected, ReverseSingleSublist.reverseSublist(list, s, f));
    }

}