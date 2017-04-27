public class BinaryTree<T> {
    public T data;
    public BinaryTree<T> left, right;



    public BinaryTree(T data) {
        this.data = data;
    }

    public BinaryTree(T data, BinaryTree<T> left, BinaryTree<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
