import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EvenThreadTest {

    @Test
    public void test() throws Exception {
        List<Integer> result = new ArrayList<>();
        Thread t1 = new ImplementThreadSyncronization.OddThread(result);
        Thread t2 = new ImplementThreadSyncronization.EvenThread(result);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        assertEquals(StreamUtil.sequence(100), result);
    }

}