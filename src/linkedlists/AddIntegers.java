package linkedlists;

import datastructures.ListNode;

public class AddIntegers {

    /*
    Write a program which takes two singly linked lists of digits,
    and returns the list corresponding to the sum of the integers
    they represent. The least significant digit comes first.
     */
    
    public static ListNode<Integer> addIntegers(ListNode<Integer> a, ListNode<Integer> b) {
        ListNode<Integer> sum = new ListNode<>(null);
        ListNode<Integer> sumIter = sum;
        ListNode<Integer> end = new ListNode<>(null);
        int prev = 0;
        while (a != null || b != null || prev > 0) {
            int curr = prev;
            if (a != null) {
                curr += a.data;
                a = a.next;
            }
            if (b != null) {
                curr += b.data;
                b = b.next;
            }

            sumIter.next = new ListNode<>(curr % 10);

            sumIter = sumIter.next;
            prev = curr / 10;
        }


        return sum.next;
    }
}
