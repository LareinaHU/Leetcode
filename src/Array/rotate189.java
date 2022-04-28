package Array;

import java.util.Arrays;

public class rotate189 {
    public static int[] assist;

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        assist = new int[length];
        for (int i = 0; i < length; i++) {
            if (i + k % length < length) {
                assist[i + k% length] = nums[i];
            } else {
                assist[i + k % length - length] = nums[i];
            }
        }
        for(int i = 0; i < length; i++){
            nums[i] = assist[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {12, 2, 3, 24, 5};
        int k = 100;
        rotate(a, k);
        System.out.println(Arrays.toString(assist));

    }
}
