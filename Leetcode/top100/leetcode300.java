package top100;

import java.util.Arrays;

public class leetcode300 {
    public int lengthOfLIS(int[] nums) {
        int l = nums.length;
        int[] dp = new int[l];
        Arrays.fill(dp, 1);
        for(int i = 1; i < l; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] > nums[j - 1]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = 0;
        for(int i : dp){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}