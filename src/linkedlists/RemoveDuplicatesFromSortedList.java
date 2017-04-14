package linkedlists;

import datastructures.ListNode;

public class RemoveDuplicatesFromSortedList {

    /*
    Write a program that takes as input a singly linked
    list of integers in a sorted order, and removes
    duplicates from it. The list should be sorted.
     */

    public static void removeDuplicates(ListNode<Integer> list) {
        ListNode<Integer> trail = list;
        ListNode<Integer> lead = list;
        Integer current = list.data;

        //NO EXIT CONDITION
        while (trail.next != null) {

            //WHILE LEAD STILL POINTS TO SAME NUMBER
            while (lead.next != null && lead.next.data.equals(current)) {
                lead = lead.next;
            }

            //LEAD POINTS DIFFERENT NUMBER
            if (lead.next!=null) {
                //POINT TO NEW NUMBER
                trail.next = lead.next;
                //MOVE UP
                trail = trail.next;
                lead = lead.next;
                //GET DATA
                current = lead.data;
            } else {
                //END OF DATA STILL IN SAME BLOCK OF NUMBERS
                trail.next = null;
            }
        }
    }

}
