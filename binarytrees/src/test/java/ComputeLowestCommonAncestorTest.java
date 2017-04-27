import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeLowestCommonAncestorTest {

    private BinaryTree<Integer> expected;
    private BinaryTree<Integer> tree;
    private BinaryTree<Integer> node0;
    private BinaryTree<Integer> node1;

    @Test
    public void LCA1() throws Exception {
        tree = BinaryTreeUtil.getEvenTree();
        node0 = tree.right;
        node1 = tree.left;
        expected = tree;

        test(expected, tree, node0, node1);
    }

    @Test
    public void LCA2() throws Exception {
        tree = BinaryTreeUtil.getFigureTenDotOne();
        node0 = tree.right.left.right.left.right;
        node1 = tree.right.left.right.right;
        expected = tree.right.left.right;

        test(expected, tree, node0, node1);
    }

    @Test
    public void LCA3() throws Exception {
        tree = BinaryTreeUtil.getOddTree();
        node0 = tree.left;
        node1 = tree.left.left;
        expected = tree.left;

        test(expected, tree, node0, node1);
    }

    private void test(BinaryTree<Integer> expected, BinaryTree<Integer> tree, BinaryTree<Integer> node0, BinaryTree<Integer> node1) {
        assertEquals(expected, ComputeLowestCommonAncestor.LCA(tree,node0,node1));
    }
}