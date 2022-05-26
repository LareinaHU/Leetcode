package top100;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class leetcode437 {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }


    int Counter = 0;

    public int pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, new LinkedList<>());
        return Counter;
    }

    private void dfs(TreeNode root, int tar, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        int curSum = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            curSum += list.get(i);
            if (curSum == tar) {
                Counter++;
            }
        }
        dfs(root.left, tar, list);
        dfs(root.right, tar, list);
        list.remove(list.size() - 1);
    }
}