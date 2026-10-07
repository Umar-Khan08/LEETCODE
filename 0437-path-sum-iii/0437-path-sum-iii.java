/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0;
    private void dfs(TreeNode root, long currentSum, int targetSum) {
        if (root == null)
            return;
        currentSum += root.val;
        if (currentSum == targetSum)
            count++;
        dfs(root.left, currentSum, targetSum);
        dfs(root.right, currentSum, targetSum);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) { // visiting every node and calculating the all possible paths for each node and incrementing that , that's why the count is not declared inside any function
            TreeNode node = stack.pop();
            dfs(node, 0, targetSum);
            if (node.left != null)
                stack.push(node.left);
            if (node.right != null)
                stack.push(node.right);
        }
        return count;
    }
}