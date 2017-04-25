package stacksandqueues;

import org.junit.Assert;
import org.junit.Test;
import utils.StreamUtil;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static utils.StreamUtil.sequence;

public class StackWithMaxTest {

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
                    stacksandqueues.StackWithMax stack = createStack(values);
                    Assert.assertEquals(max, stack.max());
                });
    }

    private void assertTracksMax(List<Integer> values) {
        final stacksandqueues.StackWithMax stackWithMax = new stacksandqueues.StackWithMax();

        StreamUtil.revRange(0, values.size()).forEach(
                i -> {
                    stackWithMax.push(values.get(i));
                }
        );

        StreamUtil.revRange(0, values.size()).forEach(
                i -> {
                    Assert.assertEquals(values.get(i), stackWithMax.pop());
                }
        );
    }

    private stacksandqueues.StackWithMax createStack(List<Integer> values) {
        final stacksandqueues.StackWithMax stack = new stacksandqueues.StackWithMax();
        IntStream.range(0, values.size())
                .forEach(i ->
                {
                    stack.push(values.get(i));
                });
        return stack;
    }

}