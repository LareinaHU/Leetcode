package JUNE06010630;

import java.util.Arrays;

public class merge912 {
    public static int[] assist;

    public static int[] sort(int[] nums) {
        assist = new int[nums.length];
        int l = 0;
        int h = nums.length - 1;
        sort(nums, l, h);
        return nums;
    }

    public static void sort(int[] nums, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(nums, lo, mid);
        sort(nums, mid + 1, hi);
        merge(nums, lo, hi, mid);

    }

    public static void merge(int[] nums, int low, int high, int middle) {
        int i = low;
        int p1 = low;
        int p2 = middle + 1;
        while (p1 <= middle && p2 <= high) {
            if (nums[p1] <= nums[p2]) {
                assist[i++] = nums[p1++];
            } else {
                assist[i++] = nums[p2++];
            }
        }
        while (p1 <= middle) {
            assist[i++] = nums[p1++];
        }
        while (p2 <= high) {
            assist[i++] = nums[p2++];
        }
        for (int index = low; index <= high; index++) {
            nums[index] = assist[index];
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 3, 2};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}