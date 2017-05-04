import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class KnapsackProblemTest {

    private int expected;
    private List<Tuple> items;
    private int capacity;

    @Test
    public void compute1() throws Exception {
        expected = 695;
        items = Arrays.asList(
                new Tuple(65,20),
                new Tuple(35,8),
                new Tuple(245,60),
                new Tuple(195,55),
                new Tuple(65,55),
                new Tuple(150,70),
                new Tuple(275,85),
                new Tuple(155,25),
                new Tuple(120,30),
                new Tuple(320,65),
                new Tuple(75,75),
                new Tuple(40,10),
                new Tuple(200,95),
                new Tuple(100,50),
                new Tuple(220,40),
                new Tuple(99,10)
        );
        capacity = 130;

        test(expected, items, capacity);
    }

    private void test(int expected, List<Tuple> items, int capacity) {
        assertEquals(expected, KnapsackProblem.compute(items, capacity));
    }

}