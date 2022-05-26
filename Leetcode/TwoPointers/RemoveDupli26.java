package TwoPointers;

import java.util.Arrays;

public class RemoveDupli26 {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        while (j < n) {
            if (nums[i] == nums[j]) {
                j++;
            }else{

                nums[++i] = nums[j++];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] a = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(a);
        System.out.println(k);
        //     System.out.println(Arrays.toString(a));
    }
}
