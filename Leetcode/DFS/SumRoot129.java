package DFS;

import javax.swing.tree.TreeNode;

public class SumRoot129 {
    public static class TreeNode {
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

    public static int ans;

    public static int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        dfs(root, 0);
        return ans;
    }

    public static void dfs(TreeNode root, int sum) {
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            ans += sum;
            return;
        }
        if (root.left != null) {
            dfs(root.left, sum);
        }
        if (root.right != null) {
            dfs(root.right, sum);
        }

    }

    public static void main(String[] args) {
        TreeNode r4 = new TreeNode(7, null, null);
        TreeNode r3 = new TreeNode(1, null, null);
        TreeNode r2 = new TreeNode(2, r3, r4);
        TreeNode r1 = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, r1, r2);
        int k = sumNumbers(root);
        System.out.println(k);
    }
}
