import org.junit.Test;

import static org.junit.Assert.*;

public class TowersOfHanoiTest {

    private int n;

    @Test
    public void compute1() throws Exception {
        n = 3;

        test(n);
    }

    private void test(int n) {
        TowersOfHanoi.compute(n);
    }

}