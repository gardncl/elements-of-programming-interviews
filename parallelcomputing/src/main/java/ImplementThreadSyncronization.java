import java.util.List;

public class ImplementThreadSyncronization {

    /*
    20.3

    Write code in which two threads, running concurrently, create the integer list from 0 to 99 in order.
     */

    public static class OddThread extends Thread {

        private List<Integer> list;

        public OddThread(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {

        }
    }

    public static class EvenThread extends Thread {

        private List<Integer> list;

        public EvenThread(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {

        }
    }
}
