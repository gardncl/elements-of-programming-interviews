package linkedlists;

import datastructures.ListNode;

public class FindOverlappingWithCycles {

    /*
    Solve TestForOverlappingLists for the case where the lists
    may each or both have a cycle. If such a node exists,
    return a node that appears first when traversing the lists.
    This node may not be unique--if one node ends in a cycle,
    the first cycle node encountered when traversing it may be
    different from the first cycle node encountered when traversing
    the second list, even though the cycle is the same. In such
    cases you may return either of the two nodes.
     */

    public static ListNode<Integer> testOverlappingWithCycles(ListNode<Integer> list1, ListNode<Integer> list2) {
        ListNode<Integer> iter1 = getCycle(list1);
        ListNode<Integer> iter2 = getCycle(list2);
        int length1 = iter1.data;
        int length2 = iter2.data;

        //NO CYCLES IN EITHER
        if (iter1.next == null && iter2.next == null) {
            return null;
        } else {

        }


        return new ListNode<>(0);
    }

    private static ListNode<Integer> getCycle(ListNode<Integer> list) {
        ListNode<Integer> slow = list;
        ListNode<Integer> fast = list;
        int cycleLength = 0;
        int length = 0;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                cycleLength = 1;
                while (fast.next != slow) {
                    ++cycleLength;
                    fast = fast.next;
                }
                ListNode<Integer> start = list;
                ListNode<Integer> inCycle = list;
                while (cycleLength-- > 0) {
                    inCycle = inCycle.next;
                }
                while (start != inCycle) {
                    start = start.next;
                    inCycle = inCycle.next;
                }
                return start;
            }
            length++;
        }

        //IF NO CYCLE THEN RETURN THE LENGTH OF THE LIST WITH NULL POINTER TO NEXT NODE
        return new ListNode<>(length, null);
    }
}
