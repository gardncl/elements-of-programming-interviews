import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RenderCalendarTest {

    private int expected;
    private List<Tuple> A;

    @Test
    public void findEvents1() throws Exception {
        expected = 0;
        A = Arrays.asList(
                new Tuple(0, 1),
                new Tuple(1, 2),
                new Tuple(2, 10)
        );

        test(expected, A);
    }

    @Test
    public void findEvents2() throws Exception {
        expected = 3;
        A = Arrays.asList(
                new Tuple(0, 10),
                new Tuple(1, 5),
                new Tuple(2, 10)
        );

        test(expected, A);
    }

    @Test
    public void findEvents3() throws Exception {
        expected = 3;
        A = Arrays.asList(
                new Tuple(1, 5),
                new Tuple(2, 7),
                new Tuple(4, 5),
                new Tuple(6, 10),
                new Tuple(8, 9),
                new Tuple(9, 17),
                new Tuple(11, 13),
                new Tuple(12, 15),
                new Tuple(14, 15)
        );

        test(expected, A);
    }

    private void test(int expected, List<Tuple> A) {
        assertEquals(expected, RenderCalendar.findEvents(A));
    }

}