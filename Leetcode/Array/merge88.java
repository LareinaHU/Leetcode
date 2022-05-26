package Array;

import java.util.Arrays;
import java.util.HashSet;

public class merge88 {
    public static int[] assist;

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        assist = new int[m+n];
        if (m == 0 && n == 0) return;
        int p1 = 0;
        int p2 = 0;
        int i = 0;
        while (p1 < m && p2 < n) {
            if (nums1[p1] <= nums2[p2]) {
                assist[i++] = nums1[p1++];
            } else {
                assist[i++] = nums2[p2++];
            }
        }
        while (p1 < m) {
            assist[i++] = nums1[p1++];
        }
        while (p2 < n) {
            assist[i++] = nums2[p2++];
        }
        for(int k = 0; k < m + n; k++){
            nums1[k] = assist[k];
        }
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0, 0, 0};
        int[] b = {2, 5, 6};
        merge(a, 6, b, 3);
        System.out.println(Arrays.toString(assist));
    }

}
