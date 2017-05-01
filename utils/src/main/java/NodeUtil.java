import java.util.List;
import java.util.stream.IntStream;

public class NodeUtil {

    public static ListNode<Integer> createList(int n) {
        ListNode<Integer> dummyHead = new ListNode<Integer>(null);
        ListNode<Integer> list = dummyHead;
        for (Integer i : IntStream.range(0,n).toArray()) {
            list.next = new ListNode<>(i);
            list = list.next;
        }
        return dummyHead.next;
    }

    public static ListNode<Integer> createList(List<Integer> input) {
        ListNode<Integer> dummyHead = new ListNode<Integer>(null);
        ListNode<Integer> list = dummyHead;
        for (Integer i : input) {
            list.next = new ListNode<>(i);
            list = list.next;
        }
        return dummyHead.next;
    }

    public static PostingListNode<Integer> createPostingList(int n) {
        PostingListNode<Integer> dummyHead = new PostingListNode<Integer>(null);
        PostingListNode<Integer> list = dummyHead;
        for (Integer i : IntStream.range(0,n).toArray()) {
            list.next = new PostingListNode<>(i);
            list = list.next;
        }
        return dummyHead.next;
    }


}
