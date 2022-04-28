package ninechapter9;

import java.util.Stack;

public class lint453preorder {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }

    public void flatten(TreeNode root) {
        // write your code here
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        while(root.right != null){
            stack.push(root);
            root = root.right;
        }
        root = stack.pop();


    }
}
