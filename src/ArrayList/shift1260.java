package ArrayList;

import java.util.*;

public class shift1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        int start = total - k % total;
        for (int i = start; i < total + start; i++) {
            int moveIndex = i % total;
            int moveRow = moveIndex / n;
            int moveColumn = moveIndex % n;
            if ((i - start) % n == 0) {
                result.add(new ArrayList<>());
            }
            result.peekLast().add(grid[moveRow][moveColumn]);
        }
        return result;
    }
}
