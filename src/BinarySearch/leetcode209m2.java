package BinarySearch;

public class leetcode209m2 {
    public int minSubArrayLen(int target, int[] nums) {

        if (nums.length == 0) return 0;
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= nums.length; i++) {
            prefixSum[i] += prefixSum[i - 1] + nums[i - 1];
            if (prefixSum[i] >= target) {
                int left = 0, right = i;
                while (left + 1 < right) {
                    int mid = left + (right - left) / 2;
                    if (prefixSum[i] - prefixSum[mid] >= target) {
                        left = mid;
                    } else {
                        right = mid;
                    }
                }
                if (prefixSum[i] - prefixSum[right] >= target) {
                    min = Math.min(min, i - right);
                }
                if (prefixSum[i] - prefixSum[left] >= target) {
                    min = Math.min(min, i - left);
                }
            }
        }
        if (min == Integer.MAX_VALUE) return 0;
        return min;

    }

}