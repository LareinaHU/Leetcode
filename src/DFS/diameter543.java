package DFS;

public class diameter543 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int va, TreeNode left, TreeNode right) {
            this.val = val;
            this.right = right;
            this.left = left;
        }

    }

    private int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        longestPath(root);
        return diameter;
    }

    private int longestPath(TreeNode root) {
        if (root == null) return 0;
        int leftPath = longestPath((root.left));
        int rightPath = longestPath(root.right);

        diameter = Math.max(diameter, leftPath + rightPath);
        return Math.max(leftPath, rightPath) + 1;
    }
}
