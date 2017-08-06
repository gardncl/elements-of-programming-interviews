import junit.framework.AssertionFailedError;
import org.junit.Assert;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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

    public static void assertListOfListsEqual(List<List<Integer>> expected, List<List<Integer>> result) {
        for (List<Integer> list : result) {
            if (!expected.stream().anyMatch(x -> hasSameValues(list,x)))
                fail(list.toString()+" not inside result set.");
        }
    }

    private static boolean hasSameValues(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        if (set1.size() != set2.size())
            return false;

        //LIST DOES NOT SUPPORT REMOVE ALL SO NEED TO CAST TO SET
        set1.removeAll(set2);

        return set1.isEmpty();
    }
}
