package ninechapter9;

public class lintcode596 {
    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }


    public class Solution {
        TreeNode output = null;
        int minSum = Integer.MAX_VALUE;

        public TreeNode findSubtree(TreeNode root) {
            sumOfTree(root);
            return output;
        }

        private int sumOfTree(TreeNode node) {
            if (node == null) return 0;

            int sum = node.val + sumOfTree(node.left) + sumOfTree(node.right);
            if (minSum > sum) {
                minSum = sum;
                output = node;
            }

            return sum;
        }
    }
}
