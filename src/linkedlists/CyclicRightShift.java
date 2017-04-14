package linkedlists;

import datastructures.ListNode;

public class CyclicRightShift {

    /*
    Write a program that takes as input a single linked list
    and a non-negative integer k, and returns the list
    cyclically shifted to the right by k.
     */

    //1 2 3 4 5
    //3 4 5 1 2

    public static ListNode<Integer> shift(int k, ListNode<Integer> list) {
        ListNode<Integer> cut = list;
        ListNode<Integer> glue = list;
        if (k == 0)
            return list;
        int length = 1;
        while (glue.next != null) {
            glue = glue.next;
            ++length;
        }
        glue.next = list;
        list = cut.get(length - k).next;
        cut.get(length - k).next = null;
        return list;
    }
}
