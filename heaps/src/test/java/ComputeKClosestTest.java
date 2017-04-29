import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeKClosestTest {

    private List<Star> expected;
    private int k;
    private Iterator<Star> stars;

    @Test
    public void getKClosest1() throws Exception {
        expected = Arrays.asList(
                new Star(0,0,1),
                new Star(0,0,2)
        );
        k = 1;
        stars = Arrays.asList(
                new Star(0,0,1)
        ).iterator();

        test(expected, k, stars);
    }

    @Test
    public void getKClosest2() throws Exception {
        expected = Arrays.asList(
                new Star(0,0,1),
                new Star(0,0,4),
                new Star(0,0,2),
                new Star(0,0,5),
                new Star(0,0,3)
        );
        k = 3;
        stars = Arrays.asList(
                new Star(0,0,1),
                new Star(0,0,2),
                new Star(0,0,3)
        ).iterator();

        test(expected, k, stars);
    }

    @Test
    public void getKClosest3() throws Exception {
        expected = Arrays.asList(
                new Star(0,0,75),
                new Star(0,0,23),
                new Star(0,0,131),
                new Star(0,0,99),
                new Star(0,0,67),
                new Star(0,0,70),
                new Star(0,0,99),
                new Star(0,0,3),
                new Star(0,0,23),
                new Star(0,0,100),
                new Star(0,0,32),
                new Star(0,0,43)
        );
        k = 5;
        stars = Arrays.asList(
                new Star(0,0,3),
                new Star(0,0,23),
                new Star(0,0,32),
                new Star(0,0,43),
                new Star(0,0,70)
        ).iterator();

        test(expected, k, stars);
    }

    private void test(List<Star> expected, int k, Iterator<Star> stars) {
        List<Star> result = ComputeKClosest.getKClosest(k, stars);
        try {
            for (Star star : expected) {
                if (!result.contains(star))
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