public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();

        if (root == null) {
            return paths;
        }

        dfs(root, "", paths);

        return paths;
    }

    private void dfs(TreeNode node, String path, List<String> paths) {
        if (node == null) {
            return;
        }

        //add the current node to the path
        path += node.val;

        //here we check if it's a leaf node then we add the path.
        if (node.left == null && node.right == null) {
            paths.add(path);
        } else {
            //if not a leaf then continue 
            path += "->";  //only add an arrow if we are still walking deeper.
            dfs(node.left, path, paths);
            dfs(node.right, path, paths);
        }
    }
}
