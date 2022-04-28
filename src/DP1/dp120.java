package DP1;

import java.util.ArrayList;
import java.util.List;

public class dp120 {
    public int minimumTotal(List<List<Integer>> triangle) {

        int m = triangle.size();
        for (int i = m - 2; i >= 0; i++) {

        List<Integer> curr = new ArrayList<>();
            for (int j = 0; j < triangle.get(i).size(); j++) {
                curr.set(j, triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }}