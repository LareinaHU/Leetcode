package Graph;

import java.lang.reflect.Array;
import java.util.*;

public class leetcode133clonegraph {
    class Node {
        List<Node> neighbors;
        int val;

        Node() {
            val = 0;

        }

        Node(int val) {
            this.val = val;
            this.neighbors = new ArrayList<>();
        }

        Node(int val, ArrayList<Node> neighbors) {
            this.val = val;
            this.neighbors = new ArrayList<>();
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        //find all of the nodes
        List nodes = findNodes(node);
        //copy all of the nodes
        Map<Node, Node> mapping = copyNodes(nodes);
        //copy the edges
        copyEdges(nodes, mapping);
        return mapping.get(node);
    }

    private List<Node> findNodes(Node node) {
        Set<Node> nodes = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            nodes.add(curr);
            for (Node neighbor : curr.neighbors) {
                if (nodes.contains(neighbor)) {
                    continue;
                }
                nodes.add(neighbor);
                queue.offer(neighbor);
            }
        }
        return new ArrayList<>(nodes);
    }

    private Map<Node, Node> copyNodes(List<Node> findNodes) {
        Map<Node, Node> map = new HashMap<>();
        for (Node nodes : findNodes) {
            map.put(nodes, new Node(nodes.val));
        }
        return map;
    }

    private void copyEdges(List<Node> findNodes, Map<Node, Node> mapping) {
        for (Node node : findNodes) {
            Node newNode = mapping.get(node);
            for (Node neighbor : node.neighbors) {
                Node newNeighbor = mapping.get(neighbor);
                newNode.neighbors.add(newNeighbor);
            }
        }

    }
}
