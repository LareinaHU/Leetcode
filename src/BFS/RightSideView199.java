package BFS;

import java.util.*;

public class RightSideView199 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> rightSideView(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            if (root == null) return res;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode cur = queue.poll();
                    if(i == size-1){
                    res.add(cur.val);}
                    if (cur.left != null)
                        queue.offer(cur.left);

                    if (cur.right != null) queue.offer(cur.right);
                }
            }
            return res;
        }

    public static void main(String[] args) {
        TreeNode r4 = new TreeNode(7, null, null);
        TreeNode r3 = new TreeNode(15, null, null);
        TreeNode r2 = new TreeNode(20, r3, r4);
        TreeNode r1 = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, r1, r2);
        List<Integer> aa = rightSideView(root);
        System.out.println(aa);
    }
}
