import junit.framework.AssertionFailedError;
import org.junit.Assert;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class AssertUtils {

    public static void assertSameList(PostingListNode<Integer> expected, PostingListNode<Integer> result) {
        PostingListNode<Integer> given = expected;
        PostingListNode<Integer> transformed = result;
        try {
            while (expected != null) {
                Assert.assertEquals(expected.data, result.data);
                expected = expected.next;
                result = result.next;
            }
            Assert.assertNull(result);
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

    public static void assertSameContents(List<String> expected, List<String> result) {
        try {
            expected.forEach((expect) -> {
                if (!result.contains(expect))
                    throw new AssertionError();
                result.remove(expect);
            });
        } catch (AssertionError e) {
            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append("\nExpected: "+expected.toString());
            errorMessage.append("\nActual: "+result.toString()+"\n");
            fail(errorMessage.toString());
        }
    }
}
