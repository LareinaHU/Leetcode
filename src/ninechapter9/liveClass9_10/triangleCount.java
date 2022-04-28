package ninechapter9.liveClass9_10;

import java.util.Arrays;

public class triangleCount {

    public int triangleNumber(int[] nums) {
        if (nums == null || nums.length < 2) return 0;
        int res = 0;
        for (int i = 2; i < nums.length; i++) {
            res += TwoSide(nums, i);
        }
        return res;
    }

    private int TwoSide(int[] nums, int targetIndex) {
        int left = 0;
        int right = targetIndex - 1;
        int count = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum > nums[targetIndex]) {
                count += right - left;
                right++;
            } else {
                left++;
            }
        }
        return count;
    }
}