package top100;

import java.util.HashMap;

public class leetcode105try {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < preorder.length; i++){
            map.put(inorder[i], i);
        }

        return helper(preorder, 0, inorder, 0, inorder.length - 1, map);

    }
    private TreeNode helper(int[] preorder, int root_pre, int[] inorder, int start, int end, HashMap<Integer, Integer> map){

        //1, base case
        if(root_pre >= preorder.length || start > end){
            return null;
        }
        //2. define the root
        TreeNode root = new TreeNode(preorder[root_pre]);
        //3. update the root.left
        /*      update root_pre:
                    preorder: root, left, right. -> the root.left:  root_pre + 1
                update start:
                update end:
                    inorder, left part start from the start end to the root_in - 1,

        */

        int root_in = map.get(preorder[root_pre]);

        root.left = helper(preorder, root_pre + 1,inorder, start, root_in - 1, map);
        root.right = helper(preorder, root_pre + root_in - start + 1, inorder, root_in + 1, end, map);

        //4. update the root.right
        /*   update root_pre:
                inorder: left, root, right
                1. find the root position in the inorder
                2. calculate the 'left' length in the inorder
                3. in the preorder: the root.right position would be:
                            root_pre + 'left'length
            update start:
            update end:

        */
        return root;
    }

}






