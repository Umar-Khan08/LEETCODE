import java.util.Stack;
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        BSTIterator leftIterator = new BSTIterator(root, false);
        BSTIterator rightIterator = new BSTIterator(root, true);

        int left = leftIterator.next();
        int right = rightIterator.next();
        while (left < right) {
            long sum = (long) left + right;

            if (sum == k) {
                return true;
            } else if (sum < k) {
                if (!leftIterator.hasNext()) {
                    return false;
                }
                left = leftIterator.next();
            } else {
                if (!rightIterator.hasNext()) {
                    return false;
                }
                right = rightIterator.next();
            }
        }

        return false;
    }
}
class BSTIterator {
    private final Stack<TreeNode> stack = new Stack<>();
    private final boolean reverse;

    BSTIterator(TreeNode root, boolean reverse) {
        this.reverse = reverse;
        pushAll(root);
    }

    private void pushAll(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = reverse ? node.right : node.left;
        }
    }
    boolean hasNext() {
        return !stack.isEmpty();
    }
    int next() {
        TreeNode node = stack.pop();
        if (reverse) {
            pushAll(node.left);
        } else {
            pushAll(node.right);
        }
        return node.val;
    }
}