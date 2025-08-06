public class Solution {
    public int maxDepth(TreeNode root) { // this the base case for the recursion, tree empty
        if (root == null) {
            return 0;
        }
           //find the max depth in the left and right
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // Return the max between them + 1 for recursive 
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
