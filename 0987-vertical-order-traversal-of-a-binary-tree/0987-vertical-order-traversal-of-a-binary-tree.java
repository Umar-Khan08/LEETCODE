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
    static class Tuple {
        TreeNode node;
        int x;
        int y;
        Tuple(TreeNode node, int x, int y) {
            this.node = node;
            this.x = x;
            this.y = y;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) 
        {
            return result;
        }
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> nodesMap = new TreeMap<>();
        Queue<Tuple> queue = new LinkedList<>();
        queue.offer(new Tuple(root, 0, 0));
        while (!queue.isEmpty()) 
        {
            Tuple tuple = queue.poll();
            TreeNode node = tuple.node;
            int x = tuple.x;
            int y = tuple.y;
            if (!nodesMap.containsKey(x)) 
            {
                nodesMap.put(x, new TreeMap<>());
            }
            TreeMap<Integer, PriorityQueue<Integer>> yMap = nodesMap.get(x);
            if (!yMap.containsKey(y)) 
            {
                yMap.put(y, new PriorityQueue<>());
            }
            PriorityQueue<Integer> pq = yMap.get(y);
            pq.offer(node.val);
            if (node.left != null) 
            {
                queue.offer(new Tuple(node.left, x - 1, y + 1));
            }
            if (node.right != null) 
            {
                queue.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }
        for (TreeMap<Integer, PriorityQueue<Integer>> yMap : nodesMap.values()) 
        {
            List<Integer> column = new ArrayList<>();
            for (Integer y : yMap.keySet()) 
            {
                PriorityQueue<Integer> nodes = yMap.get(y);
                while (!nodes.isEmpty()) {
                    int value = nodes.poll();
                    column.add(value);
                }
            }
            result.add(column);
        }
        return result;
    }
}