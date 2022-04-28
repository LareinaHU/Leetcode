package Graph;

import java.util.*;

public class leetcode210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new HashSet<>());
        }
        int[] degree = new int[numCourses];
        for (int[] pre : prerequisites) {
            map.get(pre[1]).add(pre[0]);
            degree[pre[0]]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (degree[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                ans.add(curr);
                for (int neighbor : map.get(curr)) {

                    degree[neighbor]--;
                    if (degree[neighbor] == 0) {
                        queue.add(neighbor);
                    }
                }
            }
        }
        int[] answer = new int[numCourses];
        for(int i = 0; i < ans.size(); i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}
