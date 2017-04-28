import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReconstructBinaryTreeWithMarkersTest {

    private BinaryTree<Integer> expected;
    private List<Integer> sequence;

    @Test
    public void reconstructPreorder1() throws Exception {
        expected = BinaryTreeUtil.getEvenTree();
        sequence = Arrays.asList(0,1,null,null,2,null,null);

        test(expected, sequence);
    }

    @Test
    public void reconstructPreorder2() throws Exception {
        expected = BinaryTreeUtil.getFullTree();
        sequence = Arrays.asList(0,1,2,null,null,3,null,null,4,5,null,null,6,null,null);

        test(expected, sequence);
    }

    @Test
    public void reconstructPreorder3() throws Exception {
        expected = BinaryTreeUtil.getFigureTenDotOne();
        sequence = Arrays.asList(314,6,271,28,null,null,0,null,null,561,null,3,17,null,null,null,6,2,null,1,401,null,641,null,null,257,null,null,271,null,28,null,null);

        test(expected, sequence);
    }

    private void test(BinaryTree<Integer> expected, List<Integer> sequence) {
        assertEquals(expected, ReconstructBinaryTreeWithMarkers.reconstructPreorder(sequence));
    }
    
}
