import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    List<Edge> edges = new ArrayList<Edge>;

    public static class Edge {
        public TreeNode root;
        public double length;

        public Edge(TreeNode root, double length) {
            this.root = root;
            this.length = length;
        }
    }
}
