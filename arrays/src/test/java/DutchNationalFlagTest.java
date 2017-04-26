import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class DutchNationalFlagTest {

    private Integer pivot;
    private List<Integer> unordered;
    private List<Integer> ordered;

    @Test
    public void dutchNationalFlag1() {
        pivot = 0;
        unordered = Arrays.asList(1);
        ordered = Arrays.asList(1);

        test(pivot, unordered, ordered);
    }

    @Test
    public void dutchNationalFlag2() {
        pivot = 4;
        unordered = Arrays.asList(3, 3, 3, 2, 2, 2, 1, 1, 1);
        ordered = Arrays.asList(2, 2, 3, 3, 3, 2, 1, 1, 1);

        test(pivot, unordered, ordered);
    }

    @Test
    public void dutchNationalFlag3() {
        pivot = 8;
        unordered = Arrays.asList(3, 3, 3, 2, 2, 2, 1, 1, 1);
        ordered = Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3);

        test(pivot, unordered, ordered);
    }

    @Test
    public void dutchNationalFlag4() {
        pivot = 7;
        unordered = Arrays.asList(5, 4, 2, 3, 5, 1, 7, 6, 4, 9, 6, 2, 4, 3, 2, 4, 6, 7, 8);
        ordered = Arrays.asList(5, 4, 2, 3, 5, 1, 6, 7, 4, 9, 6, 2, 4, 3, 2, 4, 6, 7, 8);

        test(pivot, unordered, ordered);
    }

    @Test
    public void dutchNationalFlag5() {
        pivot = 18;
        unordered = Arrays.asList(5, 4, 2, 3, 5, 1, 7, 6, 4, 9, 6, 2, 4, 3, 2, 4, 6, 7, 8);
        ordered = Arrays.asList(5, 4, 2, 3, 5, 1, 7, 6, 4, 6, 2, 4, 3, 2, 4, 6, 7, 8, 9);

        test(pivot, unordered, ordered);
    }

    private void test(Integer pivot, List<Integer> unordered, List<Integer> ordered) {
        DutchNationalFlag.dutchNationalFlag(pivot, unordered);
        assertEquals(ordered,unordered);
    }

}