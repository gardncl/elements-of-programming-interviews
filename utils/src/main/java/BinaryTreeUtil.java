public class BinaryTreeUtil {

    public static BinaryTree<Integer> getEvenTree() {
        BinaryTree<Integer> tree = new BinaryTree<>(0);
        tree.left = new BinaryTree<>(1);
        tree.right = new BinaryTree<>(2);
        return tree;
    }

    public static BinaryTree<Integer> getEvenBST() {
        BinaryTree<Integer> tree = new BinaryTree<>(1);
        tree.left = new BinaryTree<>(0);
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
        BinaryTree<Integer> tree = new BinaryTree<>(4);
        tree.left = new BinaryTree<>(2);
        tree.left.left = new BinaryTree<>(1);
        tree.left.right = new BinaryTree<>(3);
        tree.right = new BinaryTree<>(6);
        tree.right.left = new BinaryTree<>(5);
        tree.right.right = new BinaryTree<>(7);
        return tree;
    }

    public static BinaryTree<Integer> getFullBST() {
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
        tree.left.right.right.left = new BinaryTree<>(17);
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

    public static BinaryTree<Integer> getFigureFifteenDotOne() {
        BinaryTree<Integer> tree = new BinaryTree<>(19);
        tree.left = new BinaryTree<>(7);
        tree.left.left = new BinaryTree<>(3);
        tree.left.left.left = new BinaryTree<>(2);
        tree.left.left.right = new BinaryTree<>(5);
        tree.left.right = new BinaryTree<>(11);
        tree.left.right.right = new BinaryTree<>(17);
        tree.left.right.right.left = new BinaryTree<>(13);
        tree.right = new BinaryTree<>(43);
        tree.right.left = new BinaryTree<>(23);
        tree.right.left.right = new BinaryTree<>(37);
        tree.right.left.right.left = new BinaryTree<>(29);
        tree.right.left.right.left.right = new BinaryTree<>(31);
        tree.right.left.right.right = new BinaryTree<>(41);
        tree.right.right = new BinaryTree<>(47);
        tree.right.right.right = new BinaryTree<>(53);
        return tree;
    }

    public static BinaryTree<Integer> getFigureFifteenDotTwo() {
        BinaryTree<Integer> tree = new BinaryTree<>(108);
        tree.left = new BinaryTree<>(108);
        tree.left.left = new BinaryTree<>(-10);
        tree.left.left.left = new BinaryTree<>(-14);
        tree.left.left.right = new BinaryTree<>(2);
        tree.left.right = new BinaryTree<>(108);
        tree.right = new BinaryTree<>(285);
        tree.right.left = new BinaryTree<>(243);
        tree.right.right = new BinaryTree<>(285);
        tree.right.right.right = new BinaryTree<>(401);
        return tree;
    }
}
