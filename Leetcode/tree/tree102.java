package tree;

import java.util.*;

public class tree102 {
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

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

       // dfs(root, res);
        return res;

    }

    public void dfs(TreeNode root, List<List<Integer>> res, List<Integer> level) {
    }
}