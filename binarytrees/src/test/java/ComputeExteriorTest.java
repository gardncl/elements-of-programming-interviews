import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeExteriorTest {

    private List<BinaryTree<Integer>> expected;
    private BinaryTree<Integer> tree;

    @Test
    public void exteriorBinaryTree1() throws Exception {
        tree = BinaryTreeUtil.getEvenTree();
        expected = new LinkedList<>(
                Arrays.asList(
                        tree,
                        tree.left,
                        tree.right)
        );

        test(expected, tree);
    }

    @Test
    public void exteriorBinaryTree2() throws Exception {
        tree = BinaryTreeUtil.getFullTree();
        expected = new LinkedList<>(
                Arrays.asList(
                        tree,
                        tree.left,
                        tree.left.right,
                        tree.right.left,
                        tree.right.right,
                        tree.right)
        );

        test(expected, tree);
    }

    @Test//a b c d e h m n p o i
    public void exteriorBinaryTree3() throws Exception {
        tree = BinaryTreeUtil.getFigureTenDotOne();
        expected = new LinkedList<>(
                Arrays.asList(
                        tree,
                        tree.left,
                        tree.left.left,
                        tree.left.left.left,
                        tree.left.left.right,
                        tree.left.right.right.left,
                        tree.right.left.right.left.right,
                        tree.right.left.right.right,
                        tree.right.right.right,
                        tree.right.right,
                        tree.right)
        );

        test(expected, tree);
    }

    private void test(List<BinaryTree<Integer>> expected, BinaryTree<Integer> tree) {
        assertEquals(expected,ComputeExterior.exteriorBinaryTree(tree));
    }

}