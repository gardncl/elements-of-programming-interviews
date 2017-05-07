import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PaintBooleanMatrixTest {

    private final Boolean w = true;
    private final Boolean b = false;
    private List<List<Boolean>> expected;
    private List<List<Boolean>> A;
    private int x;
    private int y;

    @Test
    public void flipColor1() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(b,w,b,w,w,w,b,b,b,b),
                Arrays.asList(w,w,b,w,w,b,w,w,b,b),
                Arrays.asList(b,b,b,w,w,b,b,w,b,b),
                Arrays.asList(w,b,w,b,b,b,b,w,b,w),
                Arrays.asList(b,b,b,b,b,b,b,b,w,w),
                Arrays.asList(b,b,b,b,b,b,b,b,b,b),
                Arrays.asList(b,b,b,b,b,b,b,w,w,b),
                Arrays.asList(b,b,b,b,b,b,b,w,w,w),
                Arrays.asList(b,b,b,b,b,b,b,b,b,b),
                Arrays.asList(b,b,b,b,b,b,b,b,b,w)
        );
        A = Arrays.asList(
                Arrays.asList(b,w,b,w,w,w,b,b,b,b),
                Arrays.asList(w,w,b,w,w,b,w,w,b,b),
                Arrays.asList(b,b,b,w,w,b,b,w,b,b),
                Arrays.asList(w,b,w,b,b,b,b,w,b,w),
                Arrays.asList(b,w,b,w,w,w,w,b,w,w),
                Arrays.asList(b,w,b,w,w,b,w,b,b,b),
                Arrays.asList(w,w,w,w,b,w,b,w,w,b),
                Arrays.asList(b,w,b,w,b,w,b,w,w,w),
                Arrays.asList(b,w,b,b,w,w,w,b,b,b),
                Arrays.asList(w,w,w,w,w,w,w,b,b,w)
        );
        x = 5;
        y = 4;

        test(expected, A, x, y);
    }

    @Test
    public void flipColor2() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(b,w,w,w,w,w,b,b,b,b),
                Arrays.asList(w,w,w,w,w,w,w,w,b,b),
                Arrays.asList(w,w,w,w,w,w,w,w,b,b),
                Arrays.asList(w,w,w,w,w,w,w,w,b,w),
                Arrays.asList(w,w,w,w,w,w,w,w,w,w),
                Arrays.asList(w,w,w,w,w,w,w,w,w,w),
                Arrays.asList(w,w,w,w,w,w,w,w,w,w),
                Arrays.asList(w,w,w,w,w,w,w,w,w,w),
                Arrays.asList(w,w,w,w,w,w,w,w,w,w),
                Arrays.asList(w,w,w,w,w,w,w,w,w,w)
        );
        A = Arrays.asList(
                Arrays.asList(b,w,b,w,w,w,b,b,b,b),
                Arrays.asList(w,w,b,w,w,b,w,w,b,b),
                Arrays.asList(b,b,b,w,w,b,b,w,b,b),
                Arrays.asList(w,b,w,b,b,b,b,w,b,w),
                Arrays.asList(b,b,b,b,b,b,b,b,w,w),
                Arrays.asList(b,b,b,b,b,b,b,b,b,b),
                Arrays.asList(b,b,b,b,b,b,b,w,w,b),
                Arrays.asList(b,b,b,b,b,b,b,w,w,w),
                Arrays.asList(b,b,b,b,b,b,b,b,b,b),
                Arrays.asList(b,b,b,b,b,b,b,b,b,w)
        );
        x = 3;
        y = 6;

        test(expected, A, x, y);
    }

    private void test(List<List<Boolean>> expected, List<List<Boolean>> A, int x, int y) {
        PaintBooleanMatrix.flipColor(A, x, y);
        assertEquals(expected, A);
    }

}