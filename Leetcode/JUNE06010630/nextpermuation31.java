package JUNE06010630;

//public class nextpermuation31 {
//    public void nextPermutation(int[] nums) {
//        if (nums.length <= 1) return;
//        int pivot = nums.length - 2;
//        while (pivot >= 0 && nums[pivot] > nums[pivot + 1]) {
//            pivot--;
//        }
//        if (pivot < 0) {
//            reverse(nums, 0, nums.length - 1);
//            return;
//        } else {
//            int q = pivot++;
//
//
//        }
//    }
//
//    public static void reverse(int[] nums, int l, int r) {
//        r = nums.length;
//        for (int i = 0; i < nums.length; i++) {
//            if (i == l / 2) break;
//            int temp;
//            temp = nums[i];
//            nums[i] = nums[l - 1 - i];
//            nums[l - 1 - i] = temp;
//        }
//    }
//}
