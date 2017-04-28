import org.junit.Test;

import static org.junit.Assert.*;

public class SumRootToLeafTest {

    private int expected;
    private BinaryTree<Integer> tree;

    @Test
    public void sumRootToLeaf1() throws Exception {
        expected = 6;
        tree = new BinaryTree<>(0);
        tree.right = new BinaryTree<>(1);
        tree.right.right = new BinaryTree<>(0);
        tree.left = new BinaryTree<>(0);
        tree.left.left = new BinaryTree<>(1);

        test(expected, tree);
    }

    @Test
    public void sumRootToLeaf2() throws Exception {
        expected = 8;
        tree = new BinaryTree<>(1);
        tree.right = new BinaryTree<>(1);
        tree.right.right = new BinaryTree<>(0);
        tree.left = new BinaryTree<>(0);
        tree.left.left = new BinaryTree<>(1);

        test(expected, tree);
    }

    @Test
    public void sumRootToLeaf3() throws Exception {
        expected = 16;
        tree = new BinaryTree<>(1);
        tree.right = new BinaryTree<>(1);
        tree.right.right = new BinaryTree<>(0);
        tree.right.left = new BinaryTree<>(1);
        tree.left = new BinaryTree<>(0);
        tree.left.left = new BinaryTree<>(1);
        tree.left.right = new BinaryTree<>(0);

        test(expected, tree);
    }

    private void test(int expected, BinaryTree<Integer> tree) {
        assertEquals(expected, SumRootToLeaf.sumRootToLeaf(tree));
    }

}