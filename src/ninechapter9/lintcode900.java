package ninechapter9;

import javax.swing.tree.TreeNode;

public class lintcode900 {
    //900 · Closest Binary Search Tree Value
    public class TreeNode {
    public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }
    public int closestValue(TreeNode root, double target) {
        // write your code here
        TreeNode upper = null;
        TreeNode lower = null;

        while(root != null) {
            if (root.val > target) {
                upper = root;
                root = root.left;
            } else if (root.val < target) {
                lower = root;
                root = root.right;
            } else {
                return root.val;
            }
        }
            if(Math.abs(upper.val - target) > Math.abs(lower.val - target)){
                return lower.val;
            }else{
                return upper.val;
            }

    }
}
