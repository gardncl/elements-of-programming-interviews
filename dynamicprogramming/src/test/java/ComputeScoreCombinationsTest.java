import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeScoreCombinationsTest {

    private int expected;
    private int finalScore;
    private List<Integer> playScores;


    @Test
    public void compute1() throws Exception {
        expected = 4;
        finalScore = 12;
        playScores = Arrays.asList(2,3,7);

        test(expected,finalScore, playScores);
    }

    @Test
    public void compute2() throws Exception {
        expected = 2;
        finalScore = 9;
        playScores = Arrays.asList(2,3,7);

        test(expected,finalScore, playScores);
    }

    private void test(int expected, int finalScore, List<Integer> playScores) {
        assertEquals(expected, ComputeScoreCombinations.compute(finalScore, playScores));
    }

}