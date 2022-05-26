package top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 3){
            return res;
        }

        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i != 0 && nums[i - 1] == nums[i]){
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while(left < right){
                int k = nums[i] + nums[left] + nums[right];
                if(k == 0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    left++;
                    while(left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    right--;
                }else if(k < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return res;
    }
}
//
//        HashMap<List<Integer>, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//            List<Integer> list = new ArrayList<>();
//
//        }
//    }
//}
