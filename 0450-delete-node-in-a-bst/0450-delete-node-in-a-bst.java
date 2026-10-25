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
    private TreeNode connector(TreeNode root) {
        if(root.left==null) return root.right;
        if(root.right==null) return root.left;
        TreeNode l=root.left;
        TreeNode r=root.right;
        while(r.left!=null) {
            r=r.left;
        }

        r.left=l;
        return root.right;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;

        if(root.val==key) {
            return connector(root);
        }
        TreeNode curr=root;
        while(curr!=null) {
            if(curr.val>key) {
                if(curr.left!=null && curr.left.val==key) {
                    curr.left=connector(curr.left);
                    break;
                } else {
                    curr=curr.left;
                }
            } else {
                if(curr.right!=null && curr.right.val==key) {
                    curr.right=connector(curr.right);
                    break;
                } else {
                    curr=curr.right;
                }
            }
        }
        return root;
    }
}