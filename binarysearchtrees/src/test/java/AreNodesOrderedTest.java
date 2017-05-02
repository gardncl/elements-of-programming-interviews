import org.junit.Test;

import static org.junit.Assert.*;

public class AreNodesOrderedTest {

    private final BinaryTree<Integer> tree = BinaryTreeUtil.getFigureFifteenDotOne();
    private boolean expected;
    private BinaryTree<Integer> possible1;
    private BinaryTree<Integer> possible2;
    private BinaryTree<Integer> middle;


    @Test
    public void totallyOrdered1() throws Exception {
        expected = true;
        middle = tree.right.left;
        possible1 = tree;
        possible2 = tree.right.left.right;


        test(expected, possible1, possible2, middle);
    }

    @Test
    public void totallyOrdered2() throws Exception {
        expected = true;
        middle = tree.right.left;
        possible1 = tree.right;
        possible2 = tree.right.left.right.left.right;

        test(expected, possible1, possible2, middle);
    }

    @Test
    public void totallyOrdered3() throws Exception {
        expected = true;
        middle = tree.right.left;
        possible1 = tree.right;
        possible2 = tree.right.right.right;

        test(expected, possible1, possible2, middle);
    }

    @Test
    public void totallyOrdered4() throws Exception {
        expected = true;
        middle = tree.right.left;
        possible1 = tree.right.left;
        possible2 = tree.right.left.right;

        test(expected, possible1, possible2, middle);
    }

    private void test(boolean expected,
                      BinaryTree<Integer> possible1,
                      BinaryTree<Integer> possible2,
                      BinaryTree<Integer> middle) {
        assertEquals(expected, AreNodesOrdered.totallyOrdered(possible1, possible2, middle));
    }

}