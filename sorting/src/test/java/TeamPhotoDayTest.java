import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TeamPhotoDayTest {

    private boolean expected;
    private TeamPhotoDay.Team A;
    private TeamPhotoDay.Team B;

    @Test
    public void validPlacementExists1() throws Exception {
        expected = false;
        A = new TeamPhotoDay.Team(Arrays.asList(
                new TeamPhotoDay.Player(5),
                new TeamPhotoDay.Player(5),
                new TeamPhotoDay.Player(5)
        ));
        B = new TeamPhotoDay.Team(Arrays.asList(
                new TeamPhotoDay.Player(5),
                new TeamPhotoDay.Player(5),
                new TeamPhotoDay.Player(5)
        ));

        test(expected, A, B);
    }

    @Test
    public void validPlacementExists2() throws Exception {
        expected = true;
        A = new TeamPhotoDay.Team(Arrays.asList(
                new TeamPhotoDay.Player(5),
                new TeamPhotoDay.Player(7),
                new TeamPhotoDay.Player(4),
                new TeamPhotoDay.Player(5),
                new TeamPhotoDay.Player(6)
        ));
        B = new TeamPhotoDay.Team(Arrays.asList(
                new TeamPhotoDay.Player(3),
                new TeamPhotoDay.Player(5),
                new TeamPhotoDay.Player(5),
                new TeamPhotoDay.Player(4),
                new TeamPhotoDay.Player(4)
        ));

        test(expected, A, B);
    }

    @Test
    public void validPlacementExists3() throws Exception {
        expected = false;
        A = new TeamPhotoDay.Team(Arrays.asList(
                new TeamPhotoDay.Player(5),
                new TeamPhotoDay.Player(7),
                new TeamPhotoDay.Player(4),
                new TeamPhotoDay.Player(5),
                new TeamPhotoDay.Player(6)
        ));
        B = new TeamPhotoDay.Team(Arrays.asList(
                new TeamPhotoDay.Player(3),
                new TeamPhotoDay.Player(5),
                new TeamPhotoDay.Player(6),
                new TeamPhotoDay.Player(5),
                new TeamPhotoDay.Player(4)
        ));

        test(expected, A, B);
    }

    private void test(boolean expected, TeamPhotoDay.Team A, TeamPhotoDay.Team B) {
        assertEquals(expected, TeamPhotoDay.validPlacementExists(A,B));
    }

}