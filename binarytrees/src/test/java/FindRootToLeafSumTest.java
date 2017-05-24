import org.junit.Test;

import static org.junit.Assert.*;

public class FindRootToLeafSumTest {

    private boolean expected;
    private BinaryTree<Integer> tree;
    private int targetSum;

    @Test
    public void hasPathSum1() throws Exception {
        expected = true;
        tree = BinaryTreeUtil.getFullTree();
        targetSum = 7;

        test(expected, tree, targetSum);
    }

    @Test
    public void hasPathSum2() throws Exception {
        expected = false;
        tree = BinaryTreeUtil.getFullTree();
        targetSum = 5;

        test(expected, tree, targetSum);
    }

    @Test
    public void hasPathSum3() throws Exception {
        expected = true;
        tree = BinaryTreeUtil.getFigureTenDotOne();
        targetSum = 1365;

        test(expected, tree, targetSum);
    }

    @Test
    public void hasPathSum4() throws Exception {
        expected = false;
        tree = BinaryTreeUtil.getFigureTenDotOne();
        targetSum = 724;

        test(expected, tree, targetSum);
    }

    private void test(boolean expected, BinaryTree<Integer> tree, int targetSum) {
        assertEquals(expected, FindRootToLeafSum.hasPathSum(tree, targetSum));
    }

}