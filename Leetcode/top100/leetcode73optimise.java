package top100;

import java.util.Arrays;

public class leetcode73optimise {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean colZero = false;
        boolean rowZero = false;

        for (int i = 0; i < r; i++) {
            if (matrix[i][0] == 0) {
                colZero = true;
                break;
            }
            for (int j = 1; j < c; j++) {

                if (matrix[0][j] == 0) {
                    rowZero = true;
                    break;
                }
                if (matrix[i][j] == 0) {
                    matrix[0][j] = matrix[j][0] = 0;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            if (matrix[i][0] == 0) {
                Arrays.fill(matrix[i], 0);
            }
        }
        for (int j = 0; j < c; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < r; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (colZero) {
            for (int i = 0; i < r; i++) {
                matrix[i][0] = 0;
            }
        }
        if (rowZero) {
            Arrays.fill(matrix[0], 0);
        }
    }
}