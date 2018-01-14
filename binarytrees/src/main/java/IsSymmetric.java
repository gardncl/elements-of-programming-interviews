public class IsSymmetric {

    /*
    10.2
    */

    public static boolean isSymmetric(BinaryTree<Integer> tree) {
        return tree == null || helper(tree.left, tree.right);

    }

    private static boolean helper(BinaryTree<Integer> left, BinaryTree<Integer> right) {
        if(left == null && right == null)
            return true;
        else if(left != null && right != null) {
            return left.data == right.data &&
                    helper(left.left, right.right) &&
                    helper(left.right, right.left);

        } else
            return false;

    }
}
