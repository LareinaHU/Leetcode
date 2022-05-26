package ninechapter9;

import java.util.ArrayList;
import java.util.List;

public class permulation46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return results;
        }
        dfs(nums, new boolean[nums.length], new ArrayList<>(), results);
        return results;
    }

    private void dfs(int[] nums, boolean[] visited, List<Integer> permutation, List<List<Integer>> results){
        if(nums.length == permutation.size()){
            results.add(new ArrayList<>(permutation));
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if(visited[i]){
                continue;
            }
            permutation.add(nums[i]);
            visited[i] = true;
            dfs(nums, visited, permutation, results);
            visited[i] = false;
            permutation.remove(permutation.size() - 1);


        }
    }
}

