package top100;

import java.util.ArrayList;
import java.util.List;

public class leetcode94 {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode() {
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> ans = new ArrayList<>();
         inorder(root, ans);
         return ans;
        }
        private void inorder(TreeNode root, List<Integer> ans){
            if(root == null){
                return;
            }
            ans.add(root.val);
            inorder(root.left, ans);
            inorder(root.right, ans);
        }
    }
}
