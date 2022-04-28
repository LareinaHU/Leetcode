package ninechapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetlint18 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        if(nums == null || nums.length == 0){
            res.add(subset);
            return res;
        }
        Arrays.sort(nums);

        dfs(nums, 0, subset, res);
        return res;
    }

    private void dfs(int[] nums, int startIndex, List<Integer> subset, List<List<Integer>> res){
        for(int i = startIndex; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i - 1] && i > startIndex){
                continue;
            }
            subset.add(nums[i]);
            dfs(nums, i + 1, subset, res);
            subset.remove(subset.size() - 1);
        }

    }
}