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
    private TreeNode first = null, middle = null, last = null, prev = null;

    public void recoverTree(TreeNode root) {
        inorder(root);
        if (first != null && last != null) {
            int temp = first.val;//correcting bst by swapping
            first.val = last.val;
            last.val = temp;
        } else if (first != null && middle != null) {
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }
    }
    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev != null && prev.val > node.val) {
            if (first == null) {
                first = prev;  // First out-of-order node
                middle = node; // Middle node in case nodes are adjacent
            } else {
                last = node;   // Last out-of-order node
            }
        }
        prev = node; 
        inorder(node.right);
    }

}