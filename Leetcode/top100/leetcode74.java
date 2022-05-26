package top100;

/*
2D -> 1D: (x,y)-> x * column + y
1D -> 2D: k -> k / column, k % column

 */
public class leetcode74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int left = 0;
        int right = row * column - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;

            if (matrix[mid / column][mid % column] == target) {
                return true;
            } else if (matrix[mid / column][mid % column] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (matrix[left / column][left % column] == target) {
            return true;
        } else if (matrix[right / column][right % column] == target) {
            return true;
        } else {
            return false;
        }
    }
}
