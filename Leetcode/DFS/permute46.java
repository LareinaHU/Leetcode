package DFS;

import java.util.ArrayList;
import java.util.List;

public class permute46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if(nums == null || nums.length == 0) return results;
        dfs(nums, new boolean[nums.length], new ArrayList(), results);
        return results;
    }

    public void dfs(int[] nums, boolean[] visited, List<Integer> curr, List<List<Integer>> results){
        if(curr.size() == nums.length){
            results.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i]) continue;
            curr.add(nums[i]);
            visited[i] = true;
            dfs(nums, visited, curr, results);
            visited[i] = false;
            curr.remove(curr.size() - 1);
        }
    }
}