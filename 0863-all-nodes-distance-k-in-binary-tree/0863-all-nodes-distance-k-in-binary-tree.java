/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution{
    public List<Integer> distanceK(TreeNode root,TreeNode target,int k){
        Map<TreeNode,TreeNode> parentMap=new HashMap<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(node.left!=null){
                parentMap.put(node.left,node);
                queue.add(node.left);
            }
            if(node.right!=null){
                parentMap.put(node.right,node);
                queue.add(node.right);
            }
        }
        List<Integer> result=new ArrayList<>();
        Map<TreeNode,Boolean> visited=new HashMap<>();
        queue.add(target);
        visited.put(target,true);
        int currentDistance=0;
        while(!queue.isEmpty()){
            if(currentDistance==k){
                while(!queue.isEmpty()) result.add(queue.poll().val);
                return result;
            }
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null&&visited.get(node.left)==null){
                    queue.add(node.left);
                    visited.put(node.left,true);
                }
                if(node.right!=null&&visited.get(node.right)==null){
                    queue.add(node.right);
                    visited.put(node.right,true);
                }
                if(parentMap.containsKey(node)&&visited.get(parentMap.get(node))==null){
                    queue.add(parentMap.get(node));
                    visited.put(parentMap.get(node),true);
                }
            }
            currentDistance++;
        }
        return result;
    }
}