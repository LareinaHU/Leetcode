package ninechapter9.liveClass9_10;

import java.util.Arrays;

public class interleaving144lintcode {
    public static void rerange(int[] A) {
        if (A == null || A.length == 0) return;
        int negCnt = partition(A);
        System.out.println(Arrays.toString(A) + "---");
        int posCnt = A.length - negCnt;
        int start = negCnt > posCnt ? 1 : 0;
        int end = posCnt > negCnt ? (A.length - 2) : (A.length - 1);
        while (start <= end) {
            exch(A, start, end);
            start += 2;
            end -= 2;
        }
    }

    public static int partition(int[] A) {
        int left = 0, right = A.length - 1;
        while (left <= right) {
            while (left <= right && A[left] < 0) left++;
            while (left <= right && A[right] > 0) right--;
            if (left <= right) {
                exch(A, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void exch(int[] nums, int i, int j) {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {-33, -19, 30, 26, 21, -9};
        rerange(a);
        System.out.println(Arrays.toString(a));
    }
}
