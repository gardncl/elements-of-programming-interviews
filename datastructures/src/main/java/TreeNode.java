import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public List<Edge> edges = new ArrayList<>();

    public static class Edge {
        public TreeNode root;
        public double length;

        public Edge(double length) {
            this.length = length;
            root = new TreeNode();
        }

        public Edge(TreeNode root, double length) {
            this.root = root;
            this.length = length;
        }
    }
}
