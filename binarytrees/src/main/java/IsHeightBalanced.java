/*
 *
 */
class BalanceStatus {
    boolean balanced;
    int height;
    BalanceStatus(boolean balanced, int height) {
        this.balanced = balanced;
        this.height = height;
    }
}

public class IsHeightBalanced {

    /*
    10.1
    */
    public static boolean isBalanced(BinaryTree<Integer> tree) {
        if(tree == null)
            return true;
        return helper(tree).balanced;
    }

    private static BalanceStatus helper(BinaryTree<Integer> tree) {
        if(tree == null)
            return new BalanceStatus(true, -1);
        BalanceStatus left = helper(tree.left);
        if(!left.balanced) {
            return left;
        }

        BalanceStatus right = helper(tree.right);
        if(!right.balanced)
            return right;

        boolean isBalanced = Math.abs(left.height - right.height) <= 1;
        int height = Math.max(left.height, right.height) + 1;
        return new BalanceStatus(isBalanced, height);
    }
}
