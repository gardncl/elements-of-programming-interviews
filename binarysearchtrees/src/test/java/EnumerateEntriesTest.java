import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class EnumerateEntriesTest {

    private List<EnumerateEntries.ABSqrt2> expected;
    private int k;

    @Test
    public void generateFirst1() throws Exception {
        expected = Arrays.asList(
                new EnumerateEntries.ABSqrt2(0,0),
                new EnumerateEntries.ABSqrt2(1,0),
                new EnumerateEntries.ABSqrt2(0,1)
                );
        k = 3;

        test(expected, k);
    }

    @Test
    public void generateFirst2() throws Exception {
        expected = Arrays.asList(
                new EnumerateEntries.ABSqrt2(0,0),
                new EnumerateEntries.ABSqrt2(1,0),
                new EnumerateEntries.ABSqrt2(0,1),
                new EnumerateEntries.ABSqrt2(2,0),
                new EnumerateEntries.ABSqrt2(1,1)
        );
        k = 5;

        test(expected, k);
    }

    @Test
    public void generateFirst3() throws Exception {
        expected = Arrays.asList(
                new EnumerateEntries.ABSqrt2(0,0),
                new EnumerateEntries.ABSqrt2(1,0),
                new EnumerateEntries.ABSqrt2(0,1),
                new EnumerateEntries.ABSqrt2(2,0),
                new EnumerateEntries.ABSqrt2(1,1),
                new EnumerateEntries.ABSqrt2(0,2),
                new EnumerateEntries.ABSqrt2(3,0),
                new EnumerateEntries.ABSqrt2(2,1),
                new EnumerateEntries.ABSqrt2(1,2),
                new EnumerateEntries.ABSqrt2(4,0)
        );
        k = 10;

        test(expected, k);
    }

    private void test(List<EnumerateEntries.ABSqrt2> expected, int k) {
        assertEquals(expected, EnumerateEntries.generateFirst(k));
    }
}