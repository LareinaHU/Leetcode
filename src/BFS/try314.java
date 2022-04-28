package BFS;

import javafx.util.Pair;

import java.util.*;

public class try314 {
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

    class Solution {
        public List<List<Integer>> verticalOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
            queue.offer(new Pair<>(root, 0));
            Map<Integer, List<Integer>> map = new HashMap<>();
            int min_Coordinate = 0, max_Coordinate = 0;
            while (!queue.isEmpty()) {
                Pair curr = queue.poll();
                TreeNode currT = (TreeNode) curr.getKey();
                int coordinate = (int) curr.getValue();
                map.putIfAbsent(coordinate, new ArrayList<>());
                map.get(coordinate).add(currT.val);
                min_Coordinate = Math.min(min_Coordinate, coordinate);
                max_Coordinate = Math.max(max_Coordinate, coordinate);
                if (currT.left != null) {
                    queue.offer(new Pair<>(currT.left, coordinate - 1));
                }
                if (currT.right != null) {
                    queue.offer(new Pair<>(currT.right, coordinate + 1));
                }
            }
            for (int i = min_Coordinate; i <= max_Coordinate; i++) {
                ans.add(map.get(i));
            }
            return ans;
        }
    }
}
