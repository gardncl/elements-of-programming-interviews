public class BinaryTreeParent<T> extends BinaryTree<T> {

    public BinaryTreeParent<T> parent;

    public BinaryTreeParent(T data) {
        super(data);
    }

    public void setRight(BinaryTreeParent<T> node) {
        this.right = node;
        node.parent = this;
    }

    public void setLeft(BinaryTreeParent<T> node) {
        this.left = node;
        node.parent = this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BinaryTreeParent<?> that = (BinaryTreeParent<?>) o;

        return parent != null ? parent.equals(that.parent) : that.parent == null;
    }

}
