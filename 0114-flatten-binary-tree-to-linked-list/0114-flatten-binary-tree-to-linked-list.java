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
    private TreeNode prev = null;
    private void flattenHelper(TreeNode root) {
        if (root == null) return;// preorder traversal
        flattenHelper(root.right);
        flattenHelper(root.left);
        root.right = prev;
        root.left = null;// remove all the pointers from the left so that it could be converted to the linked list
        prev = root;
    }
    public void flatten(TreeNode root) {
        prev = null;
        flattenHelper(root);
    }
}