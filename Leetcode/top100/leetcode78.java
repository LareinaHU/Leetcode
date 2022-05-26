package top100;

import java.util.ArrayList;
import java.util.List;

public class leetcode78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }
        helper(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void helper(int[] nums, int index, List<Integer> subset, List<List<Integer>> ans) {

        ans.add(new ArrayList<>(subset));
        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            helper(nums, i + 1, subset, ans);
            subset.remove(subset.size() - 1);
        }

    }
}
