package Leetcode3march;

import java.util.HashSet;

public class missingnumber {
    public static int missingNumber(int[] nums) {
        int missing = -1;
        HashSet<Integer> ss = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            ss.add(nums[i]);
        }
        System.out.println(ss);
        for (int i = 0; i < nums.length; i++) {
            if (!ss.contains(i)) {
                return missing = i;
            }
        }
        return missing = nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int c = missingNumber(nums);
        System.out.println(c);

    }
}
