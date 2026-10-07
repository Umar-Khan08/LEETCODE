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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        findPaths(root, targetSum, path, ans);
        return ans;
    }
    private void findPaths(TreeNode root, int target, List<Integer> path, List<List<Integer>> ans) {
        if (root == null)
            return;
        path.add(root.val);
        target -= root.val;
        if (root.left == null && root.right == null && target == 0) {// this means that we found a path so addingf that path or aa sublist to the answer list
            ans.add(new ArrayList<>(path));
        }
        findPaths(root.left, target, path, ans);
        findPaths(root.right, target, path, ans);
        path.remove(path.size() - 1);// remooving the node so that backtracking in other path can happen
    }
}