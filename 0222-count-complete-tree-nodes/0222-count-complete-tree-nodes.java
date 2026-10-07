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
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = findHeightLeft(root); //count left height of a particular node
        int rh = findHeightRight(root);// count right height '' '' '' '' '' '' 
        if (lh == rh) {
            return (1 << lh) - 1; //if tree heights are same then total node in that that subtree are 2 to the pewer height -1
        }
        return 1 + countNodes(root.left) + countNodes(root.right); //call for all nodes
    }
    private int findHeightLeft(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }
    private int findHeightRight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.right;
        }
        return height;
    }
}