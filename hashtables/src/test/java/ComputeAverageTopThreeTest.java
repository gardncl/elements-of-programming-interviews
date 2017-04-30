import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ComputeAverageTopThreeTest {

    private String expected;
    private List<ComputeAverageTopThree.NameScore> nameScoreData;



    @Test
    public void findStudent1() throws Exception {
        expected = "Simon";
        nameScoreData = Arrays.asList(
                new ComputeAverageTopThree.NameScore("Simon", 98),
                new ComputeAverageTopThree.NameScore("Matt", 39),
                new ComputeAverageTopThree.NameScore("Julius", 78),
                new ComputeAverageTopThree.NameScore("Simon", 90),
                new ComputeAverageTopThree.NameScore("Julius", 72),
                new ComputeAverageTopThree.NameScore("Julius", 77),
                new ComputeAverageTopThree.NameScore("Matt", 85),
                new ComputeAverageTopThree.NameScore("Dmitri", 98),
                new ComputeAverageTopThree.NameScore("Matt", 82),
                new ComputeAverageTopThree.NameScore("Simon", 88),
                new ComputeAverageTopThree.NameScore("Matt", 89),
                new ComputeAverageTopThree.NameScore("Dmitri", 95),
                new ComputeAverageTopThree.NameScore("Simon", 14)
        );

        test(expected, nameScoreData);
    }

    @Test
    public void findStudent2() throws Exception {
        expected = "Simon";
        nameScoreData = Arrays.asList(
                new ComputeAverageTopThree.NameScore("Simon", 95),
                new ComputeAverageTopThree.NameScore("Simon", 95),
                new ComputeAverageTopThree.NameScore("Simon", 95),
                new ComputeAverageTopThree.NameScore("Simon", 0),
                new ComputeAverageTopThree.NameScore("Dmitri", 90),
                new ComputeAverageTopThree.NameScore("Dmitri", 90),
                new ComputeAverageTopThree.NameScore("Dmitri", 90),
                new ComputeAverageTopThree.NameScore("Matt", 100),
                new ComputeAverageTopThree.NameScore("Matt", 100)
                );

        test(expected, nameScoreData);
    }

    private void test(String expected, List<ComputeAverageTopThree.NameScore> nameScoreData) {
        assertEquals(expected, ComputeAverageTopThree.findStudent(nameScoreData.iterator()));
    }

}