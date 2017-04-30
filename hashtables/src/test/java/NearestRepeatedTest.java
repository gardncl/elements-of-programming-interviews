import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NearestRepeatedTest {

    private int expected;
    private List<String> list;

    @Test
    public void findNearest1() throws Exception {
        list = Arrays.asList(
                "Mark",
                "Steve",
                "Mason",
                "Joan",
                "Jordan",
                "Greg",
                "Mark",
                "Garth",
                "Joan",
                "Daisy",
                "Joan",
                "Marcus"
        );
        expected = 2;

        test(expected, list);
    }

    @Test
    public void findNearest2() throws Exception {
        list = Arrays.asList(
                "Mark",
                "Steve",
                "Mason",
                "Joan",
                "Jordan",
                "Greg",
                "Mark",
                "Garth",
                "Joan",
                "Daisy",
                "Garth",
                "Marcus"
        );
        expected = 3;

        test(expected, list);
    }

    @Test
    public void findNearest3() throws Exception {
        list = Arrays.asList(
                "Mark",
                "Steve",
                "Mason",
                "Joan",
                "Jordan",
                "Dylan",
                "Robert",
                "Garth",
                "Mark",
                "Daisy",
                "Greg",
                "Marcus"
        );
        expected = 8;

        test(expected, list);
    }

    private static void test(int expected, List<String> list) {
        assertEquals(expected, NearestRepeated.findNearest(list));
    }
    
}