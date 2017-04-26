import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SudokuCheckerTest {

    private boolean expected;
    private List<List<Integer>> board;

    @Test
    public void isValidSudoku1() {
        expected = true;
        board = Arrays.asList(
                Arrays.asList(5,3,0,0,7,0,0,0,0),
                Arrays.asList(6,0,0,1,9,5,0,0,0),
                Arrays.asList(0,9,8,0,0,0,0,6,0),
                Arrays.asList(8,0,0,0,6,0,0,0,3),
                Arrays.asList(4,0,0,8,0,3,0,0,1),
                Arrays.asList(7,0,0,0,2,0,0,0,6),
                Arrays.asList(0,6,0,0,0,0,2,8,0),
                Arrays.asList(0,0,0,4,1,9,0,0,5),
                Arrays.asList(0,0,0,0,8,0,0,7,9)
        );

        test(expected, board);
    }

    @Test
    public void isValidSudoku2() {
        expected = false;
        board = Arrays.asList(
                Arrays.asList(5,3,0,0,7,0,0,0,0),
                Arrays.asList(6,0,0,1,9,5,0,0,0),
                Arrays.asList(0,9,8,0,0,0,0,6,0),
                Arrays.asList(8,0,0,0,6,0,0,0,3),
                Arrays.asList(6,0,0,8,0,3,0,0,1),
                Arrays.asList(7,0,0,0,2,0,0,0,6),
                Arrays.asList(0,6,0,0,0,0,2,8,0),
                Arrays.asList(0,0,0,4,1,9,0,0,5),
                Arrays.asList(0,0,0,0,8,0,0,7,9));

        test(expected, board);
    }

    @Test
    public void isValidSudoku3() {
        expected = false;
        board = Arrays.asList(
                Arrays.asList(5,3,0,0,7,0,0,0,0),
                Arrays.asList(0,0,0,1,9,5,0,0,0),
                Arrays.asList(0,9,8,0,0,0,0,6,0),
                Arrays.asList(8,0,0,0,6,0,0,0,3),
                Arrays.asList(4,0,0,8,0,3,0,0,1),
                Arrays.asList(7,0,0,0,2,0,0,0,6),
                Arrays.asList(0,6,0,0,0,0,2,8,0),
                Arrays.asList(6,0,0,4,1,9,0,0,5),
                Arrays.asList(0,0,0,0,8,0,0,7,9));

        test(expected, board);
    }

    @Test
    public void isValidSudoku4() {
        expected = false;
        board = Arrays.asList(
                Arrays.asList(5,3,0,0,7,0,0,0,0),
                Arrays.asList(6,0,0,1,9,6,0,0,0),
                Arrays.asList(0,9,8,0,0,0,0,6,0),
                Arrays.asList(8,0,0,0,6,0,0,0,3),
                Arrays.asList(4,0,0,8,0,3,0,0,1),
                Arrays.asList(7,0,0,0,2,0,0,0,6),
                Arrays.asList(0,6,0,0,0,0,2,8,0),
                Arrays.asList(0,0,0,4,1,9,0,0,5),
                Arrays.asList(0,0,0,0,8,0,0,7,9));

        test(expected, board);
    }

    private void test(boolean expected, List<List<Integer>> board) {
        assertEquals(expected,SudokuChecker.isValidSudoku(board));
    }

}