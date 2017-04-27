public class BinaryTreeUtil {

    public static BinaryTree<Integer> getEvenTree() {
        BinaryTree<Integer> tree = new BinaryTree<>(0);
        tree.left = new BinaryTree<>(1);
        tree.right = new BinaryTree<>(2);
        return tree;
    }

    public static BinaryTree<Integer> getOddTree() {
        BinaryTree<Integer> tree = new BinaryTree<>(0);
        tree.left = new BinaryTree<>(1);
        tree.left.left = new BinaryTree<>(2);
        return tree;
    }

    public static BinaryTree<Integer> getFullTree() {
        BinaryTree<Integer> tree = new BinaryTree<>(0);
        tree.left = new BinaryTree<>(1);
        tree.left.left = new BinaryTree<>(2);
        tree.left.right = new BinaryTree<>(3);
        tree.right = new BinaryTree<>(4);
        tree.right.left = new BinaryTree<>(5);
        tree.right.right = new BinaryTree<>(6);
        return tree;
    }

    public static BinaryTree<Integer> getFigureTenDotOne() {
        BinaryTree<Integer> tree = new BinaryTree<>(314);
        tree.left = new BinaryTree<>(6);
        tree.left.left = new BinaryTree<>(271);
        tree.left.left.left = new BinaryTree<>(28);
        tree.left.left.right = new BinaryTree<>(0);
        tree.left.right = new BinaryTree<>(561);
        tree.left.right.right = new BinaryTree<>(3);
        tree.left.right.left = new BinaryTree<>(17);
        tree.right = new BinaryTree<>(6);
        tree.right.left = new BinaryTree<>(2);
        tree.right.left.right = new BinaryTree<>(1);
        tree.right.left.right.left = new BinaryTree<>(401);
        tree.right.left.right.left.right = new BinaryTree<>(641);
        tree.right.left.right.right = new BinaryTree<>(257);
        tree.right.right = new BinaryTree<>(271);
        tree.right.right.right = new BinaryTree<>(28);
        return tree;
    }
}
