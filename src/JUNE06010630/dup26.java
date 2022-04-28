package JUNE06010630;

public class dup26 {
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int i = 0;
        int q = 0;

        while (i < length) {
            if (nums[i] == nums[q]) {
                i++;
            } else {
                nums[++q] = nums[i++];
            }
        }
        return q;
    }

    public static void main(String[] args) {
        int[] m = {1,1,2};
        int k = removeDuplicates(m);
        System.out.println(k);

    }
}
