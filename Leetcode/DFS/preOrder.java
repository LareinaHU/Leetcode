package DFS;

public class preOrder {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }


    public void pre_Order(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        pre_Order(root.left);
        pre_Order(root.right);
    }
}
