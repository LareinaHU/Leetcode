package BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class leetcode272 {
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

    public void inOrder(TreeNode r, List<Integer> nums, Queue<Integer> heap, int k) {
        if (r == null) {
            return;
        }
        inOrder(r.left, nums, heap, k);
        heap.add(r.val);
        if (heap.size() > k) {
            heap.remove();
        }
        inOrder(r.right, nums, heap, k);
    }

    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        List<Integer> nums = new ArrayList<>();
        Queue<Integer> heap = new PriorityQueue<>((o1, o2) -> Math.abs(o1 - target) > Math.abs(o2 - target) ? -1 : 1);
        inOrder(root, nums, heap, k);
        return new ArrayList<>(heap);
    }
}
