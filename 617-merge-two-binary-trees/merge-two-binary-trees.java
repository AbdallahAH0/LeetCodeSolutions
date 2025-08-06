public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // Base case: if either node is null we return the other tree.
        if (t1 == null)
         return t2;
        if (t2 == null)
         return t1;

        //create a new node with the total of the 2 nodes if they overlapped.
        TreeNode merged = new TreeNode(t1.val + t2.val);

        //merge the left and right children recursively.
        merged.left = mergeTrees(t1.left, t2.left);
        merged.right = mergeTrees(t1.right, t2.right);

        return merged;
    }
}
