package ninechapter9;

import java.util.*;

public class leetcode133 {
    class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;

        UndirectedGraphNode(int x) {
            label = x;
            neighbors = new ArrayList<UndirectedGraphNode>();
        }

    }

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        // write your code here
        //find
        List<UndirectedGraphNode> list = findNodes(node);
        Map<UndirectedGraphNode, UndirectedGraphNode> mapping = new HashMap<>();
        mapping = copyNodes(list);
        //copy node
        getEdges(list, mapping);
        //copy edge
        return mapping.get(node);
    }

    public List<UndirectedGraphNode> findNodes(UndirectedGraphNode node) {
        Queue<UndirectedGraphNode> queue = new ArrayDeque<>();
        Set<UndirectedGraphNode> visited = new HashSet<>();
        queue.add(node);
        visited.add(node);
        while (!queue.isEmpty()) {
            UndirectedGraphNode curNode = queue.poll();
            for (UndirectedGraphNode neighbor : curNode.neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                } else {
                    continue;
                }
            }
        }
        return new LinkedList<>(visited);
    }

    public Map<UndirectedGraphNode, UndirectedGraphNode> copyNodes(List<UndirectedGraphNode> nodes) {
        Map<UndirectedGraphNode, UndirectedGraphNode> mapping = new HashMap<>();
        for (UndirectedGraphNode node : nodes) {
            if (!mapping.containsKey(node)) {
                mapping.put(node, new UndirectedGraphNode(node.label));
            }
        }
        return mapping;
    }

    public void getEdges(List<UndirectedGraphNode> nodes, Map<UndirectedGraphNode,
            UndirectedGraphNode> mapping) {
        for(UndirectedGraphNode node: nodes){
            UndirectedGraphNode newNode = mapping.get(node);
            for(UndirectedGraphNode neighbor: node.neighbors){
                UndirectedGraphNode newNeighbor = mapping.get(neighbor);
                newNode.neighbors.add(newNeighbor);
            }

        }

    }
}
