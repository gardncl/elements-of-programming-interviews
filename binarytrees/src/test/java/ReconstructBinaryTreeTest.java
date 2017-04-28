import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReconstructBinaryTreeTest {

    private BinaryTree<Integer> expected;
    private List<Integer> preorder;
    private List<Integer> inorder;

    @Test
    public void binaryTreeFromPreorderInorder1() throws Exception {
        expected = BinaryTreeUtil.getOddTree();
        preorder = Arrays.asList(0,1,2);
        inorder = Arrays.asList(2,1,0);

        test(expected, preorder, inorder);
    }

    @Test
    public void binaryTreeFromPreorderInorder2() throws Exception {
        expected = BinaryTreeUtil.getFullTree();
        preorder = Arrays.asList(0,1,2,3,4,5,6);
        inorder = Arrays.asList(2,1,3,0,5,4,6);

        test(expected, preorder, inorder);
    }

    @Test
    public void binaryTreeFromPreorderInorder3() throws Exception {
        expected = BinaryTreeUtil.getFigureTenDotOne();
        preorder = Arrays.asList(314,6,271,28,0,561,3,17,6,2,1,401,641,257,271,28);
        inorder = Arrays.asList(28,271,0,6,561,17,3,314,2,401,614,1,257,6,271,28);

        test(expected, preorder, inorder);
    }

    private void test(BinaryTree<Integer> expected, List<Integer> preorder, List<Integer> inorder) {
        assertEquals(expected, ReconstructBinaryTree.binaryTreeFromPreorderInorder(preorder, inorder));
    }

}