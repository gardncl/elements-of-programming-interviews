public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left, right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }

    public BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
