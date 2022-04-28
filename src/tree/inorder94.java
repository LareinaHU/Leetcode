package tree;

import java.util.ArrayList;
import java.util.List;

public class inorder94 {
    class TreeNode {
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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> level = new ArrayList<>();
        dfs(root, level);
        return level;
    }

    public void dfs(TreeNode root, List<Integer> level) {
        if (root == null) return;
        if (root.left != null) dfs(root.left, level);
        level.add(root.val);
        if (root.right != null) dfs(root.right, level);

    }

}
