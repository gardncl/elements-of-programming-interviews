package utils;

import datastructures.PostingListNode;
import junit.framework.AssertionFailedError;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

public class AssertUtils {

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
