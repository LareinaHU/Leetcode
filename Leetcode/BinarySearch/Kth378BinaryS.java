package BinarySearch;

public class Kth378BinaryS {
//    public static boolean guess(int[][] matrix, int g, int k) {
//        int n = matrix.length;
//        int sum1 = 0;
//        for (int i = 0; i < n; ++i) {
//            int L = 0;
//            int R = n - 1;
//            int ans = -1;
//            while (L <= R) {
//                int mid = L + (R - L) / 2;
//                if (matrix[i][mid] < g) {
//                    ans = mid;
//                    L = mid + 1;
//                } else {
//                    R = mid - 1;
//                }
//            }
//            sum1 += (ans + 1);
//        }
//        return k > sum1;
//    }
//
//    public static int KthSmallest(int[][] matrix, int k) {
//        int n = matrix.length;
//        int R = matrix[n - 1][n - 1];
//        int L = matrix[0][0];
//        int ans = 0;
//        while (L <= R) {
//            int mid = L + (R - L) / 2;
//            if (guess(matrix, mid, k)) {
//                ans = mid;
//                L = mid + 1;
//            } else {
//                R = mid - 1;
//            }
//        }
//        return ans;
//    }


    //
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int L = matrix[0][0];
        int R = matrix[n - 1][n - 1];
        int ans = 0;
        while (L <= R) {
            int mid = L + (R - L) / 2;
            //k > count, means mid is smaller, go to the  right
            if (guess(matrix, mid, k)) {
                L = mid + 1;
                ans = mid;
            } else {
                R = mid - 1;
            }
        }
        return ans;
    }

    public static boolean guess(int[][] matrix, int g, int k) {
        int n = matrix.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int L = 0;
            int R = n - 1;
            int ans = -1;
            while (L <= R) {
                int mid = L + (R - L) / 2;
                if (matrix[i][mid] < g) {
                    L = mid + 1;
                    ans = mid;
                } else {
                    R = mid - 1;
                }
            }
            count = count + ans + 1;

        }
        return k > count;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int nn = kthSmallest(matrix, 2);
        System.out.println(nn);
    }
}
