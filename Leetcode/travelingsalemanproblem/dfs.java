package travelingsalemanproblem;

import java.util.HashSet;
import java.util.Set;
class Result {
    int minCost;
    public Result(){
        this.minCost = 1000000;
    }
}

public class dfs {
    public int minCost(int n, int[][] roads) {
        int[][] graph = constructGraph(roads, n);
        Set<Integer> visited = new HashSet<Integer>();
        Result result = new Result();
        visited.add(1);

        dfs(1, n, visited, 0, graph, result);

        return result.minCost;
    }

    void dfs(int city,
             int n,
             Set<Integer> visited,
             int cost,
             int[][] graph,
             Result result) {

        if (visited.size() == n) {
            result.minCost = Math.min(result.minCost, cost);
            return;
        }

        for (int i = 1; i < graph[city].length; i++) {
            if (visited.contains(i)) {
                continue;
            }
            visited.add(i);
            dfs(i, n, visited, cost + graph[city][i], graph, result);
            visited.remove(i);
        }
    }

    int[][] constructGraph(int[][] roads, int n) {
        int[][] graph = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                graph[i][j] = 100000;
            }
        }
        int roadsLength = roads.length;
        for (int i = 0; i < roadsLength; i++) {
            int a = roads[i][0], b = roads[i][1], c = roads[i][2];
            graph[a][b] = Math.min(graph[a][b], c);
            graph[b][a] = Math.min(graph[b][a], c);
        }

        return graph;
    }


}
