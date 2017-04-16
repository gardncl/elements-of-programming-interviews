package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static strings.LookAndSayProblem.lookAndSay;

class LookAndSayProblemTest {

    private String expected;
    private int n;

    @Test
    void lookAndSay1() {
        expected = "1";
        n = 1;

        test(expected, n);
    }

    @Test
    void lookAndSay2() {
        expected = "11";
        n = 2;

        test(expected, n);
    }

    @Test
    void lookAndSay3() {
        expected = "21";
        n = 3;

        test(expected, n);
    }

    @Test
    void lookAndSay4() {
        expected = "1211";
        n = 4;

        test(expected, n);
    }

    @Test
    void lookAndSay5() {
        expected = "111221";
        n = 5;

        test(expected, n);
    }

    @Test
    void lookAndSay6() {
        expected = "312211";
        n = 6;

        test(expected, n);
    }

    @Test
    void lookAndSay7() {
        expected = "13112221";
        n = 7;

        test(expected, n);
    }

    @Test
    void lookAndSay8() {
        expected = "1113213211";
        n = 8;

        test(expected, n);
    }

    private void test(String expected, int n) {
        assertEquals(expected, lookAndSay(n));
    }

}