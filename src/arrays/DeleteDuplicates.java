package arrays;

import java.util.List;

public class DeleteDuplicates {

    /*
    Write a program that takes as input an array a sorted array and updates
    it so that all duplicates have been removed and the remaining elements
    have been shifted left to fill the emptied indices. Return the
    number of valid elements.
     */

    public static int deleteDuplicates(List<Integer> A) {
        int writeIndex = 1;

        //IF NEW ELEMENT THEN ENTER INTO UNIQUE ARRAY AND INCREMENT NUMBER OF UNIQUE ELEMENTS
        for (int i = 1; i < A.size(); i++) {
            if (!A.get(i).equals(A.get(writeIndex-1))) {
                A.set(writeIndex++,A.get(i));
            }
        }

        //REMOVE ALL NON-UNIQUE ELEMENTS
        for (int i = writeIndex; i < A.size(); i++)
            A.set(i, null);

        return writeIndex;
    }
}
