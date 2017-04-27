import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeKthNodeInorderTest {

    private BinaryTree<Integer> expected;
    private static BinaryTree<Integer> tree;
    private int k;

    static {
        tree = new BinaryTree<>(5);
        tree.left = new BinaryTree<>(2);
        tree.left.left = new BinaryTree<>(1);
        tree.right = new BinaryTree<>(2);
        tree.right.left = new BinaryTree<>(1);
    }

    @Test
    public void findKthNodeBinaryTree1() throws Exception {
        k = 0;
        expected = tree.left.left;

        test(expected, k);
    }

    @Test
    public void findKthNodeBinaryTree2() throws Exception {
        k = 1;
        expected = tree.left;

        test(expected, k);
    }

    @Test
    public void findKthNodeBinaryTree3() throws Exception {
        k = 2;
        expected = tree;

        test(expected, k);
    }

    @Test
    public void findKthNodeBinaryTree4() throws Exception {
        k = 3;
        expected = tree.right.left;

        test(expected, k);
    }

    @Test
    public void findKthNodeBinaryTree5() throws Exception {
        k = 4;
        expected = tree.right;

        test(expected, k);
    }

    private void test(BinaryTree<Integer> expected, int k) {
        assertEquals(expected, ComputeKthNodeInorder.findKthNodeBinaryTree(tree, k));
    }

}