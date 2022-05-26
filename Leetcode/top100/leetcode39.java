package top100;

import java.util.ArrayList;
import java.util.List;

public class leetcode39 {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if(candidates == null || candidates.length == 0){
            return ans;
        }

        helper(candidates, target, ans, new ArrayList<>(), 0);
        return ans;
    }

    private static void helper(int[] candidates, int target, List<List<Integer>> ans, List<Integer> level, int start){
        if(target == 0){
            ans.add(new ArrayList<>(level));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = start; i < candidates.length; i++){
            level.add(candidates[i]);
            helper(candidates, target - candidates[i], ans, level, i);
            level.remove(level.size() - 1);
        }
    }
}