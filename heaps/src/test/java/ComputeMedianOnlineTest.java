import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeMedianOnlineTest {

    private List<Double> expected;
    private Iterator<Integer> input;

    @Test
    public void onlineMedian1() throws Exception {
        expected = Arrays.asList(1.,.5,1.,2.,2.,1.5,1.);
        input = Arrays.asList(1,0,3,5,2,0,1).iterator();

        test(expected, input);
    }

    private void test(List<Double> expected, Iterator<Integer> input) {
        assertEquals(expected, ComputeMedianOnline.onlineMedian(input));
    }

}