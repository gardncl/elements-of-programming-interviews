package primatives;

public class FindClosestInteger {

    /*
    5.4

    Write a program which takes as input a non-negative integer x and
    returns a number y which is not equal to x, but has the same weight
    as x and their difference, |y - x|, is as small as possible.
    You can assume x is not 0, or all 1s.
     */

    public static long closestIntSameBitCount(long x) {
        for (int i = 0; i < 62; i++) {
            if (((x >>> i) & 1) != ((x >>> i + 1) & 1)) {
                long MASK = ((1 << i) | (1 << i + 1));
                return x ^ MASK;
            }
        }
        return x;
    }
}
