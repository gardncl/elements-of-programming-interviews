import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeGrayCodeTest {

    private List<Integer> expected;
    private int numBits;

    @Test
    public void grayCode1() throws Exception {
        expected = Arrays.asList(0,1,2,3);
        numBits = 2;

        test(expected, numBits);
    }

    @Test
    public void grayCode2() throws Exception {
        expected = Arrays.asList(0,1,3,2,6,7,5,4);
        numBits = 3;

        test(expected, numBits);
    }

    private void test(List<Integer> expected, int numBits) {
        AssertUtils.assertSameContentsInt(expected, ComputeGrayCode.grayCode(numBits));
    }

}