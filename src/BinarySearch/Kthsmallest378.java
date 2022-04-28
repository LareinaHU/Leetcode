package BinarySearch;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Kthsmallest378 {
    public static int kthSmallest(int[][] matrix, int k) {
//brute force
        //matrix[0] for matrix, this means all of the first row numbers.
        int row = matrix.length;
        int column = matrix[0].length;

        int[] aa = new int[row * column];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                aa[i * matrix[0].length + j] = matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(aa));
        PriorityQueue<Integer> PP = new PriorityQueue<>();
        for (int i : aa) {
            PP.offer(i);
        }
        for (int i = 1; i < k; i++) {
            PP.poll();
        }
        return PP.peek();
    }

    public static void main(String[] args) {
        int[][] matrix = {{345, 654, 67, 0, 6}, {435, 5768, 676, 7, 4}};
        int kk = kthSmallest(matrix, 3);
        System.out.println(kk);
    }
}
