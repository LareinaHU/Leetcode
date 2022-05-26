package BinarySearch;

public class sq69 {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        long left = 0;
        long right = x / 2;
        while (left + 1 < right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == x) return (int) mid;
            else if (mid * mid < x) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (right * right < x) {
            return (int) right;
        } else {
            return (int) left;
        }
    }
}