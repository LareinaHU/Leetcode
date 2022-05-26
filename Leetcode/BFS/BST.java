package BFS;

public class BST {
    private TreeNode root;

    static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public TreeNode get(int key) {
        TreeNode current = root;
        while (current != null && current.value != key) {
            if (key < current.value) {
                current = current.left;
            } else if (key > current.value) {
                current = current.right;
            }

        }
        return current == null ? null : current;
    }

    public void insert(int key) {
        if (root == null) {
            root = new TreeNode(key);
            return;
        }
        TreeNode current = root;
        TreeNode parent = null;
        while (true) {
            parent = current;
            if (key < parent.value) {
                current = parent.left;
                if (current == null) {
                    parent.left = new TreeNode(key);
                    return;
                }
            } else if (key > parent.value) {
                current = parent.right;
                if (current == null) {
                    parent.right = new TreeNode(key);
                    return;
                }
            } else {
                return;
            }
        }
    }

}
