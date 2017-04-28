import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeSuccessorTest {

    private BinaryTree<Integer> expected;
    private static BinaryTree<Integer> node;

    @Test
    public void findSuccessor1() throws Exception {
        final BinaryTree<Integer> tree = BinaryTreeUtil.getEvenTree();
        expected = tree;
        node = tree.left;

        test(expected, node);
    }

    @Test
    public void findSuccessor2() throws Exception {
        final BinaryTree<Integer> tree = BinaryTreeUtil.getFullTree();
        expected = tree;
        node = tree.left.right;

        test(expected, node);
    }

    @Test
    public void findSuccessor3() throws Exception {
        final BinaryTree<Integer> tree = BinaryTreeUtil.getFigureTenDotOne();
        expected = tree;
        node = tree.left.right.right;

        test(expected, node);
    }

    @Test
    public void findSuccessor4() throws Exception {
        final BinaryTree<Integer> tree = BinaryTreeUtil.getFigureTenDotOne();
        expected = tree.right.left;
        node = tree;

        test(expected, node);
    }

    private void test(BinaryTree<Integer> expected, BinaryTree<Integer> node) {
        assertEquals(expected, ComputeSuccessor.findSuccessor(node));
    }

}