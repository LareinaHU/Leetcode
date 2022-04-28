package JUNE06010630;

import java.util.ArrayList;
import java.util.Arrays;

public class move283 {
    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        if (length <= 1) return;
        int p = 0;
        int q = 0;
        while (p < length) {
            if (nums[p] == 0) {
                p++;
            } else {
                nums[q++] = nums[p++];
            }
        }
        for (int i = q; i < length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 0, 0, 12, 32, 43, 5454, 6};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}
