package linkedlists;

import datastructures.ListNode;

public class ReverseSingleSublist {

    /*
    Write a program which takes a single linked list L and two
    integers s and f as arguments, and reverses the order of the
    nodes from the sth to fth node, inclusive. The numbering
    begins at 1, i.e. the head node. Do not allocate additional nodes.
     */

    public static ListNode<Integer> reverseSublist(ListNode<Integer> input, int s, int f) {
        ListNode<Integer> dummyNode = new ListNode<>(0, input);
        ListNode<Integer> trail = dummyNode;

        trail = trail.get(s);

        ListNode<Integer> it = trail.next;

        while (s++ < f) {
            ListNode<Integer> front = it.next;
            it.next = front.next;
            front.next = trail.next;
            trail.next = front;
        }

        return dummyNode.next;
    }
}
