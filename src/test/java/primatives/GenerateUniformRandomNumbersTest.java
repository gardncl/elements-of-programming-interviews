package primatives;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static primatives.GenerateUniformRandomNumbers.uniformRandom;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GenerateUniformRandomNumbersTest {

    private int lowerBound;
    private int upperBound;
    private double epsilon;

    @Test
    public void uniformRandom1() {
        lowerBound = 0;
        upperBound = 2;
        epsilon = .5;

        test(lowerBound, upperBound, epsilon);
    }

    @Test
    public void uniformRandom2() {
        lowerBound = -20;
        upperBound = -10;
        epsilon = 2;

        test(lowerBound, upperBound, epsilon);
    }

    @Test
    public void uniformRandom3() {
        lowerBound = 200;
        upperBound = 1000;
        epsilon = 10;

        test(lowerBound, upperBound, epsilon);
    }

    private void test(int lowerBound, int upperBound, double epsilon) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            numbers.add(uniformRandom(lowerBound,upperBound));
        }
        assertEquals(mean(Arrays.asList(lowerBound,upperBound)), mean(numbers), epsilon);
    }

    private double mean(List<Integer> numbers) {
        long sum = 0;
        for (Integer i : numbers)
            sum += i;
        return sum/numbers.size();
    }

}