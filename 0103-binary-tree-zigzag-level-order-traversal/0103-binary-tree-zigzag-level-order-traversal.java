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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         Queue<TreeNode> que=new LinkedList<>();
         List<List<Integer>> ans=new ArrayList<>();
         if(root==null) return ans;
         que.add(root);
         boolean ltr=true;
         while(!que.isEmpty())
         {
            int size=que.size();
            List<Integer> sublist = new ArrayList<>(Collections.nCopies(size, 0));
            for(int i=0;i<size;i++)
            {
                TreeNode curr=que.poll();
                
                 int index = ltr ? i : (size - 1 - i);
                sublist.set(index, curr.val);
                if(curr.left!=null) que.add(curr.left);
                if(curr.right!=null) que.add(curr.right);
            } ans.add(sublist);
            ltr=!ltr;
         } return ans;
    }
}