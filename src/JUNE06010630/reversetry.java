package JUNE06010630;

import java.util.Arrays;

public class reversetry {
    public static void reverse(int[] nums) {
        int l = nums.length;

      //  int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == l / 2) break;
            int temp;
            temp = nums[i];
            nums[i] = nums[l - 1 - i];
            nums[l - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {12, 34, 2, 54, 3, 54};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
}
