import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class TransformOneStringToAnotherTest {

    private int expected;
    private Set<String> D;
    private String s;
    private String d;

    @Test
    public void transformString1() throws Exception {
        expected = 4;
        D = new HashSet<>(Arrays.asList(
                "bat",
                "cot",
                "dog",
                "dag",
                "dot",
                "cat"
        ));
        s = "cat";
        d = "dog";

        test(expected,D,s,d);
    }

    @Test
    public void transformString2() throws Exception {
        expected = -1;
        D = new HashSet<>(Arrays.asList(
                "bat",
                "cot",
                "dog",
                "dag",
                "dot",
                "cat"
        ));
        s = "cat";
        d = "bat";

        test(expected,D,s,d);
    }

    private void test(int expected, Set<String> D, String s, String d) {
        assertEquals(expected, TransformOneStringToAnother.transformString(D, s, d));
    }

}