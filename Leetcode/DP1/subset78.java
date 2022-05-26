package DP1;

import java.util.ArrayList;
import java.util.List;

public class subset78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, nums, new ArrayList<>(), 0);
        return res;
    }

    private static void dfs(List<List<Integer>> res, int[] nums, List<Integer> cur, int index) {
        if (index >= nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        dfs(res, nums, cur, index + 1);
        cur.add(nums[index]);
        dfs(res, nums, cur, index + 1);
        cur.remove(cur.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = {11,22,33};
        List<List<Integer>> ll = subsets(nums);
        ll.toArray();
        System.out.println(ll);
    }
}
