package BinarySearch;

import java.util.Stack;

public class leetcode114 {
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

    public void flatten(TreeNode root) {
        flattenAndReturn(root);
    }

    private TreeNode flattenAndReturn(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = flattenAndReturn(root.left);
        TreeNode right = flattenAndReturn(root.right);

        if (left != null) {
            left.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        if (right != null) {
            return right;
        } else if (left != null) {
            return left;
        } else {
            return root;
        }
    }
}