package Leetcode3march;

//
public class addOneRow {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (root == null)
            return null;
        if (d == 1) {
            return new TreeNode(v, root, null);
        } else if (d == 2) {
            root.left = new TreeNode(v, root.left, null);
            root.right = new TreeNode(v, null, root.right);
            return root;
        }
        addOneRow(root.left, v, d - 1);
        addOneRow(root.right, v, d - 1);
        return root;
    }

}
