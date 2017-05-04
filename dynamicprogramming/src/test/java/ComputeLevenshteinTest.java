import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeLevenshteinTest {

    private int expected;
    private String A;
    private String B;

    @Test
    public void levenschteinDistance1() throws Exception {
        expected = 4;
        A = "Saturday";
        B = "Sunday";

        test(expected, A, B);
    }

    @Test
    public void levenschteinDistance2() throws Exception {
        expected = 2;
        A = "book";
        B = "back";

        test(expected, A, B);
    }

    @Test
    public void levenschteinDistance3() throws Exception {
        expected = 9;
        A = "fantastic";
        B = "excellent";

        test(expected, A, B);
    }

    private void test(int expected, String A, String B) {
        assertEquals(expected, ComputeLevenshtein.levenschteinDistance(A,B));
    }

}