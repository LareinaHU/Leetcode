package top100;

public class leetcode75 {
    public void sortColors(int[] nums) {
        int[] count = new int[3];

        for (int i : nums) {
            count[i]++;
        }
        int p = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[p++] = i;
                count[i] -= 1;
            }


        }
    }
}


