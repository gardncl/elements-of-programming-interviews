import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LockingBinaryTreeTest {

    @Test
    public void lockingBinaryTree() {
        LockingBinaryTree lockingBinaryTree = new LockingBinaryTree(0);
        lockingBinaryTree.left = new LockingBinaryTree(1);
        lockingBinaryTree.right = new LockingBinaryTree(2);
        lockingBinaryTree.left.left = new LockingBinaryTree(3);

        assertFalse(((LockingBinaryTree)lockingBinaryTree.left).isLocked());
        ((LockingBinaryTree)lockingBinaryTree.left).lock();
        assertTrue(((LockingBinaryTree)lockingBinaryTree.left).isLocked());
        ((LockingBinaryTree)lockingBinaryTree.left).unlock();

        assertFalse(((LockingBinaryTree)lockingBinaryTree.left).isLocked());
        lockingBinaryTree.lock();
        assertTrue(((LockingBinaryTree)lockingBinaryTree.left).isLocked());
        lockingBinaryTree.unlock();

        assertFalse(((LockingBinaryTree)lockingBinaryTree.left).isLocked());
        ((LockingBinaryTree)lockingBinaryTree.left.left).lock();
        assertTrue(((LockingBinaryTree)lockingBinaryTree.left).isLocked());
        ((LockingBinaryTree)lockingBinaryTree.left.left).unlock();


        assertFalse(((LockingBinaryTree)lockingBinaryTree.left).isLocked());
        ((LockingBinaryTree)lockingBinaryTree.right).lock();
        assertFalse(((LockingBinaryTree)lockingBinaryTree.left).isLocked());
        ((LockingBinaryTree)lockingBinaryTree.right).unlock();
    }

}