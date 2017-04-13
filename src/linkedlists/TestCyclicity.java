package linkedlists;

import datastructures.ListNode;

public class TestCyclicity {

    /*
    Write a program that takes the head of a singly linked list and
    returns null if there does not exist a cycle, and the node at the
    start of the cycle, if a cycle is present.
     */

    public static ListNode<Integer> isCyclic(ListNode<Integer> list) {
        ListNode<Integer> slow = list;
        ListNode<Integer> fast = list;
        ListNode<Integer> cycle = list;
        ListNode<Integer> head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            //FOUND CYCLE
            if (slow == fast) {

                //HOW LONG IS THE CYCLE?
                Integer cycleLength = 1;
                while (fast.next != slow) {
                    fast = fast.next;
                    ++cycleLength;
                }

                //ITERATE THE LENGTH OF THE CYCLE
                while( cycleLength> 0) {
                    cycle = cycle.next;
                    --cycleLength;
                }

                //ITERATE THE CYCLE AND HEAD SINCE THEY ARE BOTH K SPACES FROM THE START OF THE CYCLE
                head = list;
                while (cycle != head) {
                    cycle = cycle.next;
                    head = head.next;
                }
                return cycle;
            }
        }
        return null;
    }
}
