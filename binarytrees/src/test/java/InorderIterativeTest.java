import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class InorderIterativeTest {

    private List<Integer> expected;
    private BinaryTree<Integer> tree;

    @Test
    public void BSTInOrder1() throws Exception {
        expected = Arrays.asList(2,1,0);
        tree = BinaryTreeUtil.getOddTree();

        test(expected, tree);
    }

    @Test
    public void BSTInOrder2() throws Exception {
        expected = Arrays.asList(1,2,3,4,5,6,7);
        tree = BinaryTreeUtil.getFullTree();

        test(expected, tree);
    }

    @Test
    public void BSTInOrder3() throws Exception {
        expected = Arrays.asList(28,271,0,6,561,17,3,314,2,401,641,1,257,6,271,28);
        tree = BinaryTreeUtil.getFigureTenDotOne();

        test(expected, tree);
    }

    private void test(List<Integer> expected, BinaryTree<Integer> tree) {
        assertEquals(expected, InorderIterative.BSTInOrder(tree));
    }

}