package leetcode100repeat1;

import java.util.ArrayList;
import java.util.List;

public class leetcode437 {
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


        public int count = 0;
        public int pathSum(TreeNode root, int targetSum) {
            if(root == null){
                return 0;
            }
            helper(root,targetSum, new ArrayList<>());
            return count;
        }

        private void helper(TreeNode root, int targetSum, List<Integer> list){
            if(root == null){
                return;
            }
            int curSum = 0;
            list.add(root.val);
            for(int i = list.size() - 1; i >= 0; i--){
                curSum += list.get(i);
                if(curSum == targetSum){
                    count++;
                }
            }

            helper(root.right, targetSum, list);
            helper(root.left, targetSum, list);
            list.remove(list.size() - 1);

        }
    }