import java.util.Collections;
import java.util.List;

public class ComputeUnion {

    /*
    14.6
    */

    public static List<Interval> unionOfIntervals(List<Interval> intervals) {

        return Collections.emptyList();
    }

    public static class Interval implements Comparable<Interval> {
        public Endpoint left = new Endpoint();
        public Endpoint right = new Endpoint();

        public Interval(int lv, boolean lb, int rv, boolean rb) {
            left = new Endpoint(lb, lv);
            right = new Endpoint(rb, rv);
        }

        public class Endpoint {
            public boolean isClosed;
            public int val;

            public Endpoint(boolean isClosed, int val) {
                this.isClosed = isClosed;
                this.val = val;
            }

            public Endpoint() {
            }
        }

        @Override
        public int compareTo(Interval i) {
            if (Integer.compare(left.val, i.left.val) != 0) {
                return left.val - i.left.val;
            }
            if (left.isClosed && !i.left.isClosed) {
                return -1;
            }
            if (!left.isClosed && i.left.isClosed) {
                return 1;
            }
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Interval interval = (Interval) o;

            if (left != null ? !left.equals(interval.left) : interval.left != null) return false;
            return right != null ? right.equals(interval.right) : interval.right == null;
        }

        @Override
        public int hashCode() {
            int result = left != null ? left.hashCode() : 0;
            result = 31 * result + (right != null ? right.hashCode() : 0);
            return result;
        }
    }
}
