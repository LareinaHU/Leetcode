package ninechapter9.liveClass9_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSums {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        if (nums == null || nums.length < 4) return res;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < nums.length - 2; j++){
                if(j > i + 1 && nums[j] == nums[ j - 1]) continue;

                int targetoftwo = target - nums[i] - nums[j];
                int left = j + 1;
                int right = nums.length - 1;

                TwoSum(nums, left, right, targetoftwo, i, j, res);

            }
        }
        return res;
    }

    public void TwoSum(int[] nums, int left, int right, int targetoftwo, int i, int j, List<List<Integer>> res){
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == targetoftwo){
                generateQuadruplet(nums, left, right, i, j, res);
                left++;
                right--;
                //去重！！！！！！！！！！！！！！！！！！1
                while(left < right && nums[left] == nums[left - 1]) left++;;
                while(left < right && nums[right] == nums[right + 1]) right--;
            }else if(sum > targetoftwo){
                right--;
            }else{
                left++;
            }
        }
    }

    public void generateQuadruplet(int[] nums, int left, int right, int i, int j, List<List<Integer>> res){
        List<Integer> quadruplet = new ArrayList<>();
        quadruplet.add(nums[i]);
        quadruplet.add(nums[j]);
        quadruplet.add(nums[left]);
        quadruplet.add(nums[right]);
        res.add(quadruplet);
    }
}

//    public List<List<Integer>> fourSum(int[] numbers, int target) {
//        // write your code here
//        List<List<Integer>> res = new ArrayList<>();
//        // 异常处理
//        if (numbers.length < 4) {
//            return res;
//        }
//        // 排序
//        Arrays.sort(numbers);
//
//        // 固定最小值
//        for (int i = 0; i < numbers.length - 3; i++) {
//            // 外层循环的去重
//            if (i > 0 && numbers[i] == numbers[i - 1]) {
//                continue;
//            }
//            for (int j = i + 1; j < numbers.length - 2; j++) {
//                // 外层循环的去重
//                if (j > i + 1 && numbers[j] == numbers[j - 1]) {
//                    continue;
//                }
//                int value = target - numbers[i] - numbers[j];
//                twoSum(numbers, j + 1, numbers.length - 1, value, i, j, res);
//            }
//        }
//        return res;
//    }
//
//    private void twoSum(int[] numbers, int start, int end, int value, int i, int j, List<List<Integer>> res) {
//        int left = start, right = end;
//        while (left < right) {
//            List<Integer> r = new ArrayList<>();
//            if (numbers[left] + numbers[right] == value) {
//                r.add(numbers[i]);
//                r.add(numbers[j]);
//                r.add(numbers[left]);
//                r.add(numbers[right]);
//                res.add(r);
//
//                left++;
//                right--;
//
//                // 去重处理
//                while (left < right && numbers[left] == numbers[left - 1]) {
//                    left++;
//                }
//                while (left < right && numbers[right] == numbers[right + 1]) {
//                    right--;
//                }
//            }
//
//            if (numbers[left] + numbers[right] > value) {
//                right--;
//            }
//            if (numbers[left] + numbers[right] < value) {
//                left++;
//            }
//        }
//    }

