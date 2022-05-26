package top100;


//[2,3,1,2,4,3]


public class leetcode209 {
    public static int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        int i, j = 0;
        int n = nums.length;
        int sum = 0;
        for (i = 0; i < n; i++) {
            sum += nums[i];
            while (j <= i) {
                if (sum >= target) {
                    res = Math.min(res, i - j + 1);
                    sum -= nums[j++];
                    // j++;
                } else {
                    break;
                }
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}