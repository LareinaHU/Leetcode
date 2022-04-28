package BinarySearch;

import java.util.Arrays;

public class heapKthlargest215 {
    public int findKthLargest(int[] nums, int k) {
       sort(nums,0,nums.length-1);
       return nums[k];
    }
//using the quicksort to solve this problem nlogn
    public static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int partition = partition(a, lo, hi);
        sort(a, lo, partition - 1);
        sort(a, partition + 1, hi);

    }


    public static int partition(int[] a, int lo, int hi) {
        int pivot = a[lo];
        int left = lo;
        int right = hi + 1;
        while (true) {
            //from right to left
            while (pivot > a[--right]) {
                if (right == lo) break;
            }
            while (pivot < a[++left]) {
                if (left == hi) break;
            }

            if (left >= right) {
                break;
            } else {
                exchange(a, left, right);

            }

        }
        exchange(a, lo, right);
        return right;
    }

    public static void exchange(int[] a, int x, int y) {
        int c = a[x];
        a[x] = a[y];
        a[y] = c;

    }


    public static void main(String[] args) {
        int[] a = {234, 5467, 1, 768, 456, 345};
        int n = a.length-1;
        sort(a, 0, n);
        System.out.println(Arrays.toString(a));
    }
}
