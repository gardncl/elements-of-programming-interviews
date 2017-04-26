import org.junit.Test;

public class ReverseSingleSublistTest {

    ListNode<Integer> expected;
    ListNode<Integer> list;
    int s;
    int f;

    @Test
    public void reverseSublist1() {
        expected = LinkedListUtil.createLinkedList(1, 2, 3);
        list = LinkedListUtil.createLinkedList(3, 2, 1);
        s = 1;
        f = 3;

        test(expected, list, s, f);
    }

    @Test
    public void reverseSublist2() {
        expected = LinkedListUtil.createLinkedList(1, 2, 6, 5, 4, 3, 7, 8, 9);
        list = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        s = 3;
        f = 6;

        test(expected, list, s, f);
    }

    private void test(ListNode<Integer> expected, ListNode<Integer> list, int s, int f) {
        LinkedListUtil.assertSameList(expected, ReverseSingleSublist.reverseSublist(list, s, f));
    }

}