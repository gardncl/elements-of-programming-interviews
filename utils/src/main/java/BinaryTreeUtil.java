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

    public static BinaryTreeParent<Integer> getOddTreeWithParent() {
        BinaryTreeParent<Integer> tree = new BinaryTreeParent<>(0);
        tree.setLeft(new BinaryTreeParent<>(1));
        tree.setRight(new BinaryTreeParent<>(2));
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

    public static BinaryTreeParent<Integer> getFullTreeWithParent() {
        BinaryTreeParent<Integer> tree = new BinaryTreeParent<>(4);
        tree.setLeft(new BinaryTreeParent<>(2));
        tree.left.setLeft(new BinaryTreeParent<>(1));
        tree.left.setRight(new BinaryTreeParent<>(3));
        tree.setRight(new BinaryTreeParent<>(6));
        tree.right.setLeft(new BinaryTreeParent<>(5));
        tree.right.setRight(new BinaryTreeParent<>(7));
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

    public static BinaryTreeParent<Integer> getFigureTenDotOneWithParent() {
        BinaryTreeParent<Integer> tree = new BinaryTreeParent<>(314);
        tree.setLeft(new BinaryTreeParent<>(6));
        tree.left.setLeft(new BinaryTreeParent<>(271));
        tree.left.left.setLeft(new BinaryTreeParent<>(28));
        tree.left.left.setRight(new BinaryTreeParent<>(0));
        tree.left.setRight(new BinaryTreeParent<>(561));
        tree.left.right.setRight(new BinaryTreeParent<>(3));
        tree.left.right.right.setLeft(new BinaryTreeParent<>(17));
        tree.setRight(new BinaryTreeParent<>(6));
        tree.right.setLeft(new BinaryTreeParent<>(2));
        tree.right.left.setRight(new BinaryTreeParent<>(1));
        tree.right.left.right.setLeft(new BinaryTreeParent<>(401));
        tree.right.left.right.left.setRight(new BinaryTreeParent<>(641));
        tree.right.left.right.setRight(new BinaryTreeParent<>(257));
        tree.right.setRight(new BinaryTreeParent<>(271));
        tree.right.right.setRight(new BinaryTreeParent<>(28));
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

    public static BinaryTreeParent<Integer> getFigureFifteenDotOneWithParent() {
        BinaryTreeParent<Integer> tree = new BinaryTreeParent<>(19);
        tree.setLeft(new BinaryTreeParent<>(7));
        tree.left.setLeft(new BinaryTreeParent<>(3));
        tree.left.left.setLeft(new BinaryTreeParent<>(2));
        tree.left.left.setRight(new BinaryTreeParent<>(5));
        tree.left.setRight(new BinaryTreeParent<>(11));
        tree.left.right.setRight(new BinaryTreeParent<>(17));
        tree.left.right.right.setLeft(new BinaryTreeParent<>(13));
        tree.setRight(new BinaryTreeParent<>(43));
        tree.right.setLeft(new BinaryTreeParent<>(23));
        tree.right.left.setRight(new BinaryTreeParent<>(37));
        tree.right.left.right.setLeft(new BinaryTreeParent<>(29));
        tree.right.left.right.left.setRight(new BinaryTreeParent<>(31));
        tree.right.left.right.setRight(new BinaryTreeParent<>(41));
        tree.right.setRight(new BinaryTreeParent<>(47));
        tree.right.right.setRight(new BinaryTreeParent<>(53));
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
