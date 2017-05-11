import java.util.List;

public class ImplementThreadSyncronization {

    /*
    20.3
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
