package JUNE06010630;

public class remdup80 {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int p;
        int q = 2;
        if (length <= 2) return length;
        for (p = 2; p < length; p++) {
            if (nums[q - 2] != nums[p]) {
                nums[q++] = nums[p];
            }
        }
        return q;
    }

}
