import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ComputeBinaryTreeNodesTest {

    private List<List<Integer>> expected;
    private BinaryTree<Integer> input;

    @Test
    public void binaryTreeDepthOrder1() {
        expected = Arrays.asList(
                Arrays.asList(314),
                Arrays.asList(6,6),
                Arrays.asList(271,561,2,271),
                Arrays.asList(28,0,3,1,28),
                Arrays.asList(17,401,257),
                Arrays.asList(641)
        );
        input = new BinaryTree<>(314);
        input.left = new BinaryTree<>(6);
        input.left.left = new BinaryTree<>(271);
        input.left.left.left = new BinaryTree<>(28);
        input.left.left.right = new BinaryTree<>(0);
        input.left.right = new BinaryTree<>(561);
        input.left.right.right = new BinaryTree<>(3);
        input.left.right.left = new BinaryTree<>(17);
        input.right = new BinaryTree<>(6);
        input.right.left = new BinaryTree<>(2);
        input.right.left.right = new BinaryTree<>(1);
        input.right.left.right.left = new BinaryTree<>(401);
        input.right.left.right.left.right = new BinaryTree<>(641);
        input.right.left.right.right = new BinaryTree<>(257);
        input.right.right = new BinaryTree<>(271);
        input.right.right.right = new BinaryTree<>(28);

        test(expected, input);
    }

    private void test(List<List<Integer>> expected, BinaryTree<Integer> input) {
        assertEquals(expected, ComputeBinaryTreeNodes.binaryTreeDepthOrder(input));
    }
}