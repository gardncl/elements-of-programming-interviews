package stacksandqueues;

import org.junit.jupiter.api.Test;
import utils.StreamUtil;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static utils.StreamUtil.sequence;

class StackWithMaxTest {

    private final int N = 5;
    private List<Integer> values;

    @Test
    public void stackWithMax1(){
        values = sequence(10);

        test(values);
    }

    @Test
    public void stackWithMax2(){
        values = sequence(100);

        test(values);
    }

    private void test(List<Integer> values) {
        final Integer max = Collections.max(values);
        assertTracksMax(values);

        IntStream.range(0, N)
                .forEach(n -> {
                    Collections.shuffle(values);
                    StackWithMax stack = createStack(values);
                    assertEquals(max, stack.max());
                });
    }

    private void assertTracksMax(List<Integer> values) {
        final StackWithMax stackWithMax = new StackWithMax();

        StreamUtil.revRange(0, values.size()).forEach(
                i -> {
                    stackWithMax.push(values.get(i));
                }
        );

        StreamUtil.revRange(0, values.size()).forEach(
                i -> {
                    assertEquals(values.get(i), stackWithMax.pop());
                }
        );
    }

    private StackWithMax createStack(List<Integer> values) {
        final StackWithMax stack = new StackWithMax();
        IntStream.range(0, values.size())
                .forEach(i ->
                {
                    stack.push(values.get(i));
                });
        return stack;
    }

}