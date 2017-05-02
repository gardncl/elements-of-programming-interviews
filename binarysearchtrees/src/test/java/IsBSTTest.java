import org.junit.Test;

import static org.junit.Assert.*;

public class IsBSTTest {

    private boolean expected;
    private BinaryTree<Integer> tree;

    @Test
    public void isBST1() throws Exception {
        expected = false;
        tree = BinaryTreeUtil.getEvenTree();

        test(expected, tree);
    }

    @Test
    public void isBST2() throws Exception {
        expected = true;
        tree = BinaryTreeUtil.getEvenBST();

        test(expected, tree);
    }

    @Test
    public void isBST3() throws Exception {
        expected = false;
        tree = BinaryTreeUtil.getFigureTenDotOne();

        test(expected, tree);
    }

    @Test
    public void isBST4() throws Exception {
        expected = true;
        tree = BinaryTreeUtil.getFigureFifteenDotOne();

        test(expected, tree);
    }

    private void test(boolean expected, BinaryTree<Integer> tree) {
        assertEquals(expected, IsBST.isBST(tree));
    }

}