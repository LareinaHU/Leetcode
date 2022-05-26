package JUNE06010630;

public class houserob_213 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            if (nums.length % 2 == 0) {
                dp[i] = Math.max(dp[i - 1], dp[i - 2]);
            } else {
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);

            }
        }
        return dp[nums.length];
    }
}
