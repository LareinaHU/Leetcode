package BinarySearch;

public class leetcode1644 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode ans;

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        rec(root, p, q);
        return ans;
    }

    private static int rec(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return 0;
        }
        int count = (p == root || q == root) ? 1 : 0;
        int left = rec(root.left, p, q);
        int right = rec(root.right, p, q);
        if (count + left + right == 2 && ans == null) {
            ans = root;

        }
        return count + left + right;
    }

    private static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        System.out.println(root.val);
        TreeNode level11 = root.left;
        level11.val = 5;
        TreeNode level12 = root.right;
        level12.val = 1;
        TreeNode level21 = level11.left;
        level21.val = 6;
        TreeNode level22 = level11.right;
        level22.val = 2;
        TreeNode level23 = level12.left;
        level23.val = 0;
        TreeNode level24 = level12.right;
        level24.val = 8;
        TreeNode level33 = level22.left;
        level33.val = 7;
        TreeNode level34 = level22.right;
        level34.val = 4;
        TreeNode newNode = new TreeNode(4);
        TreeNode ans = lowestCommonAncestor(root, level11, newNode);
        System.out.println(ans.val);
    }
}
