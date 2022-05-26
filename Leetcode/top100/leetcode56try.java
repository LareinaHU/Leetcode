//package top100;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//
//public class leetcode56try {
//
//    int[] dirX = {1, 0, 0, -1};
//    int[] dirY = {0, -1, 1, 0};
//
//    public boolean exist(char[][] board, String word) {
//        int m = board.length;
//        int n = board[0].length;
//        boolean[][] isvisited = new boolean[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                isvisited[i][j] = true;
//                if (dfs(board, i, j, word, 0, isvisited)) {
//                    return true;
//                }
//                isvisited[i][j] = false;
//
//
//            }
//        }
//        return false;
//    }
//
//    private boolean dfs(char[][] board, int x, int y, String word, int index, boolean[][] isvisited) {
//
//        char ch = board[x][y];
//        for (int dir = 0; dir < 4; dir++) {
//            int xNew = x + dirX[dir];
//            int yNew = y + dirY[dir];
//        }
//        dfs(board,xNew,yNew)
//    }
//}