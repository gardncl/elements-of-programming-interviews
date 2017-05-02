import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionAndDeletionBSTTest {

    @Test
    public void test1() {
        InsertionAndDeletionBST tree = new InsertionAndDeletionBST(2);
        tree.insert(0);
        tree.insert(1);
        assertEquals(tree, BinaryTreeUtil.getEvenBST());
    }

    @Test
    public void test2() {
        InsertionAndDeletionBST tree = new InsertionAndDeletionBST(4);
        tree.insert(6);
        tree.insert(1);
        tree.insert(2);
        tree.insert(5);
        tree.insert(7);
        tree.insert(3);
        assertEquals(tree, BinaryTreeUtil.getFullBST());
    }

}