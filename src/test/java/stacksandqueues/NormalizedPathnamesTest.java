package stacksandqueues;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static stacksandqueues.NormalizedPathnames.shortestEquivalentPath;

public class NormalizedPathnamesTest {

    private String expected;
    private String pathname;

    @Test
    public void shortestEquivalentPath1() {
        expected = "/usr/bin/gcc";
        pathname = "/usr/lib/../bin/gcc";

        test(expected, pathname);
    }

    @Test
    public void shortestEquivalentPath2() {
        expected = "scripts/awkscripts";
        pathname = "scripts/./../scripts/awkscripts/./.";

        test(expected, pathname);
    }

    @Test
    public void shortestEquivalentPath3() {
        expected = "scripts/awkscripts";
        pathname = "scripts/./../scripts/../../../usr/lib/scripts/awkscripts/./.";

        test(expected, pathname);
    }

    private void test(String expected, String pathname) {
        assertEquals(expected, shortestEquivalentPath(pathname));
    }

}