import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratePowerSetTest {

    private List<List<Integer>> expected;
    private List<Integer> A;

    @Test
    public void generatePowerSet1() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(-1),
                Arrays.asList(0)
        );
        A = Arrays.asList(0);


        test(expected, A);
    }

    @Test
    public void generatePowerSet2() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(-1),
                Arrays.asList(0),
                Arrays.asList(1),
                Arrays.asList(0,1)
        );
        A = Arrays.asList(0,1);


        test(expected, A);
    }

    @Test
    public void generatePowerSet3() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(-1),
                Arrays.asList(0),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(0,1),
                Arrays.asList(0,2),
                Arrays.asList(1,2),
                Arrays.asList(0,1,2)

        );
        A = Arrays.asList(0,1,2);


        test(expected, A);
    }

    private void test(List<List<Integer>> expected, List<Integer> A) {
        List<List<Integer>> powerSet = GeneratePowerSet.generatePowerSet(A);
        assertEquals(expected.size(), powerSet.size());
        AssertUtils.assertListOfListsEqual(expected, powerSet);
    }

}