package linkedlists;

import datastructures.ListNode;

import java.util.Arrays;
import java.util.List;

public class ListPivot {

    /*
    Implement a function which takes as input a singly linked list
    and an integer k and performs a pivot of the list with respect
    to k. The relative ordering of nodes that appear before k, and
    after k, must remain unchanged; the same must hold for nodes
    holding keys equal to k.
     */

    public static ListNode<Integer> pivot(ListNode<Integer> list, int k) {
        ListNode<Integer> less = new ListNode<>(0, null);
        ListNode<Integer> equal = new ListNode<>(0, null);
        ListNode<Integer> greater = new ListNode<>(0, null);
        ListNode<Integer> lessIter = less;
        ListNode<Integer> equalIter = equal;
        ListNode<Integer> greaterIter = greater;
        ListNode<Integer> iter = list;

        while (iter != null) {
            if (iter.data < k) {
                lessIter.next = iter;
                lessIter = iter;
            } else if (iter.data == k) {
                equalIter.next = iter;
                equalIter = iter;
            } else {
                greaterIter.next = iter;
                greaterIter = iter;
            }
            iter = iter.next;
        }
        greaterIter.next = null;
        equalIter.next = greater.next;
        lessIter.next = equal.next;

        return less.next;
    }

}
