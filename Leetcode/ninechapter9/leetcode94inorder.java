package ninechapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class leetcode94inorder {
    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        helper(root, results);
        return results;
    }

    public void helper(TreeNode root, List<Integer> results) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, results);
            }
            results.add(root.val);
            if (root.right != null) {
                helper(root.right, results);
            }
        }

    }
}
