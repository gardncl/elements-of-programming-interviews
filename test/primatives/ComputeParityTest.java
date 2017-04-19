package primatives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static primatives.ComputeParity.parity;

class ComputeParityTest {

    private short expected;
    private long n;


    @Test
    void parity1() {
        expected = 0;
        n = 0;

        test(expected, n);
    }

    @Test
    void parity2() {
        expected = 1;
        n = 1;

        test(expected, n);
    }

    @Test
    void parity3() {
        expected = 0;
        n = 2;

        test(expected, n);
    }

    @Test
    void parity4() {
        expected = 0;
        n = 152950;

        test(expected, n);
    }

    private void test(short expected, long n) {
        assertEquals(expected, parity(n));
    }


}