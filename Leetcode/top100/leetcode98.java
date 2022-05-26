package top100;

import java.util.ArrayList;
import java.util.List;

public class leetcode98 {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return false;
        }

        List<Integer> res = inOrder(root, new ArrayList<>());
        for (int i = 1; i < res.size(); i++) {
            if (res.get(i - 1) >= res.get(i)) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> inOrder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return new ArrayList<>(res);
        }
        inOrder(root.left, res);
        res.add(root.val);
        inOrder(root.right, res);
        return res;
    }
}

