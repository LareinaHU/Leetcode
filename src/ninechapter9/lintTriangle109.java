package ninechapter9;

import java.util.ArrayList;
import java.util.List;

public class lintTriangle109 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        for (int i = m - 2; i >= 0; i--) {
            List<Integer> curr = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                int left = triangle.get(i + 1).get(j);
                int right = triangle.get(i + 1).get(j + 1);
                curr.set(j, curr.get(j) + Math.min(left, right));
            }
        }
        return triangle.get(0).get(0);
    }
}
