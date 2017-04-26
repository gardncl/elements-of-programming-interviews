import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class QueueWithMaxTest {

    private final int N = 5;
    private int length;

    @Test
    public void queueWithMax1() {
        length = 10;

        test(length);
    }

    @Test
    public void queueWithMax2() {
        length = 10;

        test(length);
    }

    private void test(int length) {
        List<Integer> values = StreamUtil.sequence(length);
        final Integer max = Collections.max(values);
        assertTracksMax(values);

        IntStream.range(0, N)
                .forEach(n -> {
                    Collections.shuffle(values);
                    QueueWithMax queue = createQueue(values);
                    Assert.assertEquals(max, queue.max());
                });
    }

    private void assertTracksMax(List<Integer> values) {
        final QueueWithMax queue = new QueueWithMax();

        StreamUtil.revRange(0, values.size()).forEach(
                i -> {
                    queue.enqueue(values.get(i));
                }
        );

        StreamUtil.revRange(0, values.size()).forEach(
                i -> {
                    Assert.assertEquals(values.get(i), queue.dequeue());
                }
        );
    }

    private QueueWithMax createQueue(List<Integer> values) {
        final QueueWithMax queue = new QueueWithMax();
        IntStream.range(0, values.size())
                .forEach(i ->
                {
                    queue.enqueue(values.get(i));
                });
        return queue;
    }

}