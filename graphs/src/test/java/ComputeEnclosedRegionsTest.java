import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeEnclosedRegionsTest {

    private final Boolean w = true;
    private final Boolean b = false;
    private List<List<Boolean>> expected;
    private List<List<Boolean>> board;

    @Test
    public void fillSurroundingRegions1() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(b,b,b,b),
                Arrays.asList(w,b,b,b),
                Arrays.asList(b,b,b,b),
                Arrays.asList(b,b,b,b)
        );
        board = Arrays.asList(
                Arrays.asList(b,b,b,b),
                Arrays.asList(w,b,w,b),
                Arrays.asList(b,w,w,b),
                Arrays.asList(b,b,b,b)
        );

        test(expected, board);
    }

    @Test
    public void fillSurroundingRegions2() throws Exception {
        expected = Arrays.asList(
                Arrays.asList(b,b,b,b,b,b,b,b,b,b),
                Arrays.asList(b,b,b,b,b,b,w,w,b,b),
                Arrays.asList(b,b,b,b,b,b,b,w,b,b),
                Arrays.asList(b,b,w,b,b,b,b,w,b,b),
                Arrays.asList(b,b,b,w,w,w,w,b,b,b),
                Arrays.asList(b,b,b,w,w,b,w,b,b,b),
                Arrays.asList(b,b,b,b,b,b,b,w,w,b),
                Arrays.asList(b,b,b,w,b,b,b,w,w,b),
                Arrays.asList(b,b,b,b,b,b,b,b,b,b),
                Arrays.asList(b,b,b,b,b,b,b,b,b,b)
        );
        board = Arrays.asList(
                Arrays.asList(b,w,b,w,w,w,b,b,b,b),
                Arrays.asList(w,w,b,w,w,b,w,w,b,b),
                Arrays.asList(b,b,b,w,w,b,b,w,b,b),
                Arrays.asList(w,b,w,b,b,b,b,w,b,w),
                Arrays.asList(b,w,b,w,w,w,w,b,w,w),
                Arrays.asList(b,w,b,w,w,b,w,b,b,b),
                Arrays.asList(w,w,w,b,b,w,b,w,w,b),
                Arrays.asList(b,w,b,w,b,w,b,w,w,b),
                Arrays.asList(b,w,b,b,w,w,w,b,b,b),
                Arrays.asList(w,w,w,w,w,w,w,b,b,w)
        );

        test(expected, board);
    }

    private void test(List<List<Boolean>> expected, List<List<Boolean>> board) {
        ComputeEnclosedRegions.fillSurroundingRegions(board);
        assertEquals(expected, board);
    }

}