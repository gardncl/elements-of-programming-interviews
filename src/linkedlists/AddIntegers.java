package linkedlists;

import datastructures.ListNode;

public class AddIntegers {

    /*
    Write a program which takes two singly linked lists of digits,
    and returns the list corresponding to the sum of the integers
    they represent. The least significant digit comes first.
     */
    
    public static ListNode<Integer> addIntegers(ListNode<Integer> a, ListNode<Integer> b) {
        ListNode<Integer> sum = new ListNode<Integer>(null);
        ListNode<Integer> sumIter = sum;
        ListNode<Integer> aIter = new ListNode<>(null, a);
        ListNode<Integer> bIter = new ListNode<>(null, b);
        ListNode<Integer> end = new ListNode<Integer>(null);
        int prev = 0;
        while (aIter.next != null || bIter.next != null) {
            int curr = 0;
            if (aIter.next != null) {
                curr += aIter.next.data;
                aIter = aIter.next;
            }
            if (bIter.next != null) {
                curr += bIter.next.data;
                bIter = bIter.next;
            }
            curr += prev;

            sumIter.next = new ListNode<>(curr % 10);
            if (curr == 0) {
                end = sumIter;
            }
            sumIter = sumIter.next;
            prev = curr / 10;
        }

        end.next = null;
        return sum.next;
    }
}
