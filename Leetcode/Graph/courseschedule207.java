package Graph;

import java.util.*;

public class courseschedule207 {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new HashSet<>());
        }
        int[] indegree = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            map.get(prerequisite[1]).add(prerequisite[0]);
            indegree[prerequisite[0]]++;
        }


        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        int numChoose = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                numChoose++;
                for (int next : map.get(curr)) {
                    map.get(next).remove(curr);
                    indegree[next]--;
                    if (indegree[next] == 0) {
                        queue.add(next);
                    }
                }
            }
        }
        return numChoose == numCourses ? true : false;
    }

    public static void main(String[] args) {
        int num = 4;
        int[][] pre = {{1, 0}, {2, 1}, {3, 1}, {3, 2}};
        boolean k = canFinish(num, pre);
        System.out.println(k);
    }
}
