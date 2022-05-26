package top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lintcode398 {
    public int[] deltaX = {0, 0, 1, -1};
    public int[] deltaY = {1, -1, 0, 0};

    public int longestContinuousIncreasingSubsequence2(int[][] matrix) {
        // write your code here
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
//        for (int[] i : dp) {
//            for (int j = 0; j < i.length; j++) {
//                i[j] = 1;
//            }
//        }

        List<List<Integer>> Matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Matrix.add(Arrays.asList(i, j, matrix[i][j]));
            }
        }
        Matrix.sort(Comparator.comparingInt(p -> p.get(2)));
        for (int i = 0; i < Matrix.size(); i++) {
            int x = Matrix.get(i).get(0);
            int y = Matrix.get(i).get(1);
            dp[x][y] = 1;

            for (int dir = 0; dir < 4; dir++) {
                int prex = x - deltaX[dir];
                int prey = y - deltaY[dir];
                if (prex <= 0 ||  prex >= m || prey <= 0 || prey >= n) {
                    continue;
                }
                if (matrix[prex][prey] < matrix[x][y]) {
                    dp[x][y] = Math.max(dp[prex][prey] + 1, dp[x][y]);
                }
            }
        }

        int max = 0;
        for (int[] i : dp) {
            for (int j = 0; j < i.length; j++) {
               max= Math.max(max, i[j]);
            }
        }

        return max;

    }
}



//
//                if (prevX < 0 || prevX >= n || prevY < 0 || prevY >= m) {
//                    continue;
//                }
//                if (matrix[prevX][prevY] >= matrix[x][y]) {
//                    continue;
//                }
//
//                dp[x][y] = Math.max(dp[x][y], dp[prevX][prevY] + 1);
//            }
//        }
//
//        int longest = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                longest = Math.max(longest, dp[i][j]);
//            }
//        }
//        return longest;
//    }
//}