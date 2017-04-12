package linkedlists;

import datastructures.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LinkedListTestUtil {

    public static void assertSameList(ListNode<Integer> expected, ListNode<Integer> result) {
        while (expected != null) {
            assertEquals(expected.data, result.data);
            expected = expected.next;
            result = result.next;
        }
        assertNull(result);
    }

    public static ListNode<Integer> createLinkedList(Integer... integers) {
        ListNode<Integer> dummyHead = new ListNode<>(null);
        ListNode<Integer> list = dummyHead;
        for (Integer i : integers) {
            list.next = new ListNode<>(i);
            list = list.next;
        }
        return dummyHead.next;
    }

}
