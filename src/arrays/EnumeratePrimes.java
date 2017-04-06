package arrays;

import java.util.ArrayList;
import java.util.List;

public class EnumeratePrimes {

    /*
    Write a program that takes an integer argument
    and returns all the primes between 1 and that integer.
     */

    public static List<Integer> enumeratePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        boolean isPrime;
        if (n < 2) {
            return primes;
        }

        primes.add(2);
        for (int i = 3; i < n; i=i+2) {
            isPrime = true;
            for( int prime : primes ) {
                if (i%prime==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                primes.add(i);
        }
        return primes;
    }
}
