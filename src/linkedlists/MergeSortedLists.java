package linkedlists;

import datastructures.ListNode;

public class MergeSortedLists {

    /*
    Write a program that takes two lists, assumed to be sorted,
    and returns their merge. The only field your program can
    change in a node is its next field.
     */

    public static ListNode<Integer> mergeLists(ListNode<Integer> list1, ListNode<Integer> list2) {
        ListNode<Integer> dummyHead = new ListNode<>(0, null);
        ListNode<Integer> merged = dummyHead;
        ListNode<Integer> l1 = list1, l2 = list2;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                merged.next = l1;
                l1 = l1.next;
            } else {
                merged.next = l2;
                l2 = l2.next;
            }
            merged = merged.next;
        }
        if (l1 != null) {
            merged.next = l1;
        } else if (l2 != null) {
            merged.next = l2;
        }
        return dummyHead.next;
    }
}
