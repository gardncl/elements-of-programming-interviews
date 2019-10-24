public class BinaryTreet {
    public T data;
    public BinaryTreet left, right;
    public Boolean isVisited = false;



    public BinaryTree(T data) {
        this.data = data;
    }

    public BinaryTree(T data, BinaryTree<T> left, BinaryTree<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BinaryTree<?> that = (BinaryTree<?>) o;

        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (left != null ? !left.equals(that.left) : that.left != null) return false;
        return right != null ? right.equals(that.right) : that.right == null;
    }

    @Override
    public String toString() {
        String leftData = left == null ? "null" : left.data.toString();
        String rightData = right == null ? "null" : right.data.toString();
        return "BinaryTree{" +
                "data=" + data +
                ", left=" + leftData +
                ", right=" + rightData +
                '}';
    }
}
