package arrays;

import java.util.List;

public class AdvanceThroughArray {

    /*
    Write a program that takes an array of n integers, where A[i]
    denotes the maximum you can advance from index i, and returns
    whether it is possible to advance to the last index starting
    from the beginning of the array
    */

    public static boolean arrayAdvance(List<Integer> A) {
        int steps = 0, count = 0, length = A.size() - 1;
        while (steps >= 0) {
            //UPDATE TOTAL NUMBER OF STEPS IF GREATER THAN STORED
            if (A.get(count) > steps) {
                steps = A.get(count);
            }
            steps--;
            count++;

            //IF YOU CAN REACH THE LAST INDEX THEN RETURN TRUE
            if (count + steps >= length)
                return true;
        }
        return false;
    }
}
