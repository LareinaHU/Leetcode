package top100;

public class leetcode33 {


    public int search(int[] nums, int target) {
        if (nums == null || nums.length <= 1) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > nums[left]) {
                if (nums[mid] >= target && target >= nums[left]) {
                    right = mid + 1;
                } else {
                    left = mid - 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

//try left+1< right; and check the left and right