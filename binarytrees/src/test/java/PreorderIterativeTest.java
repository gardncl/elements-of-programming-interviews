import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PreorderIterativeTest {

    private List<Integer> expected;
    private BinaryTree<Integer> tree;

    @Test
    public void BSTPreOrder1() throws Exception {
        expected = Arrays.asList(0,1,2);
        tree = BinaryTreeUtil.getOddTree();

        test(expected, tree);
    }

    @Test
    public void BSTPreOrder2() throws Exception {
        expected = Arrays.asList(4,2,1,3,6,5,7);
        tree = BinaryTreeUtil.getFullTree();

        test(expected, tree);
    }

    @Test
    public void BSTPreOrder3() throws Exception {
        expected = Arrays.asList(314,6,271,28,0,561,3,17,6,2,1,401,641,257,271,28);
        tree = BinaryTreeUtil.getFigureTenDotOne();

        test(expected, tree);
    }

    private void test(List<Integer> expected, BinaryTree<Integer> tree) {
        assertEquals(expected, PreorderIterative.BSTPreOrder(tree));
    }

}