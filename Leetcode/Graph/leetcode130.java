package Graph;

import java.util.*;

public class leetcode130 {

    public List<Integer> findMHT(int n, int[][] edges) {
        List<Integer> ans = new ArrayList<>();
        if (n == 1) {
            ans.add(0);
            return ans;
        }

        //graph
        List<Set<Integer>> graph = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        //calculate
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (graph.get(i).size() == 1) queue.add(i);
        }
        while (!queue.isEmpty()) {
            ans = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                ans.add(cur);
                for (int neighbor : graph.get(cur)) {
                    graph.get(neighbor).remove(cur);
                    if (graph.get(neighbor).size() == 1) {
                        queue.add(neighbor);
                    }
                }
            }
        }
        return ans;
    }
}