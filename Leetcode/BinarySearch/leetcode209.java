package BinarySearch;

public class leetcode209 {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (start <= i && sum >= target) {

                res = Math.min(res, i - start + 1);
                sum -= nums[i];
                start++;

            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
