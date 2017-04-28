public class BinaryTreeLN<T> extends BinaryTree<T> {

    public BinaryTreeLN<T> levelNext;

    public BinaryTreeLN(T data) {
        super(data);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BinaryTreeLN<?> that = (BinaryTreeLN<?>) o;

        return levelNext != null ? levelNext.equals(that.levelNext) : that.levelNext == null;
    }

}
