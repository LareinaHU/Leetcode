package ninechapter9;

import java.util.*;

public class lintcode587twosumUniquepairs {
    public static int twoSum6(int[] nums, int target) {

        // write your code here
        if (nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (set.contains(curr) && curr * 2 == target) flag = 1;
            if (set.contains(curr)) continue;
            if (set.contains(target - curr)) ans++;
            set.add(curr);

        }
        return ans + flag;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 3};
        int target = 2;
        int k = twoSum6(nums, target);
        System.out.println(k);
    }
}

