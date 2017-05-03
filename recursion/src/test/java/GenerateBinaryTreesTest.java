import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GenerateBinaryTreesTest {

    private List<BinaryTree<Integer>> expected;
    private int numNodes;

    @Test
    public void generateAllBinaryTrees1() throws Exception {
        expected = Arrays.asList(
                new BinaryTree<>(0)
        );
        numNodes = 1;

        test(expected, numNodes);
    }

    @Test
    public void generateAllBinaryTrees2() throws Exception {
        expected = Arrays.asList(
                new BinaryTree<>(0,null,new BinaryTree<>(0)),
                new BinaryTree<>(0,new BinaryTree<>(0),null)
        );
        numNodes = 2;

        test(expected, numNodes);
    }

    @Test
    public void generateAllBinaryTrees3() throws Exception {
        expected = Arrays.asList(
                new BinaryTree<>(0,null,new BinaryTree<>(0,new BinaryTree<>(0),null)),
                new BinaryTree<>(0,null,new BinaryTree<>(0,null, new BinaryTree<>(0))),
                new BinaryTree<>(0,new BinaryTree<>(0,new BinaryTree<>(0),null), null),
                new BinaryTree<>(0,new BinaryTree<>(0,null, new BinaryTree<>(0)), null),
                new BinaryTree<>(0,new BinaryTree<>(0),new BinaryTree<>(0))
        );
        numNodes = 3;

        test(expected, numNodes);
    }

    private void test(List<BinaryTree<Integer>> expected, int numNodes) {
        List<BinaryTree<Integer>> result = GenerateBinaryTrees.generateAllBinaryTrees(numNodes);
        assertEquals(expected.size(), result.size());
        expected.forEach( i -> {
            assertTrue(result.remove(i));
        });
    }

}