import java.util.Arrays;

public class TreeNodeUtil {

    public static TreeNode getTreeNode() {
        TreeNode root = new TreeNode();
        root.edges.addAll(Arrays.asList(
                new TreeNode.Edge(7),
                new TreeNode.Edge(14),
                new TreeNode.Edge(3)
        ));
        root.edges.get(0).root.edges.addAll(Arrays.asList(
                new TreeNode.Edge(4),
                new TreeNode.Edge(3)
        ));
        root.edges.get(0).root.edges.get(0).root.edges.add(new TreeNode.Edge(6));
        root.edges.get(2).root = new TreeNode();
        root.edges.get(2).root.edges.addAll(Arrays.asList(
                new TreeNode.Edge(2),
                new TreeNode.Edge(1)
        ));
        root.edges.get(2).root.edges.get(1).root.edges.addAll(Arrays.asList(
                new TreeNode.Edge(6),
                new TreeNode.Edge(4)
        ));
        root.edges.get(2).root.edges.get(1).root.edges.get(1).root.edges.addAll(Arrays.asList(
                new TreeNode.Edge(4),
                new TreeNode.Edge(2)
        ));
        root.edges.get(2).root.edges.get(1).root.edges.get(1).root.edges.get(1).root.edges.addAll(Arrays.asList(
                new TreeNode.Edge(1),
                new TreeNode.Edge(2),
                new TreeNode.Edge(3)
        ));
        return root;
    }
}
