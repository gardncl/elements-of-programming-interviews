import org.junit.Test;

import java.util.List;



public class SearchPostingsListTest {

    private PostingListNode<Integer> expected;
    private PostingListNode<Integer> input;

    @Test
    public void setJumpOrderRecursive1() {
        expected = new PostingListNode<>(0);
        expected.next = new PostingListNode<>(2);
        expected.next.next = new PostingListNode<>(1);
        expected.jump = expected.next.next;
        expected.jump.jump = expected.next;
        input = new PostingListNode<>(-1);
        input.next = new PostingListNode<>(-1);
        input.next.next = new PostingListNode<>(-1);
        input.jump = input.next.next;
        input.jump.jump = input.next;

        testRecursive(expected, input);
    }

    @Test
    public void setJumpOrderRecursive2() {
        expected = new PostingListNode<>(0);
        expected.next = new PostingListNode<>(3);
        expected.next.next = new PostingListNode<>(1);
        expected.next.next.next = new PostingListNode<>(2);
        expected.jump = expected.next.next;
        expected.jump.jump = expected.next.next.next;
        input = new PostingListNode<>(-1);
        input.next = new PostingListNode<>(-1);
        input.next.next = new PostingListNode<>(-1);
        input.next.next.next = new PostingListNode<>(-1);
        input.jump = input.next.next;
        input.jump.jump = input.next.next.next;

        testRecursive(expected, input);
    }

    private void testRecursive(PostingListNode<Integer> expected, PostingListNode<Integer> input) {
        SearchPostingsList.setJumpOrderRecursive(input);
        AssertUtils.assertSameListPosting(expected, input);
    }

    @Test
    public void setJumpOrderIterative1() {
        expected = new PostingListNode<>(0);
        expected.next = new PostingListNode<>(2);
        expected.next.next = new PostingListNode<>(1);
        expected.jump = expected.next.next;
        expected.jump.jump = expected.next;
        input = new PostingListNode<>(-1);
        input.next = new PostingListNode<>(-1);
        input.next.next = new PostingListNode<>(-1);
        input.jump = input.next.next;
        input.jump.jump = input.next;


        testIterative(expected, input);
    }

    @Test
    public void setJumpOrderIterative2() {
        expected = new PostingListNode<>(0);
        expected.next = new PostingListNode<>(3);
        expected.next.next = new PostingListNode<>(1);
        expected.next.next.next = new PostingListNode<>(2);
        expected.jump = expected.next.next;
        expected.jump.jump = expected.next.next.next;
        input = new PostingListNode<>(-1);
        input.next = new PostingListNode<>(-1);
        input.next.next = new PostingListNode<>(-1);
        input.next.next.next = new PostingListNode<>(-1);
        input.jump = input.next.next;
        input.jump.jump = input.next.next.next;

        testIterative(expected, input);
    }
    private void testIterative(PostingListNode<Integer> expected, PostingListNode<Integer> input) {
        SearchPostingsList.setJumpOrderIterative(input);
        AssertUtils.assertSameListPosting(expected, input);
    }

}