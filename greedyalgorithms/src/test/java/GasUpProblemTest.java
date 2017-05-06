import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GasUpProblemTest {

    private int expected;
    private List<Integer> gallons;
    private List<Integer> distances;

    @Test
    public void findAmpleCity1() throws Exception {
        expected = 3;
        gallons = Arrays.asList(
                50,20,5,30,25,10,10
        );
        distances = Arrays.asList(
                900,600,200,400,600,200,100
        );

        test(expected,gallons,distances);
    }

    private void test(int expected, List<Integer> gallons, List<Integer> distances) {
        assertEquals(expected, GasUpProblem.findAmpleCity(gallons, distances));
    }

}