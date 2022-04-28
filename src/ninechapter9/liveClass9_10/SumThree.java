package ninechapter9.liveClass9_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumThree {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null || nums.length < 3) return results;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];
            twoSum(nums, left, right, target, results);
        }
        return results;
    }

    public void twoSum(int[] nums, int left, int right, int target, List<List<Integer>> results) {
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                generatetriplet(nums, left, right, target, results);
                left++;
                right--;
                while (left < right && nums[left - 1] == nums[left]) {
                    left++;
                }
                while (left < right && nums[right + 1] == nums[right]) {
                    right--;
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public void generatetriplet(int[] nums, int left, int right, int target, List<List<Integer>> results) {
        List<Integer> triplet = new ArrayList<>();
        triplet.add(-target);
        triplet.add(nums[left]);
        triplet.add(nums[right]);
        results.add(triplet);
    }
}

