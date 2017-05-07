import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchMazeTest {


    private final Boolean w = true;
    private final Boolean b = false;
    private List<Tuple> expected;
    private List<List<Boolean>> maze;
    private Tuple s;
    private Tuple e;

    @Test
    public void searchMaze1() throws Exception {
        expected = Collections.emptyList();
        maze = Arrays.asList(
                Arrays.asList(b,w,w,w,w,w,b,b,w,w),
                Arrays.asList(w,w,b,w,w,w,b,w,w,w),
                Arrays.asList(b,w,b,w,w,b,b,b,b,b),
                Arrays.asList(w,w,w,b,b,b,w,w,b,w),
                Arrays.asList(w,b,b,w,w,w,w,w,w,w),
                Arrays.asList(w,b,b,w,w,b,w,b,b,w),
                Arrays.asList(w,w,w,w,b,w,w,w,w,w),
                Arrays.asList(b,w,b,w,b,w,b,w,w,w),
                Arrays.asList(b,w,b,b,w,w,w,b,b,b),
                Arrays.asList(w,w,w,w,w,w,w,b,b,w)
        );
        s = new Tuple(9,0);
        e = new Tuple(0,9);

        test(expected,maze,s,e);
    }

    @Test
    public void searchMaze2() throws Exception {
        expected = Arrays.asList(
                new Tuple(9,0),
                new Tuple(9,1),
                new Tuple(9,2),
                new Tuple(9,3),
                new Tuple(9,4),
                new Tuple(9,5),
                new Tuple(8,5),
                new Tuple(7,5),
                new Tuple(6,5),
                new Tuple(6,6),
                new Tuple(5,6),
                new Tuple(4,6),
                new Tuple(4,7),
                new Tuple(3,7),
                new Tuple(2,7),
                new Tuple(1,7),
                new Tuple(1,8),
                new Tuple(0,8),
                new Tuple(0,9)
        );
        maze = Arrays.asList(
                Arrays.asList(b,w,w,w,w,w,b,b,w,w),
                Arrays.asList(w,w,b,w,w,w,w,w,w,w),
                Arrays.asList(b,w,b,w,w,b,b,w,b,b),
                Arrays.asList(w,w,w,b,b,b,w,w,b,w),
                Arrays.asList(w,b,b,w,w,w,w,w,w,w),
                Arrays.asList(w,b,b,w,w,b,w,b,b,w),
                Arrays.asList(w,w,w,w,b,w,w,w,w,w),
                Arrays.asList(b,w,b,w,b,w,b,w,w,w),
                Arrays.asList(b,w,b,b,w,w,w,b,b,b),
                Arrays.asList(w,w,w,w,w,w,w,b,b,w)
        );
        s = new Tuple(9,0);
        e = new Tuple(0,9);

        test(expected,maze,s,e);
    }

    private void test(List<Tuple> expected, List<List<Boolean>> maze, Tuple s, Tuple e) {
        assertEquals(expected, SearchMaze.searchMaze(maze, s, e));
    }

}