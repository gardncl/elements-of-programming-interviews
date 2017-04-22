package primatives;

import java.util.Random;

public class GenerateUniformRandomNumbers {

    /*
    5.10

    How would you implement a random number generator that generates a random
    integer i between a and b, inclusive, given a random number generator that
    produces zero or one with equal probability? All values in [a,b] should be
    equally likely.
     */

    private static Random random = new Random();


    public static int uniformRandom(int lowerBound, int upperBound) {
        int range = upperBound - lowerBound + 1, result;
        do {
            result = 0;
            for (int i = 0; (1 << i) < range; ++i) {
                result = (result << 1) | randomBit();
            }
        } while (result >= range);

        return result + lowerBound;
    }


    private static int randomBit() {
        return random.nextInt(2);
    }
}
