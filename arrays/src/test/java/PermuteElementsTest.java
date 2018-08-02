import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PermuteElementsTest {

    List<Integer> expected;
    List<Integer> perm;
    List<Integer> a;


    @Test
    public void applyPermutation1() {
        expected = Arrays.asList(2, 1);
        perm = Arrays.asList(1, 0);
        a = Arrays.asList(1, 2);

        test(expected, perm, a);
    }

    @Test
    public void applyPermutation2() {
        expected = Arrays.asList(1);
        perm = Arrays.asList(0);
        a = Arrays.asList(1);

        test(expected, perm, a);
    }

    @Test
    public void applyPermutation3() {
        expected = Arrays.asList(100, 150, 50, 200);
        perm = Arrays.asList(2, 0, 1, 3);
        a = Arrays.asList(50, 100, 150, 200);

        test(expected, perm, a);
    }

    private void test(List<Integer> expected, List<Integer> perm, List<Integer> a) {
        PermuteElements.applyPermutation(perm, a);
        assertEquals(expected, a);
    }

}