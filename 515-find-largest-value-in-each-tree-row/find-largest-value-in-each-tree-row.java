public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        //BFS traversal.
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int max = Integer.MIN_VALUE;

            //checking all nodes in the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

                //update max value for this level
                max = Math.max(max, current.val);

                // Add children to queue
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            // After finishing one level, add the max to the result
            result.add(max);
        }

        return result;
    }
}
