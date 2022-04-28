package Math;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement)) {
//                return new int[] { map.get(complement), i };
//            }
//            map.put(nums[i], i);
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }

        public static int[] twoSum(int[] nums, int target) {

                HashMap<Integer, Integer> Hash = new HashMap<>();
                for(int i = 0; i < nums.length; i++){
                    int TT = target - nums[i];
                    if(Hash.containsKey(TT)){
                        return new int[] {Hash.get(TT),i};
                    }
                    Hash.put(nums[i], i);
                }
                throw new IllegalArgumentException("No two sum solution");
        }

    public static void main(String[] args) {
      new TwoSum1();
        int a[] = {2, 7, 11, 15};
        int target = 9;
        int[] b = twoSum(a, target);
        System.out.println(Arrays.toString(b));
    }

}
