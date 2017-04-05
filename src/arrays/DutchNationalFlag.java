package arrays;

import java.util.Collections;
import java.util.List;

public class DutchNationalFlag {

    /*
    Write a program that takes an array A and an index i into A, and
    rearranges the elements such that all elements less that A[i]
    (the 'pivot') appear first, followed by elements equal to the pivot,
    followed by elements greater than the pivot.
     */

    public static void dutchNationalFlag(int p, List<Integer> A) {
        int pVal = A.get(p);
        int smaller = 0, equal = 0, larger = p + 1;
        while (equal < larger) {
            if (A.get(equal) < pVal) {
                //INCREASE SIZE OF SMALL PARTITION BY ONE
                Collections.swap(A,smaller++,equal++);
            } else if (A.get(equal) == pVal) {
                //INCREASE SIZE OF EQUAL PARTITION BY ONE
                equal++;
            } else {
                //INCREASE SIZE OF LARGE PARTITION BY ONE
                Collections.swap(A,equal,--larger);
            }
        }
    }
}
