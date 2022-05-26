package top100;

import java.util.List;

public class leetcode79 {
    // write your code here
    public static int[] deltaX = {1, -1, 0, 0};
    public static int[] deltaY = {0, 0, 1, -1};

    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = true;
                if(helper(board, word, 0, i, j, visited)){
                    return true;
                }
                  visited[i][j] = false;
            }
        }
       return false;
    }

    public static boolean helper(char[][] board, String word, int index, int x, int y, boolean[][] visited) {
        if (index == word.length() - 1) {
            return true;
        }
        if (board[x][y] != word.charAt(index)) {
            return false;
        }

        for (int dir = 0; dir < 4; dir++) {
            int newX = x + deltaX[dir];
            int newY = y + deltaY[dir];

            if (newX < 0 || newY < 0 || newX > board.length - 1 || newY > board[0].length - 1 || visited[newX][newY]) {
                continue;
            }
            visited[newX][newY] = true;
            if (helper(board, word, index + 1, newX, newY, visited)) {
                return true;
            }
            visited[newX][newY] = false;
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'a','a'}};
        boolean k = exist(board,"aaa");
        System.out.println(k);
    }
}
