package BinarySearch;

public class LCA1164 {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    class Solution {
        TreeNode ans;
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            rec(root, p, q);
            return ans;
        }

        private int rec(TreeNode root, TreeNode p, TreeNode q){
            if(root == null) return 0;
            int count = (p == root || q == root) ? 1 : 0;
            int left = rec(root.left, p, q), right = rec(root.right, p, q);
            if(count +left + right == 2 && ans == null) ans = root;
            return count + left + right;
        }
    }
}
