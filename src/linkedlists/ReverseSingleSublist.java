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

        trail = trail.find(s);

        ListNode<Integer> it = trail.next;
        System.out.println(dummyNode.next.toString());

        while (s++ < f) {
            ListNode<Integer> temp = it.next;
            it.next = temp.next;
            temp.next = trail.next;
            trail.next = temp;
            System.out.println(dummyNode.next.toString());
        }

        return dummyNode.next;
    }
}
