package DFS;

public class Hard124 {
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

    static int Max = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        int k = dfs(root);
    //    System.out.println(k);
        return Max;
    }

    private static int dfs(TreeNode node) {
        if (node == null) return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        left = left < 0 ? 0 : left;
        right = right < 0 ? 0 : right;
        Max = Math.max(Max, left + right + node.val);
        System.out.println(Max);
        return Math.max(left + node.val, right + node.val);
    }

    public static void main(String[] args) {
        TreeNode r4 = new TreeNode(7, null, null);
        TreeNode r3 = new TreeNode(15, null, null);
        TreeNode r2 = new TreeNode(20, r3, r4);
        TreeNode r1 = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, r1, r2);
        int cc = maxPathSum(root);
        System.out.println(cc);
    }
}

