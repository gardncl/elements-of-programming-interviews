package arrays;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumeratePrimesTest {

    private List<Integer> primes;
    private int n;

    @Test
    public void enumeratePrimes1() {
        primes = Arrays.asList();
        n = 1;

        test(primes, n);
    }

    @Test
    public void enumeratePrimes2() {
        primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17);
        n = 18;

        test(primes, n);
    }

    void test(List<Integer> primes, int n) {
        assertEquals(primes, arrays.EnumeratePrimes.enumeratePrimes(n));
    }

}