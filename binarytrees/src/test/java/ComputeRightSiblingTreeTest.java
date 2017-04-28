import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeRightSiblingTreeTest {

    private BinaryTreeLN<Character> expected;
    private BinaryTreeLN<Character> tree;

    @Test
    public void constructRightSibling1() throws Exception {
        expected = new BinaryTreeLN<>('A');
        expected.left = new BinaryTreeLN<>('B');
        expected.right = new BinaryTreeLN<>('C');
        ((BinaryTreeLN)expected.left).levelNext = (BinaryTreeLN)expected.right;

        tree = new BinaryTreeLN<>('A');
        tree.left = new BinaryTreeLN<>('B');
        tree.right = new BinaryTreeLN<>('C');

        test(expected, tree);
    }

    @Test
    public void constructRightSibling2() throws Exception {
        expected = new BinaryTreeLN<>('A');
        expected.left = new BinaryTreeLN<>('B');
        expected.right = new BinaryTreeLN<>('D');
        expected.left.left = new BinaryTreeLN<>('C');
        expected.right.left = new BinaryTreeLN<>('E');
        expected.right.left.left = new BinaryTreeLN<>('F');
        expected.right.right = new BinaryTreeLN<>('G');
        expected.right.right.left = new BinaryTreeLN<>('H');
        expected.right.right.right = new BinaryTreeLN<>('I');
        ((BinaryTreeLN)expected.left).levelNext = (BinaryTreeLN)expected.right;
        ((BinaryTreeLN) expected.left.left).levelNext = (BinaryTreeLN)expected.right.left;
        ((BinaryTreeLN)expected.right.left).levelNext = (BinaryTreeLN)expected.right.right;
        ((BinaryTreeLN)expected.right.left.left).levelNext = (BinaryTreeLN) expected.right.right.left;
        ((BinaryTreeLN)expected.right.right.left).levelNext = (BinaryTreeLN) expected.right.right.right;

        tree = new BinaryTreeLN<>('A');
        tree.left = new BinaryTreeLN<>('B');
        tree.left.left = new BinaryTreeLN<>('C');
        tree.right.left = new BinaryTreeLN<>('E');
        tree.right.left.left = new BinaryTreeLN<>('F');
        tree.right.right = new BinaryTreeLN<>('G');
        tree.right.right.left = new BinaryTreeLN<>('H');
        tree.right.right.right = new BinaryTreeLN<>('I');

        test(expected, tree);
    }

    public void test(BinaryTreeLN<Character> expected, BinaryTreeLN<Character> tree) {
        ComputeRightSiblingTree.constructRightSibling(tree);
        assertEquals(expected, tree);
    }

}