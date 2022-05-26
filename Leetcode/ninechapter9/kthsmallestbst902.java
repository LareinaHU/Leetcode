package ninechapter9;

import java.util.*;

public class kthsmallestbst902 {
    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        // write your code here
        Stack<TreeNode> stack = new Stack();
        while(true){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(--k == 0){
                return root.val;
            }
            root = root.right;
        }
    }
}