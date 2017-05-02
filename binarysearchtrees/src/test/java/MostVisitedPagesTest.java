import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MostVisitedPagesTest {

    private List<Integer> expected;
    private List<Integer> pages;
    private int k;

    @Test
    public void findMostVisited1() throws Exception {
        expected = Arrays.asList(
                4
        );
        pages = Arrays.asList(
                2,3,6,4,2,
                6,4,3,7,8,
                5,4,3,2,1,
                5,6,4,3,2,
                3,4,7,6,4
        );
        k = 1;

        test(expected, pages, k);
    }

    @Test
    public void findMostVisited2() throws Exception {
        expected = Arrays.asList(
                2,3,4
        );
        pages = Arrays.asList(
                2,3,6,4,2,
                6,4,3,7,8,
                5,4,3,2,1,
                5,6,4,3,2,
                3,4,7,6,2
        );
        k = 3;

        test(expected, pages, k);
    }

    @Test
    public void findMostVisited3() throws Exception {
        expected = Arrays.asList(
                2,3,4,6,7
        );
        pages = Arrays.asList(
                2,3,6,4,2,
                6,4,3,7,8,
                5,4,3,2,1,
                5,6,4,3,2,
                3,4,7,6,2
        );
        k = 5;

        test(expected, pages, k);
    }

    private void test(List<Integer> expected, List<Integer> pages, int k) {
        AssertUtils.assertSameContentsInt(expected, MostVisitedPages.findMostVisited(pages, k));
    }

}