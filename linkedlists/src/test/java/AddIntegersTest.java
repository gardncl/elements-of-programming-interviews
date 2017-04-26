import org.junit.Test;

public class AddIntegersTest {

    private ListNode<Integer> sum;
    private ListNode<Integer> a;
    private ListNode<Integer> b;

    @Test
    public void addIntegers1() {
        sum = LinkedListUtil.createLinkedList(2);
        a = LinkedListUtil.createLinkedList(1);
        b = LinkedListUtil.createLinkedList(1);

        test(sum, a, b);
    }

    @Test
    public void addIntegers2() {
        sum = LinkedListUtil.createLinkedList(4, 2, 0, 1);
        a = LinkedListUtil.createLinkedList(2, 1, 5);
        b = LinkedListUtil.createLinkedList(2, 1, 5);

        test(sum, a, b);
    }

    @Test
    public void addIntegers3() {
        sum = LinkedListUtil.createLinkedList(1, 0, 0, 1);
        a = LinkedListUtil.createLinkedList(1, 0, 0, 0);
        b = LinkedListUtil.createLinkedList(0, 0, 0, 1);

        test(sum, a, b);
    }

    private static void test(ListNode<Integer> sum, ListNode<Integer> a, ListNode<Integer> b) {
        LinkedListUtil.assertSameList(sum, AddIntegers.addIntegers(a, b));
    }

}