package stacksandqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static stacksandqueues.NormalizedPathnames.shortestEquivalentPath;

class NormalizedPathnamesTest {

    private String expected;
    private String pathname;

    @Test
    void shortestEquivalentPath1() {
        expected = "/usr/bin/gcc";
        pathname = "/usr/lib/../bin/gcc";

        test(expected, pathname);
    }

    @Test
    void shortestEquivalentPath2() {
        expected = "scripts/awkscripts";
        pathname = "scripts/./../scripts/awkscripts/./.";

        test(expected, pathname);
    }

    @Test
    void shortestEquivalentPath3() {
        expected = "scripts/awkscripts";
        pathname = "scripts/./../scripts/../../../usr/lib/scripts/awkscripts/./.";

        test(expected, pathname);
    }

    private void test(String expected, String pathname) {
        assertEquals(expected, shortestEquivalentPath(pathname));
    }

}