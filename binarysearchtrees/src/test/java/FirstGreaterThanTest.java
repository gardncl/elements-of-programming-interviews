import org.junit.Test;

import static org.junit.Assert.*;

public class FirstGreaterThanTest {

    private BinaryTree<Integer> expected;
    private BinaryTree<Integer> tree;
    private Integer k;

    @Test
    public void find1() throws Exception {
        tree = BinaryTreeUtil.getEvenBST();
        expected = tree;
        k = 0;

        test(expected, tree, k);
    }

    @Test
    public void find2() throws Exception {
        tree = BinaryTreeUtil.getFigureFifteenDotOne();
        expected = tree.right.left.right.left;
        k = 23;

        test(expected, tree, k);
    }

    @Test
    public void find3() throws Exception {
        tree = BinaryTreeUtil.getFigureFifteenDotOne();

        test(expected, tree, k);
    }

    private void test(BinaryTree<Integer> expected, BinaryTree<Integer> tree, Integer k) {
        assertEquals(expected, FirstGreaterThan.find(tree,k));
    }

}