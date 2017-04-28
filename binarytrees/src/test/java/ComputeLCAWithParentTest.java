import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeLCAWithParentTest {

    private BinaryTreeParent<Integer> expected;
    private BinaryTreeParent<Integer> node0;
    private BinaryTreeParent<Integer> node1;

    @Test
    public void LCA1() throws Exception {
        expected = new BinaryTreeParent<>(0);
        expected.setLeft(new BinaryTreeParent<>(1));
        node0 = (BinaryTreeParent<Integer>) expected.left;
        expected.setRight(new BinaryTreeParent<>(2));
        node1 = (BinaryTreeParent<Integer>) expected.right;

        test(expected, node0, node1);
    }

    @Test
    public void LCA2() throws Exception {
        expected = new BinaryTreeParent<>(0);
        expected.setRight(new BinaryTreeParent<>(1));
        node0 = expected;
        ((BinaryTreeParent<Integer>)expected.right).setRight(new BinaryTreeParent<>(2));
        node1 = (BinaryTreeParent<Integer>) expected.right.right;


        test(expected, node0, node1);
    }

    @Test
    public void LCA3() throws Exception {
        expected = null;
        node0 = new BinaryTreeParent<>(0);
        node1 = new BinaryTreeParent<>(1);

        test(expected, node0, node1);
    }

    private void test(BinaryTreeParent<Integer> expected, BinaryTreeParent<Integer> node0, BinaryTreeParent<Integer> node1) {
        assertEquals(expected, ComputeLCAWithParent.LCA(node0, node1));
    }

}