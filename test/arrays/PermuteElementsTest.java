package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static arrays.PermuteElements.applyPermutation;
import static org.junit.jupiter.api.Assertions.*;

class PermuteElementsTest {

    List<Integer> expected;
    List<Integer> perm;
    List<Integer> a;


    @Test
    void applyPermutation1() {
        expected = Arrays.asList(2, 1);
        perm = Arrays.asList(1, 0);
        a = Arrays.asList(1, 2);

        test(expected, perm, a);
    }

    @Test
    void applyPermutation2() {
        expected = Arrays.asList(1);
        perm = Arrays.asList(0);
        a = Arrays.asList(1);

        test(expected, perm, a);
    }

    @Test
    void applyPermutation3() {
        expected = Arrays.asList(150, 50, 100, 200);
        perm = Arrays.asList(2, 0, 1, 3);
        a = Arrays.asList(50, 100, 150, 200);

        test(expected, perm, a);
    }

    private void test(List<Integer> expected, List<Integer> perm, List<Integer> a) {
        applyPermutation(perm, a);
        assertEquals(expected, a);
    }

}