package arrays;

import java.util.List;

public class IncrementArbitraryPrecisionInteger {

    /*
    Write a program that takes as input an array of digits encoding a decimal number D
    and updates the array to represent the number D + 1. For example, if the input is
    (1,2,9) then you should update the array to (1,3,0). Your algorithm should work
    even if it is implemented in a language that has finite-precision arithmetic.
     */

    public static List<Integer> incrementInteger(List<Integer> A) {
        for (int l = A.size() - 1; l >= 0; --l) {
            //IF OVERFLOW THEN SET CURRENT TO ZERO AND CONTINUE TO NEXT ELEMENT
            if (A.get(l) + 1 == 10) {
                A.set(l,0);
            //NO OVERFLOW SO END HERE
            } else {
                A.set(l, A.get(l) + 1);
                break;
            }
        }
        return A;
    }
}
