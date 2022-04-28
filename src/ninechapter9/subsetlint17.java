package ninechapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetlint17 {
    public static List<List<Integer>> subsets(int[] nums) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null) {
            return res;
        }
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private static void dfs(int[] nums, int index, List<Integer> subset, List<List<Integer>> res) {
        if (index == nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        dfs(nums, index + 1, subset, res);
        subset.remove(subset.size() - 1);
        dfs(nums, index + 1, subset, res);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        List<List<Integer>> aa= subsets(nums);
        System.out.println(aa);

    }
}
