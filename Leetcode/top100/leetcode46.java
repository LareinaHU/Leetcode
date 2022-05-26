package top100;

import java.util.ArrayList;
import java.util.List;

public class leetcode46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            results.add(new ArrayList<>());
            return results;
        }
        dfs(nums, new boolean[nums.length], new ArrayList<>(), results);
        return results;
    }

    private void dfs(int[] nums, boolean[] isvisited, List<Integer> permulation, List<List<Integer>> ans) {
        if (permulation.size() == nums.length) {

            ans.add(permulation);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (isvisited[i]) {
                continue;
            }
            permulation.add(nums[i]);
            isvisited[i] = true;
            dfs(nums, isvisited, permulation, ans);
            isvisited[i] = false;
            permulation.remove(permulation.size() - 1);
        }

    }
}
