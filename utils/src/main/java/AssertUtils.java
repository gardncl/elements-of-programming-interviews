import junit.framework.AssertionFailedError;
import org.junit.Assert;

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
}
