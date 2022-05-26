package top100;

public class leetcode48 {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return;
        }
        int column = matrix[0].length;
        int row = matrix.length;
        int top = 0;
        int down = row - 1;
        while (top > down) {
            int[] temp = new int[column];
            temp = matrix[top];
            matrix[top] = matrix[down];
            matrix[down] = matrix[top];
            top++;
            down--;
        }


        for(int i = 0; i < row; i++){
            for(int j = i+1; j < column; j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return;
    }

}
