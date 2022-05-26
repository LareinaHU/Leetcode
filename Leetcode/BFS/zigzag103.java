package BFS;

import DFS.dfs102;

import java.util.*;

public class zigzag103 {
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        return bfs(root, res);
    }

    public List<List<Integer>> bfs(TreeNode root, List<List<Integer>> res) {
        if (root == null) return res;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int levelsize = 0;
        while (!queue.isEmpty()) {
            levelsize++;
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                level.add(curr.val);
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);

            }
            if (levelsize % 2 == 0) {
                Collections.reverse(level);
            }
            res.add(new ArrayList<>(level));
        }
        return res;
    }
}
