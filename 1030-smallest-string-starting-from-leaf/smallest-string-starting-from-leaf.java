public class Solution {
    private String smallest = null;

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return smallest;
    }

    private void dfs(TreeNode node, StringBuilder path) {
        if (node == null) return;

        //pend current char to path.
        path.insert(0, (char) ('a' + node.val));

        // this means it's a leaf 
        if (node.left == null && node.right == null) {
            String current = path.toString();
            if (smallest == null || current.compareTo(smallest) < 0) {
                smallest = current;
            }
        }

        dfs(node.left, path);
        dfs(node.right, path);

        //remove the char we added at the front
        path.deleteCharAt(0);
    }
}
