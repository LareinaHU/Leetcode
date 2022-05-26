package DFS;

import BFS.zigzag103;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dfs107bottomup {
    static class TreeNode {
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

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    private static void dfs(TreeNode root, List<List<Integer>> res, int height) {
        if (root == null) return;
        if (height == res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(height).add(root.val);
        dfs(root.left, res, height + 1);
        dfs(root.right, res, height + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode node = root.left;

        node.right = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right.right = new TreeNode(11);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(9);
        List<List<Integer>> ll = levelOrderBottom(root);
        for (int i = 0; i < ll.size(); i++) {

            System.out.println(Arrays.toString(ll.get(i).toArray()));
        }
    }

}
