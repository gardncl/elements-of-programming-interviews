package linkedlists;

import datastructures.ListNode;

public class DeleteKthLastNode {

    /*
    Given a singly linked list and an integer k,
    write a program to remove the kth last element
    from the list. Your algorithm cannot use more
    than a few works of storage, regardless of the
    length of the list. In particular, you cannot assume
    that it is possible to record the length of the list.
     */

    public static void deleteNode(ListNode<Integer> list, int k) {
        ListNode<Integer> trail = list;

        //IF K IS AT THE END OF THE LIST THEN REMOVE LAST ELEMENT
        if (k <= 1) {
            while (trail.next.next != null) {
                trail = trail.next;
            }
            trail.next = null;
            return;
        }

        //FIND END OF LIST AND TRAIL WILL BE A KTH ELEMENT
        ListNode<Integer> lead = list.get(k);
        while (lead.next != null) {
            trail = trail.next;
            lead = lead.next;
        }
        deleteNode(trail);
    }

    private static void deleteNode(ListNode<Integer> node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
