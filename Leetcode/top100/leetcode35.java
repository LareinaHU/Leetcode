package top100;

public class leetcode35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (nums[left] >= target) {
            return left;
        } else if (target > nums[left] && target <= nums[right]) {
            return right;
        } else {
            return right + 1;
        }

    }
}
