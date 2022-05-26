package BinarySearch;

public class SplitArrayLargestSum410 {
    public static int splitArray(int[] nums, int m) {
        int max = 0;
        int sum = 0;
        int n = nums.length;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        int lo = max;
        int hi = sum;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int pp = pieces(nums, mid);
            if (pp > m) // mid is smaller than the result,so turn to the right part
            {
                lo = mid + 1;
            } else {        //mid is bigger than the expected result
                hi = mid;
            }
        }
        return lo;
    }

    private static int pieces(int[] nums, int largestSum) {
        int pieces = 1;
        int tempSum = 0;
        for (int num : nums) {
            if (tempSum + num > largestSum) {
                tempSum = num;
                pieces++;
            } else {
                tempSum += num;
            }
        }
        return pieces;

    }


    public static void main(String[] args) {
        int[] a = {7, 2, 5, 10, 18};
        int t = splitArray(a, 3);
        System.out.println(t);
    }

}
