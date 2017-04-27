public class LockingBinaryTree extends BinaryTree{

    /*
    10.17

    Write the following methods for the binary tree node class:
        1. A function to test if the node is locked.
        2. A function to lock the node. If the node cannot be locked,
        return false, otherwise lock it and return true.
        3. A function to unlock the node.
    Assume that each node has a parent field, The API will be used in a
    single threaded program, so there is no need for concurrency
    constructs such as mutexes or synchronization.
     */


    public LockingBinaryTree(Object data) {
        super(data);
    }
}
