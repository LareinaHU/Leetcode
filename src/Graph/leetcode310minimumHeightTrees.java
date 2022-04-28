package Graph;

import java.util.*;

public class leetcode310minimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] nums) {
        if(n == 1){
            return Arrays.asList(0);
        }
        Map<Integer,List<Integer>> graph = new HashMap<>();
        Map<Integer,Integer> indegree = new HashMap<>();

        for(int[] num : nums){
            int n1 = num[0];
            int n2 = num[1];
            graph.putIfAbsent(n1, new ArrayList<>());
            graph.putIfAbsent(n2, new ArrayList<>());

            graph.get(n1).add(n2);
            graph.get(n2).add(n1);
            indegree.put(n1,indegree.getOrDefault(n1, 0) + 1);
            indegree.put(n2,indegree.getOrDefault(n2, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(indegree.get(i) == 1){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            res = new ArrayList<>();
            int size = queue.size();
            for(int j = 0; j < size; j++){
                int cur = queue.poll();
                res.add(cur);
                for(int next : graph.get(cur)){
                    indegree.put(next, indegree.get(next) - 1);
                    if(indegree.get(next) == 1){
                        queue.offer(next);
                    }
                }
            }
        }

        return res;
    }
}

//    int count = n;
//        while (count > 2) {
//                int size = leaves.size();
//                count -= size;
//                List<Integer> newLeaves = new ArrayList<>();
//        for (int i = 0; i < size; i++) {
//        int leaf = leaves.get(i);
//        for (int j = 0; j < lists[leaf].size(); j++) {
//        int toRemove = lists[leaf].get(j);
//        lists[toRemove].remove(Integer.valueOf(leaf));
//        if (lists[toRemove].size() == 1)
//        newLeaves.add(toRemove);
//        }
//        }
//        leaves = newLeaves;
//        }
//        return leaves;
//        }
//        }