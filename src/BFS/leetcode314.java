//package BFS;
//
//
//import java.util.*;
//import javafx.util.pair;
//
//public class leetcode314 {
//    class TreeNode {
//        TreeNode left;
//        TreeNode right;
//        int val;
//
//        TreeNode(int val) {
//            this.val = val;
//        }
//
//        TreeNode(TreeNode left, TreeNode right, int val) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//
//
//
//    public List<List<Integer>> verticalOrder(TreeNode root) {
//
//        List<List<Integer>> ans = new ArrayList<>();
//        if (root == null) {
//            return ans;
//        }
//        Queue<Pair<TreeNode, Integer>> q = new ArrayDeque<>();
//
//        q.offer(new Pair<>(root, 0));
//        Map<Integer, List<Integer>> map = new HashMap<>();
//        int min_Hd = 0;
//        int max_Hd = 0;
//        while (!q.isEmpty()) {
//            Pair cur = q.poll();
//            TreeNode a = (TreeNode) cur.getKey();
//            int hd = (int) cur.getValue();
//            map.putIfAbsent(hd, new ArrayList<>());
//            map.get(hd).add(a.val);
//            min_Hd = Math.min(min_Hd, hd);
//            max_Hd = Math.max(max_Hd, hd);
//            if (a.left != null) {
//                q.offer(new Pair(a.left, hd - 1));
//            }
//            if (a.right != null) {
//                q.offer(new Pair(a.right, hd + 1));
//            }
//        }
//        for (int i = min_Hd; i <= max_Hd; i++) {
//            ans.add(map.get(i));
//        }
//        return ans;
//    }
//}
