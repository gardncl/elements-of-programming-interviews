public class LockingBinaryTree extends BinaryTree<Integer> {

    /*
    10.17
    */

    public LockingBinaryTree(Integer data) {
        super(data);
    }

    public boolean isLocked() {
        return false;
    }

    public boolean lock() {
        return false;
    }

    public void unlock() {

    }

}
