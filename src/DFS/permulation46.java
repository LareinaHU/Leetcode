package DFS;

import java.util.ArrayList;
import java.util.List;

public class permulation46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null) {
            return results;
        }
        dfs(nums, new boolean[nums.length], new ArrayList<>(), results);
        return results;
    }


    public void dfs(int[] nums, boolean[] visit, List<Integer> permutation, List<List<Integer>> results) {
        if (nums.length == permutation.size()) {
            results.add(new ArrayList<>(permutation));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visit[i]) {
                continue;
            }
            permutation.add(nums[i]);
            visit[i] = true;
            dfs(nums, visit, permutation, results);
            visit[i] = false;
            permutation.remove(permutation.size() - 1);
        }
    }
}
