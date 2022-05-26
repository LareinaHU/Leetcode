//package BFS;
//
//
//
//import java.util.*;
//
//public class leetcode314ans {
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode() {
//        }
//
//        TreeNode(int val) {
//            this.val = val;
//        }
//
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//
//    public List<List<Integer>> verticalOrder(TreeNode root) {
//        List<List<Integer>> output = new ArrayList<>();
//        if (root == null) {
//            return output;
//        }
//
//        Map<Integer, ArrayList> columnTable = new HashMap<>();
//        // Pair of node and its column offset
//        Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque();
//        int column = 0;
//        queue.offer(new Pair(root, column));
//
//        int minColumn = 0, maxColumn = 0;
//
//        while (!queue.isEmpty()) {
//            Pair<TreeNode, Integer> p = queue.poll();
//            root = p.getKey();
//            column = p.getValue();
//
//            if (root != null) {
//                if (!columnTable.containsKey(column)) {
//                    columnTable.put(column, new ArrayList<Integer>());
//                }
//                columnTable.get(column).add(root.val);
//                minColumn = Math.min(minColumn, column);
//                maxColumn = Math.max(maxColumn, column);
//
//                queue.offer(new Pair(root.left, column - 1));
//                queue.offer(new Pair(root.right, column + 1));
//            }
//        }
//
//        for (int i = minColumn; i < maxColumn + 1; ++i) {
//            output.add(columnTable.get(i));
//        }
//
//        return output;
//    }
//}