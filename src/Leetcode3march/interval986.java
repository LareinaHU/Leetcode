package Leetcode3march;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class interval986 {
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> res = new ArrayList<>();
        int i = 0, j = 0;

        while (i < firstList.length && j < secondList.length) {
            int s1 = firstList[i][0];
            int s2 = firstList[i][1];
            int e1 = secondList[j][0];
            int e2 = secondList[j][1];
            if (e2 < s1) j++;
            else if (s2 < e1) i++;    // 不要忘记else if， 因为一旦ij值改变，就得退出当前循环，继续下一循环
            else {
                int[] xx = new int[2];
                xx[0] = Math.max(s1, e1);
                xx[1] = Math.min(s2, e2);
                res.add(xx);
                if (e2 < s2) {
                    j++;
                } else if (s2 <= e2) {
                    i++;
                }
            }
        }
        int n = res.size();
        int[][] ans = res.toArray(new int[n][2]);
        return ans;
    }

    public static void main(String[] args) {
        int[][] a = {{10, 12}, {18, 19}};
        int[][] b = {{1, 6}, {8, 11}, {13, 17}, {19, 20}};

        int[][] cc = intervalIntersection(a, b);
        for (int[] link : cc) {
            System.out.println(Arrays.toString(link));
        }
    }
}
//
//
//    public static int[][] intervalIntersection(int[][] A, int[][] B) {
//        int len1 = A.length;
//        int len2 = B.length;
//        List<int[]> list = new ArrayList<>();
//
//        int i = 0;
//        int j = 0;
//        while (i < len1 && j < len2) {
//            int s1 = A[i][0];
//            int e1 = A[i][1];
//            int s2 = B[j][0];
//            int e2 = B[j][1];
//
//            if (s2 > e1) i++;
//            else if (e2 < s1) j++;
//            else {               //intersect
//                int[] a = new int[2];
//                a[0] = Math.max(s1, s2);
//                a[1] = Math.min(e1, e2);
//                list.add(a);
//                if (e1 > e2) j++;
//                if (e2 >= e1) i++;
//            }
//        }
//        int n = list.size();
//        int[][] ans = list.toArray(new int[n][2]);
//        return ans;
//    }
//}
