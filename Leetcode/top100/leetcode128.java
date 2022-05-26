package top100;

import java.util.HashMap;

public class leetcode128 {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], nums[i]);
        }
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (map.get(i) != null) {
                count++;
                i++;
            }
            maxLen = Math.max(maxLen, count);
            i++;
        }
        return maxLen;
    }
}

