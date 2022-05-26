package top100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode98simplify {
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


    public boolean isValidBST(TreeNode root) {

        if (root == null) {
            return true;
        }
        return helper(root.left, Integer.MIN_VALUE, root.val) && helper(root.right, root.val, Integer.MAX_VALUE);

    }

    public boolean helper(TreeNode root, long min, long max) {
        if(root.val <= min || root.val >= max){
            return false;

        }
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}