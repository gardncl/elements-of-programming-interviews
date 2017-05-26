import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeSuccessorTest {

    private BinaryTreeParent<Integer> expected;
    private static BinaryTreeParent node;

    @Test
    public void findSuccessor1() throws Exception {
        BinaryTreeParent<Integer> tree = new BinaryTreeParent<>(0);
        tree.setLeft(new BinaryTreeParent<>(1));
        tree.setRight(new BinaryTreeParent<>(2));
        expected = tree;
        node = tree.left;

        test(expected, node);
    }

    @Test
    public void findSuccessor2() throws Exception {
        BinaryTreeParent<Integer> tree = new BinaryTreeParent<>(4);
        tree.setLeft(new BinaryTreeParent<>(2));
        tree.left.setLeft(new BinaryTreeParent<>(1));
        tree.left.setRight(new BinaryTreeParent<>(3));
        tree.setRight(new BinaryTreeParent<>(6));
        tree.right.setLeft(new BinaryTreeParent<>(5));
        tree.right.setRight(new BinaryTreeParent<>(7));
        expected = tree;
        node = tree.left.right;

        test(expected, node);
    }

    @Test
    public void findSuccessor3() throws Exception {
        BinaryTreeParent<Integer> tree = new BinaryTreeParent<>(314);
        tree.setLeft(new BinaryTreeParent<>(6));
        tree.left.setLeft(new BinaryTreeParent<>(271));
        tree.left.left.setLeft(new BinaryTreeParent<>(28));
        tree.left.left.setRight(new BinaryTreeParent<>(0));
        tree.left.setRight(new BinaryTreeParent<>(561));
        tree.left.right.setRight(new BinaryTreeParent<>(3));
        tree.left.right.right.setLeft(new BinaryTreeParent<>(17));
        tree.setRight(new BinaryTreeParent<>(6));
        tree.right.setLeft(new BinaryTreeParent<>(2));
        tree.right.left.setRight(new BinaryTreeParent<>(1));
        tree.right.left.right.setLeft(new BinaryTreeParent<>(401));
        tree.right.left.right.left.setRight(new BinaryTreeParent<>(641));
        tree.right.left.right.setRight(new BinaryTreeParent<>(257));
        tree.right.setRight(new BinaryTreeParent<>(271));
        tree.right.right.setRight(new BinaryTreeParent<>(28));
        expected = tree;
        node = tree.left.right.right;

        test(expected, node);
    }

    @Test
    public void findSuccessor4() throws Exception {
        BinaryTreeParent<Integer> tree = new BinaryTreeParent<>(19);
        tree.setLeft(new BinaryTreeParent<>(7));
        tree.left.setLeft(new BinaryTreeParent<>(3));
        tree.left.left.setLeft(new BinaryTreeParent<>(2));
        tree.left.left.setRight(new BinaryTreeParent<>(5));
        tree.left.setRight(new BinaryTreeParent<>(11));
        tree.left.right.setRight(new BinaryTreeParent<>(17));
        tree.left.right.right.setLeft(new BinaryTreeParent<>(13));
        tree.setRight(new BinaryTreeParent<>(43));
        tree.right.setLeft(new BinaryTreeParent<>(23));
        tree.right.left.setRight(new BinaryTreeParent<>(37));
        tree.right.left.right.setLeft(new BinaryTreeParent<>(29));
        tree.right.left.right.left.setRight(new BinaryTreeParent<>(31));
        tree.right.left.right.setRight(new BinaryTreeParent<>(41));
        tree.right.setRight(new BinaryTreeParent<>(47));
        tree.right.right.setRight(new BinaryTreeParent<>(53));
        expected = tree.right.left;
        node = tree;

        test(expected, node);
    }

    private void test(BinaryTreeParent<Integer> expected, BinaryTreeParent<Integer> node) {
        assertEquals(expected, ComputeSuccessor.findSuccessor(node));
    }

}