package arrays;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static arrays.GenerateNonuniformRandomNumbers.getRandom;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class GenerateNonuniformRandomNumbersTest {

    private final int N = 10000;
    private List<Integer> values;
    private List<Double> probabilities;

    @Test
    public void nonUniformRandomNumberGeneration1() {
        values = Arrays.asList(1, 2, 3, 4, 5);
        probabilities = Arrays.asList(.2, .2, .2, .2, .2);

        test(values, probabilities);
    }

    @Test
    public void nonUniformRandomNumberGeneration2() {
        values = Arrays.asList(1, 2, 3, 4);
        probabilities = Arrays.asList(.1, .2, .3, .4);

        test(values, probabilities);
    }

    @Test
    public void nonUniformRandomNumberGeneration3() {
        values = Arrays.asList(1, 2, 3, 4, 5);
        probabilities = Arrays.asList(.9, .025, .025, .025, .025);

        test(values, probabilities);
    }

    private void test(List<Integer> values, List<Double> probabilities) {
        final Map<Integer, AtomicInteger> results = values.stream().map(integer -> new AbstractMap.SimpleImmutableEntry<>(integer, new AtomicInteger(0)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        IntStream.range(0, N)
                .parallel()
                .forEach(i -> {
                    results.get(getRandom(values,probabilities)).incrementAndGet();
                });

        IntStream.range(0, values.size())
                .parallel()
                .forEach(i -> {
                    double expectedValue = N * probabilities.get(i);
                    assertThat(results.get(values.get(i)), allOf(greaterThan(expectedValue - 50), lessThan(expectedValue + 50)));
                });
    }

}