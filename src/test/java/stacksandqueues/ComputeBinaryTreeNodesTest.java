package stacksandqueues;

import datastructures.BinaryTreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static stacksandqueues.ComputeBinaryTreeNodes.binaryTreeDepthOrder;

public class ComputeBinaryTreeNodesTest {

    private List<List<Integer>> expected;
    private BinaryTreeNode<Integer> input;

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
        input = new BinaryTreeNode<>(314);
        input.left = new BinaryTreeNode<>(6);
        input.left.left = new BinaryTreeNode<>(271);
        input.left.left.left = new BinaryTreeNode<>(28);
        input.left.left.right = new BinaryTreeNode<>(0);
        input.left.right = new BinaryTreeNode<>(561);
        input.left.right.right = new BinaryTreeNode<>(3);
        input.left.right.left = new BinaryTreeNode<>(17);
        input.right = new BinaryTreeNode<>(6);
        input.right.left = new BinaryTreeNode<>(2);
        input.right.left.right = new BinaryTreeNode<>(1);
        input.right.left.right.left = new BinaryTreeNode<>(401);
        input.right.left.right.left.right = new BinaryTreeNode<>(641);
        input.right.left.right.right = new BinaryTreeNode<>(257);
        input.right.right = new BinaryTreeNode<>(271);
        input.right.right.right = new BinaryTreeNode<>(28);

        test(expected, input);
    }

    private void test(List<List<Integer>> expected, BinaryTreeNode<Integer> input) {
        assertEquals(expected, binaryTreeDepthOrder(input));
    }
}