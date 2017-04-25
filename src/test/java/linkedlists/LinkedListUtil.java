package linkedlists;

import datastructures.ListNode;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.fail;

public class LinkedListUtil {

    public static void assertSameList(ListNode<Integer> expected, ListNode<Integer> result) {
        ListNode<Integer> given = expected;
        ListNode<Integer> transformed = result;
        try {
            while (expected != null) {
                assertEquals(expected.data, result.data);
                expected = expected.next;
                result = result.next;
            }
            assertNull(result);
        } catch (AssertionFailedError e) {
            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append("\nExpected: "+given.toString()+"\n");
            if (transformed != null && transformed.data != null)
                errorMessage.append("Actual: "+transformed.toString()+"\n");
            else
                errorMessage.append("Actual: null\n");
            fail(errorMessage.toString());
        }

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

    private static void assertEquals(Integer a, Integer b) {
        if (!a.equals(b))
            throw new AssertionFailedError();
    }

    private static void assertNull(ListNode<Integer> node) {
        if (node != null)
            throw new AssertionFailedError();
    }

}
