import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindKLargestTest {

    private List<Integer> expected;
    private BinaryTree<Integer> tree;
    private int k;

    @Test
    public void findLargest1() throws Exception {
        expected = Arrays.asList(108,243,285,285,401);
        tree = BinaryTreeUtil.getFigureFifteenDotTwo();
        k = 5;

        test(expected, tree, k);
    }

    @Test
    public void findLargest2() throws Exception {
        expected = Arrays.asList(53);
        tree = BinaryTreeUtil.getFigureFifteenDotOne();
        k = 1;

        test(expected, tree, k);
    }

    @Test
    public void findLargest3() throws Exception {
        expected = Arrays.asList(53,47,43);
        tree = BinaryTreeUtil.getFigureFifteenDotOne();
        k = 3;

        test(expected, tree, k);
    }

    private void test(List<Integer> expected, BinaryTree<Integer> tree, int k) {
        AssertUtils.assertSameContentsInt(expected, FindKLargest.findLargest(tree, k));
    }

}