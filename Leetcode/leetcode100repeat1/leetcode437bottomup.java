package leetcode100repeat1;

public class leetcode437bottomup {
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


    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        return helper(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    public int helper(TreeNode root, int targetSum) {
        int res = 0;
        if(root == null){
            return res;
        }
        if(root.val == targetSum){
            res++;
        }
        res += helper(root.left, targetSum - root.val) + helper(root.right, targetSum - root.val);
        return res;

    }
}
