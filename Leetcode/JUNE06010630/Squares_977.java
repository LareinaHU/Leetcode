package JUNE06010630;

import java.util.PriorityQueue;

public class Squares_977 {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] res = new int[nums.length];
        for (int i = end; i >= 0; i--) {
            if (Math.abs(nums[start]) >= Math.abs(nums[end])) {
                res[i] = nums[start] * nums[start];
                start++;
            } else {
                res[i] = nums[end] * nums[end];
                end--;
            }

        }
        return res;
    }

    public static void main(String[] args) {

    }


}
