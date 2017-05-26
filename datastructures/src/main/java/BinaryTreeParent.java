public class BinaryTreeParent<T> {

    public BinaryTreeParent<T> parent;
    public T data;
    public BinaryTreeParent<T> left, right;
    public Boolean isVisited = false;

    public BinaryTreeParent(T data) {
        this.data = data;
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
