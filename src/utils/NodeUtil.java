package utils;

import datastructures.PostingListNode;
import junit.framework.AssertionFailedError;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class NodeUtil {

    public static PostingListNode<Integer> createPostingList(int n) {
        PostingListNode<Integer> dummyHead = new PostingListNode<Integer>(null);
        PostingListNode<Integer> list = dummyHead;
        for (Integer i : IntStream.range(0,n).toArray()) {
            list.next = new PostingListNode<Integer>(i);
            list = list.next;
        }
        return dummyHead.next;
    }

    public static void assertSameList(PostingListNode<Integer> expected, PostingListNode<Integer> result) {
        PostingListNode<Integer> given = expected;
        PostingListNode<Integer> transformed = result;
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
}
