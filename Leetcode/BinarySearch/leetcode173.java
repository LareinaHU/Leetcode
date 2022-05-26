package BinarySearch;

import java.util.Stack;

public class leetcode173 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class BSTIterator {
        private TreeNode cur;
        private Stack<TreeNode> stack = new Stack<>();
        public BSTIterator(TreeNode root) {
            cur = root;
        }

        public int next() {
           while(cur != null){
               stack.push(cur);
               cur = cur.left;
           }
           cur = stack.pop();
           int val = cur.val;
           cur = cur.right;
           return val;
        }

        public boolean hasNext() {
            return !stack.isEmpty() || cur != null;
        }
    }


}
