import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ImplementInorderSpaceEfficientTest {

    private List<Integer> expected;
    private BinaryTreeParent<Integer> tree;

    @Test
    public void inorderTraversal1() throws Exception {
        expected = Arrays.asList(1,0,2);
        tree = BinaryTreeUtil.getOddTreeWithParent();

        test(expected, tree);
    }

    @Test
    public void inorderTraversal2() throws Exception {
        expected = Arrays.asList(1,2,3,4,5,6,7);
        tree = BinaryTreeUtil.getFullTreeWithParent();

        test(expected, tree);
    }

    @Test
    public void inorderTraversal3() throws Exception {
        expected = Arrays.asList(28,271,0,6,561,17,3,314,2,401,641,1,257,6,271,28);
        tree = BinaryTreeUtil.getFigureTenDotOneWithParent();

        test(expected, tree);
    }

    private void test(List<Integer> expected, BinaryTreeParent<Integer> tree) {
        assertEquals(expected, ImplementInorderSpaceEfficient.inorderTraversal(tree));
    }

}