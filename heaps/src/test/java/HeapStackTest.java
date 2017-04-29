import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class HeapStackTest {

    private int length;

    @Test
    public void heapStack1(){
        length = 10;

        test(length);
    }

    @Test
    public void heapStack2(){
        length = 100;

        test(length);
    }

    private void test(int length) {
        List<Integer> values = StreamUtil.sequence(length);
        HeapStack stack = createStack(values);
        StreamUtil.revRange(0, length)
                .forEach(n -> {
                    assertEquals((Integer)n,stack.pop());
                });
    }

    private HeapStack createStack(List<Integer> values) {
        final HeapStack stack = new HeapStack();
        IntStream.range(0, values.size())
                .forEach(i ->
                {
                    stack.push(values.get(i));
                });
        return stack;
    }

}