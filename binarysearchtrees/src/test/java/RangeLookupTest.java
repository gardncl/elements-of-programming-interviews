import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RangeLookupTest {

    private List<Integer> expected;
    private BinaryTree<Integer> tree;
    private Tuple tuple;

    @Test
    public void range1() throws Exception {
        expected = Arrays.asList(2,3,4,5);
        tree = BinaryTreeUtil.getFullBST();
        tuple = new Tuple(2,5);

        test(expected, tree, tuple);
    }

    @Test
    public void range2() throws Exception {
        expected = Arrays.asList(17,19,23,29,31);
        tree = BinaryTreeUtil.getFigureFifteenDotOne();
        tuple = new Tuple(16, 31);

        test(expected, tree, tuple);
    }

    @Test
    public void range3() throws Exception {
        expected = Arrays.asList(23,29,31,37,41);
        tree = BinaryTreeUtil.getFigureFifteenDotOne();
        tuple = new Tuple(20,43);

        test(expected, tree, tuple);
    }

    @Test
    public void range4() throws Exception {
        expected = Arrays.asList(2,3,5,7,11,17,13);
        tree = BinaryTreeUtil.getFigureFifteenDotOne();
        tuple = new Tuple(0,18);

        test(expected, tree, tuple);
    }

    private void test(List<Integer> expected, BinaryTree<Integer> tree, Tuple tuple) {
        AssertUtils.assertSameContentsInt(expected, RangeLookup.range(tree, tuple));
    }

}