import java.util.Collections;
import java.util.List;

public class EnumerateEntries {

    /*
    15.7
    */

    public static class ABSqrt2 implements Comparable<ABSqrt2> {
        public int a, b;
        public double val;

        public ABSqrt2(int a, int b) {
            this.a = a;
            this.b = b;
            this.val = a + b * Math.sqrt(2);
        }

        @Override
        public int compareTo(ABSqrt2 o) {
            return Double.compare(val, o.val);
        }
    }

    public static List<ABSqrt2> generateFirst(int k) {

        return Collections.emptyList();
    }


}
