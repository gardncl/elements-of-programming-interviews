import junit.framework.AssertionFailedError;
import org.junit.Assert;

import java.util.List;

import static org.junit.Assert.*;

public class AssertUtils {

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
        } catch (AssertionError e) {
            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append("\nExpected: "+given.toString()+"\n");
            if (transformed != null && transformed.data != null)
                errorMessage.append("Actual: "+transformed.toString()+"\n");
            else
                errorMessage.append("Actual: null\n");
            fail(errorMessage.toString());
        }

    }

    public static void assertSameListPosting(PostingListNode<Integer> expected, PostingListNode<Integer> result) {
        PostingListNode<Integer> given = expected;
        PostingListNode<Integer> transformed = result;
        try {
            while (expected != null) {
                Assert.assertEquals(expected.data, result.data);
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
            Assert.fail(errorMessage.toString());
        }
    }

    public static void assertSameContentsInt(List<Integer> expected, List<Integer> result) {
        try {
            expected.forEach((expect) -> {
                if (!result.contains(expect))
                    throw new AssertionError();
                result.remove(expect);
            });
            assertEquals(0, result.size());
        } catch (AssertionError e) {
            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append("\nExpected: "+expected.toString());
            errorMessage.append("\nActual: "+result.toString()+"\n");
            fail(errorMessage.toString());
        }
    }

    public static void assertSameContentsString(List<String> expected, List<String> result) {
        try {
            expected.forEach((expect) -> {
                if (!result.contains(expect))
                    throw new AssertionError();
                result.remove(expect);
            });
            assertEquals(0, result.size());
        } catch (AssertionError e) {
            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append("\nExpected: "+expected.toString());
            errorMessage.append("\nActual: "+result.toString()+"\n");
            fail(errorMessage.toString());
        }
    }
}
