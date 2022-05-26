package BinarySearch;

public class try1223 {
    public int minSubArrayLen(int target, int[] nums) {


        if (nums == null || nums.length == 0) return 0;
        int[] prefixSum = getPrefixSum(nums);
        int res = Integer.MAX_VALUE;
        for (int start = 0; start < nums.length; start++) {
            int end = getEndSub(prefixSum, start, target);
            if (prefixSum[end + 1] - prefixSum[start] >= target) {
                res = Math.min(res, end - start + 1);
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }

    // get the preFixSum
    //nums:        4,   3,   2,   1,     5,   8
    //pre:    0,   4,   7,   9,   10,   15,   23
    public int[] getPrefixSum(int[] nums) {
        int[] prefixSum = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];

        }
        return prefixSum;
    }

    //nums:        4,   3,   2,   1,     5,   8
    //pre:    0,   4,   7,   9,   10,   15,   23

    int getEndSub(int[] prefixSum, int start, int s) {
        int left = start, right = prefixSum.length - 2;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (prefixSum[mid + 1] - prefixSum[start] >= s) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (prefixSum[left + 1] - prefixSum[start] >= s) {
            return left;
        }
        return right;
    }
}
