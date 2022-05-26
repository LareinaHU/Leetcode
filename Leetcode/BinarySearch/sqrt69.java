package BinarySearch;

public class sqrt69 {
//    public static int sqrt(int n) {
//        int ans = 0;
//        for (int i = n / 2; i >= 0; i--) {
//            if (i * i <= n) {
//                ans = i;
//                break;
//            }
//
//        }
//        return ans;
//    }

    public static int sqrt(int n) {
        if (n < 2) return n;
      //  long num;
        int left = 2;
        int right = n / 2;
        while (left <= right) {
            int pivot = left + (right - left) / 2;
            long num =(long) pivot * pivot;
            if (num < n) {
                left = pivot + 1;
            } else if (num > n) {
                right = pivot - 1;
            } else return pivot;
        }
        return right;
    }

    public static void main(String[] args) {
        int n = sqrt(99);
        System.out.println(n);
    }
}
