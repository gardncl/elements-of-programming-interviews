import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromicTest {

    private boolean palindrome;
    private ListNode<Integer> list;

    @Test
    public void isPalindromic1() {
        palindrome = true;
        list = LinkedListUtil.createLinkedList(1);

        test(palindrome, list);
    }

    @Test
    public void isPalindromic2() {
        palindrome = false;
        list = LinkedListUtil.createLinkedList(1, 2);

        test(palindrome, list);
    }

    @Test
    public void isPalindromic3() {
        palindrome = true;
        list = LinkedListUtil.createLinkedList(1, 2, 1);

        test(palindrome, list);
    }

    @Test
    public void isPalindromic4() {
        palindrome = true;
        list = LinkedListUtil.createLinkedList(1, 2, 3, 4, 4, 3, 2, 1);

        test(palindrome, list);
    }

    @Test
    public void isPalindromic5() {
        palindrome = true;
        list = LinkedListUtil.createLinkedList(1, 2, 3, 4, 3, 2, 1);

        test(palindrome, list);
    }

    @Test
    public void isPalindromic6() {
        palindrome = false;
        list = LinkedListUtil.createLinkedList(1, 2, 3, 4, 5 ,3, 2, 1);

        test(palindrome, list);
    }

    @Test
    public void isPalindromic7() {
        palindrome = false;
        list = LinkedListUtil.createLinkedList(1, 2, 3, 5, 4 ,3, 2, 1);

        test(palindrome, list);
    }

    private void test(boolean palidrome, ListNode<Integer> list) {
        assertEquals(palidrome, Palindromic.isPalindromic(list));
    }

}