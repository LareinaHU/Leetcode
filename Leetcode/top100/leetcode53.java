package top100;

public class leetcode53 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = 0;
            for (int j = i; j < nums.length; j++) {
                curr += nums[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
