package linkedlists;

import datastructures.ListNode;
import org.junit.Test;

import static linkedlists.LinkedListUtil.createLinkedList;
import static linkedlists.Palindromic.isPalindromic;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromicTest {

    private boolean palindrome;
    private ListNode<Integer> list;

    @Test
    public void isPalindromic1() {
        palindrome = true;
        list = createLinkedList(1);

        test(palindrome, list);
    }

    @Test
    public void isPalindromic2() {
        palindrome = false;
        list = createLinkedList(1, 2);

        test(palindrome, list);
    }

    @Test
    public void isPalindromic3() {
        palindrome = true;
        list = createLinkedList(1, 2, 1);

        test(palindrome, list);
    }

    @Test
    public void isPalindromic4() {
        palindrome = true;
        list = createLinkedList(1, 2, 3, 4, 4, 3, 2, 1);

        test(palindrome, list);
    }

    @Test
    public void isPalindromic5() {
        palindrome = true;
        list = createLinkedList(1, 2, 3, 4, 3, 2, 1);

        test(palindrome, list);
    }

    @Test
    public void isPalindromic6() {
        palindrome = false;
        list = createLinkedList(1, 2, 3, 4, 5 ,3, 2, 1);

        test(palindrome, list);
    }

    @Test
    public void isPalindromic7() {
        palindrome = false;
        list = createLinkedList(1, 2, 3, 5, 4 ,3, 2, 1);

        test(palindrome, list);
    }

    private void test(boolean palidrome, ListNode<Integer> list) {
        assertEquals(palidrome, isPalindromic(list));
    }

}