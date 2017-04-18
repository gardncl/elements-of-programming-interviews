package arrays;

import java.util.ArrayList;
import java.util.List;

public class PermuteElements {

    /*
    6.9

    Given an array A of n elements and a permutation P, apply P to A.
     */

    public static void applyPermutation(List<Integer> perm, List<Integer> a) {
        List<Integer> sorted = new ArrayList<>();
        for (int i = 0; i < perm.size(); i++) {
            sorted.add(a.get(perm.get(i)));
        }
        for (int i = 0; i < sorted.size(); i++) {
            a.set(i, sorted.get(i));
        }
    }
}
