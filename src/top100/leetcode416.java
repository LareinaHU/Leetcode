package top100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class leetcode416 {
    public boolean canPartition(int[] nums) {
        if(nums == null || nums.length == 0){
            return true;
        }
        int sum = 0;
        for(int i: nums){
            sum += i;
        }
        if(sum % 2 != 0){
            return false;
        }

        int halfSum = sum / 2;
        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][halfSum + 1];

        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < halfSum + 1; j++){
                if(i == 0 && j == 0){
                    return true;
                }
                else if(i == 0){
                    return false;
                }else if(j == 0){
                    return true;
                }else{
                    if(j >= nums[i]){
                        dp[i][j]= dp[i - 1][j] || dp[i - 1][j - nums[i]];
                    }else{
                        dp[i][j] = dp[i - 1][j];
                    }



                }
            }
        }
        return dp[n][halfSum];
    }
}