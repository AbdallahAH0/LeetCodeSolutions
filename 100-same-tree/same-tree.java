public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //both nodes are null then match.
        if (p == null && q == null) {
            return true;
        }

        //one is null and the other isn't then no match
        if (p == null || q == null) {
            return false;
        }

        //values are different no match
        if (p.val != q.val) {
            return false;
        }

        //values match then check left and right subtrees
        boolean leftSame = isSameTree(p.left, q.left);
        boolean rightSame = isSameTree(p.right, q.right);

        return leftSame && rightSame;
    }
}
