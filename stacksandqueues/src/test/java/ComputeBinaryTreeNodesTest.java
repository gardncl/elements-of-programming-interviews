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
        input = BinaryTreeUtil.getFigureTenDotOne();

        test(expected, input);
    }

    private void test(List<List<Integer>> expected, BinaryTree<Integer> input) {
        assertEquals(expected, ComputeBinaryTreeNodes.binaryTreeDepthOrder(input));
    }
}