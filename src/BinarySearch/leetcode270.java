package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class leetcode270 {
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

    public void inorder(TreeNode root, List<Integer> nums) {
        if (root == null) return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }


    public int closestValue(TreeNode root, double target) {
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        int ans = Integer.MAX_VALUE;
        int k = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (target - nums.get(i) < ans) {
                ans = nums.get(i);
            } else {
                k = i;
            }
        }
        return Math.abs(target - nums.get(k - 1)) < Math.abs(target - nums.get(k)) ? nums.get(k - 1) : nums.get(k);
    }
}
