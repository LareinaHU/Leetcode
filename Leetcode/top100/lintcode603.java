package top100;

import java.util.*;

public class lintcode603 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        HashMap<Integer, Integer> dp = new HashMap<>();
        HashMap<Integer, Integer> prev = new HashMap<>();
//initialize
        for (int i = 0; i < n; i++) {
            dp.put(nums[i], 1);
            prev.put(nums[i], -1);
        }

        int lastNum = nums[0];
        for (int num : nums) {
            for (Integer factor : getFactors(num)) {
                if (!dp.containsKey(factor)) {
                    continue;
                }
                if (dp.get(num) < dp.get(factor) + 1) {
                    dp.put(num, dp.get(factor) + 1);
                    prev.put(num, factor);
                }
            }
            if (dp.get(num) > dp.get(lastNum)) {
                lastNum = num;
            }
        }
        return getPath(prev, lastNum);
    }

    private List<Integer> getPath(HashMap<Integer, Integer> prev, int lastNum) {
        List<Integer> path = new ArrayList<>();
        while (lastNum != -1) {
            path.add(lastNum);
            lastNum = prev.get(lastNum);
        }
        Collections.reverse(path);
        return path;
    }


    private List<Integer> getFactors(int x) {
        if (x == 1) {
            return new ArrayList<Integer>();
        }
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(1);
        for (int i = 2; i * i <= x; i++) {
            if (x % i != 0) {
                continue;
            }
            ans.add(i);
            if (x / i != i) {
                ans.add(x / i);
            }
        }
        return ans;
    }
}