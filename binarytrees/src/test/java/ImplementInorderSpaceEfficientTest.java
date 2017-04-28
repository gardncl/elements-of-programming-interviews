import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ImplementInorderSpaceEfficientTest {

    private List<Integer> expected;
    private BinaryTree<Integer> tree;

    @Test
    public void inorderTraversal1() throws Exception {
        expected = Arrays.asList(2,1,0);
        tree = BinaryTreeUtil.getOddTree();

        test(expected, tree);
    }

    @Test
    public void inorderTraversal2() throws Exception {
        expected = Arrays.asList(2,1,3,0,5,4,6);
        tree = BinaryTreeUtil.getFullTree();

        test(expected, tree);
    }

    @Test
    public void inorderTraversal3() throws Exception {
        expected = Arrays.asList(28,271,0,6,561,17,3,314,2,401,614,1,257,6,271,28);
        tree = BinaryTreeUtil.getFigureTenDotOne();

        test(expected, tree);
    }

    private void test(List<Integer> expected, BinaryTree<Integer> tree) {
        assertEquals(expected, ImplementInorderSpaceEfficient.inorderTraversal(tree));
    }

}