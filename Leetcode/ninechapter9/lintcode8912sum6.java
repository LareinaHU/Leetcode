package ninechapter9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class lintcode8912sum6 {
    public static int twoSum6(int[] nums, int target) {
        // write your code here
        if (nums.length < 2) return 0;

        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        int repeat = 0;
        int start = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            // 1 3 5 5 5 7 7 9  target = 10
            if (set.contains(target - nums[i]) && nums[i] * 2 == target) {
                repeat = 1;
            }
            if (set.contains(target - nums[i]) && nums[i - 1] == nums[i]) {
                continue;
            }
            if (set.contains(target - nums[i])) {
                count++;
            }
            set.add(nums[i]);
        }
        return count + repeat;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 5, 5, 7, 7, 9};
        int target = 10;
        int k = twoSum6(nums, target);
        System.out.println(k);
    }
}
