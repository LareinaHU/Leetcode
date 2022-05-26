package Leetcode5May;

import java.util.Stack;

public class nondecreasing {
    public static boolean checkPossibility(int[] nums) {
        if (nums.length < 3) return true;
        int count = 0;
        if (nums[0] > nums[1]) {
            count++;
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                if (nums[i] >= nums[i - 2]) {
                    nums[i - 1] = nums[i];
               //     break;
                } else {
                    nums[i] = nums[i - 1];
               //     break;
                }
            }
        }
        if (count > 1) return false;
        else return true;
    }


    public static void main(String[] args) {
        int[] a = {3,4,2,3};
        boolean aa = checkPossibility(a);
        System.out.println(aa);

    }
}
