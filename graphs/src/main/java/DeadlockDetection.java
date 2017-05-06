import java.util.List;

public class DeadlockDetection {

    /*
    19.4

    Write a program that takes as input a directed graph
    and checks if the graph contains a cycle.
     */

    public static class ColoredGraphVertex {
        public static enum Color {WHITE, GRAY, BLACK}

        public Color color;
        public List<ColoredGraphVertex> edges;
    }

    public static boolean isDeadlocked(List<ColoredGraphVertex> G) {

        return false;
    }
}
