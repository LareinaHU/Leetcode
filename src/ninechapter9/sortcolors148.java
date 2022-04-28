package ninechapter9;

import java.util.Arrays;

public class sortcolors148 {
    public static void sortColors(int[] nums) {
        int[] cnt = new int[3];
        for (int i : nums) {
            cnt[i]++;
        }
        System.out.println(Arrays.toString(cnt));

        int index = 0;
        for (int i = 0; i < cnt.length; i++) {
            int p = 0;
            while (p++ < cnt[i]) {
                nums[(index++)] = i;
           //     System.out.println("index--" + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 0, 1, 2, 0, 2,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}