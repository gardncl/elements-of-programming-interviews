package linkedlists;

import datastructures.ListNode;

public class TestForOverlappingLists {

    /*
    Write a program that takes two cycle-free single linked lists,
    and determines if there is a node common to both lists.
     */

    public static ListNode<Integer> doListsOverlap(ListNode<Integer> list1, ListNode<Integer> list2) {
        if ((list1 == null) || (list2 == null))
            return null;
        else if ((list1.next == null) && (list2.next == null))
            return null;
        ListNode<Integer> i1 = list1;
        ListNode<Integer> i2 = list2;

        Integer length1 = list1.length();
        Integer length2 = list2.length();

        //FIND THE LENGTH OF BOTH LISTS AND ITERATE AT THE OFFSETS TO FIND MATCHING NODE
        if (length1 > length2)
            i1 = list1.get(length1 - length2 + 1);
        else if (length1 < length2)
            i2 = list2.get(length2 - length1 + 1);

        //ITERATE UNTIL EQUAL
        while (i1 != i2) {
            i1 = i1.next;
            i2 = i2.next;
        }
        return i1;


    }
}
