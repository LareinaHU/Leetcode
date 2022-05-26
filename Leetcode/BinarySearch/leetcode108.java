package BinarySearch;

public class leetcode108 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }
    }

        public TreeNode sortedArrayToBST(int[] nums) {

            if(nums.length == 0) return null;
            return construct(nums, 0, nums.length - 1);
        }
        private TreeNode construct(int[] nums, int start, int end){
            if(start > end) return null;
            int p = start + (end - start) / 2;
            TreeNode root = new TreeNode(nums[p]);
            root.left = construct(nums, start, p - 1);
            root.right = construct(nums, p + 1, end);

            return root;
        }
    }