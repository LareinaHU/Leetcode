package top100;

import java.util.HashMap;

public class leetcode105 {
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < preorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder, 0, inorder.length - 1, map);
    }

    public TreeNode helper(int[] preorder, int rootKey, int[] inorder, int start, int end, HashMap<Integer,Integer> map) {
        if(rootKey > preorder.length - 1 || start > end){
            return null;
        }
        TreeNode root = new TreeNode(preorder[rootKey]);
        int rootIndex = map.get(preorder[rootKey]);

        root.left = helper(preorder, rootKey + 1, inorder, start, rootIndex - 1, map);
        root.right = helper(preorder, rootKey + 1, inorder, rootIndex + 1, end, map);
        return root;
    }
}
