package primatives;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static primatives.GenerateUniformRandomNumbers.uniformRandom;
import static org.junit.jupiter.api.Assertions.assertEquals;


class GenerateUniformRandomNumbersTest {

    private final double EPSILON = 1;
    private int lowerBound;
    private int upperBound;

    @Test
    void uniformRandom1() {
        lowerBound = 0;
        upperBound = 2;

        test(lowerBound, upperBound);
    }

    @Test
    void uniformRandom2() {
        lowerBound = -20;
        upperBound = -10;

        test(lowerBound, upperBound);
    }

    @Test
    void uniformRandom3() {
        lowerBound = 200;
        upperBound = 1000;

        test(lowerBound, upperBound);
    }

    private void test(int lowerBound, int upperBound) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            numbers.add(uniformRandom(lowerBound,upperBound));
        }
        double mean = (upperBound - lowerBound) / 2;
        assertEquals(mean, mean(numbers), EPSILON);
    }

    private double mean(List<Integer> numbers) {
        long sum = 0;
        for (Integer i : numbers)
            sum += i;
        return sum/numbers.size();
    }

}