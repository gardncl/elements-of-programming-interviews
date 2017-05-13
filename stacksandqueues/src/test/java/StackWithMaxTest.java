import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class StackWithMaxTest {

    private final int N = 5;
    private int length;

    @Test
    public void stackWithMax1(){
        length = 10;

        test(length);
    }

    @Test
    public void stackWithMax2(){
        length = 100;

        test(length);
    }

    private void test(int length) {
        List<Integer> values = StreamUtil.sequence(length);
        final Integer max = Collections.max(values);
        assertTracksMax(values);

        IntStream.range(0, N)
                .forEach(n -> {
                    Collections.shuffle(values);
                    StackWithMax stack = createStack(values);
                    Assert.assertEquals(max, stack.max());
                });
    }

    private void assertTracksMax(List<Integer> values) {
        final StackWithMax stackWithMax = new StackWithMax();

        StreamUtil.revRange(0, values.size()).forEach(
                i -> {
                    stackWithMax.push(values.get(i));
                }
        );

        IntStream.range(0, values.size()).forEach(
                i -> {
                    Assert.assertEquals(values.get(i), stackWithMax.pop());
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