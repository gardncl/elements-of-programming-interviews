import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MergeSortedTest {

    private List<Integer> expected;
    private List<Integer> A;
    private int m;
    private List<Integer> B;
    private int n;

    @Test
    public void merge1() throws Exception {
        expected = Arrays.asList(3,5,7,11,13,17,19,null);
        A = Arrays.asList(5,13,17,null,null,null,null,null);
        m = 3;
        B = Arrays.asList(3,7,11,19);
        n = B.size();

        test(expected, A, m, B, n);
    }

    @Test
    public void merge2() throws Exception {
        expected = Arrays.asList(1,2,3,4,5,6,7);
        A = Arrays.asList(1,2,3,4,5,null,null);
        m = 5;
        B = Arrays.asList(3,4,5,6,7);
        n = B.size();

        test(expected, A, m, B, n);
    }


    private void test(List<Integer> expected, List<Integer> A, int m, List<Integer> B, int n) {
        MergeSorted.merge(A,m,B,n);
        assertEquals(expected, A);
    }


}