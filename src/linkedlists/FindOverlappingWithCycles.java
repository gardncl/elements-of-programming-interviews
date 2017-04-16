package linkedlists;

import datastructures.ListNode;

import static linkedlists.TestForOverlappingLists.doListsOverlap;

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

        //NO CYCLES IN EITHER
        if (iter1.next == null && iter2.next == null) {
            return doListsOverlap(list1, list2);
        } else if (iter1.next == null || iter2.next == null){
            //ONLY ONCE CYCLE SO THEY CANNOT POSSIBLY OVERLAP
            return null;
        }

        //DO THEY OVERLAP
        ListNode<Integer> temp = iter2;

        do {
            temp = temp.next;
        } while (temp != iter1 && temp != iter2);

        if (temp != iter1)
            return null;

        //FIND NODE
        int length1 = distance(list1, iter1), length2 = distance(list2,iter2);
        int count = Math.abs(length1 - length2);
        if (length1 > length2) {
            while (length1-- > 0) {
                list1 = list1.next;
            }
        } else {
            while (length2-- > 0) {
                list2 = list2.next;
            }
        }

        while (list1 != list2 && list1 != iter1 && list2 != iter2) {
            list1 = list1.next;
            list2 = list2.next;
        }
        return iter2.next;
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
        }

        //IF NO CYCLE THEN RETURN THE LENGTH OF THE LIST WITH NULL POINTER TO NEXT NODE
        return new ListNode<>(length, null);
    }

    private static int distance(ListNode<Integer> a, ListNode<Integer> b) {
        int dis = 0;
        while (a != b) {
            a = a.next;
            ++dis;
        }
        return dis;
    }
}
