import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeKLargestTest {

    private List<Integer> expected;
    private List<Integer> list;
    private int k;

    @Test
    public void kLargestInBinaryHeap1() throws Exception {
        expected = Arrays.asList(7,8,9);
        list = Arrays.asList(8,3,4,2,6,5,7,9,1);
        k = 3;

        test(expected,list,k);
    }

    @Test
    public void kLargestInBinaryHeap2() throws Exception {
        expected = Arrays.asList(5,6,7,8,9);
        list = Arrays.asList(8,3,4,2,6,5,7,9,1);
        k = 5;

        test(expected,list,k);
    }

    private void test(List<Integer> expected, List<Integer> list, int k) {
        List<Integer> result = ComputeKLargest.kLargestInBinaryHeap(list, k);
        try {
            for (Integer i : expected) {
                if (!result.contains(i))
                    throw new AssertionError();
            }
        } catch (AssertionError e) {
            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append("\nExpected: "+expected.toString());
            errorMessage.append("\nActual: "+result.toString()+"\n");
            fail(errorMessage.toString());
        }
    }
}