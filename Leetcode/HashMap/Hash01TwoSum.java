package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class Hash01TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> Haha = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (Haha.containsKey(target - nums[i])) {
                return new int[]{i, Haha.get(target - nums[i])};
            }
            Haha.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        int[] aa = {23,34,65,467,5,7,68,7};
        int[] bb = twoSum(aa,14);
        System.out.println(Arrays.toString(bb));

    }
}
