package ninechapter9;

import java.util.*;

public class clonegraph133 {
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }

        public Node(int val, List<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        List<Node> nodes = findNodesByBFS(node);
        Map<Node, Node> mapping = copyNodes(nodes);
        copyEdges(nodes, mapping);
        return mapping.get(node);
    }

    private List<Node> findNodesByBFS(Node node) {
        Queue<Node> queue = new ArrayDeque<>();
        Set<Node> visited = new HashSet<>();
        queue.offer(node);
        visited.add(node);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            for (Node neighbour : node.neighbors) {
                if (visited.contains(neighbour)) {
                    continue;
                }
                visited.add(neighbour);
                queue.offer(neighbour);
            }
        }
        return new LinkedList<>(visited);
    }

    private Map<Node, Node> copyNodes(List<Node> nodes) {
        Map<Node, Node> mapping = new HashMap<>();
        for (Node node : nodes) {
            mapping.put(node, new Node(node.val));
        }
        return mapping;
    }

    private void copyEdges(List<Node> nodes, Map<Node, Node> mapping) {
        for (Node node : nodes) {
            Node newNode = mapping.get(node);
            for (Node neighbour : node.neighbors) {
                Node newNeighbor = mapping.get(neighbour);
                newNode.neighbors.add(newNeighbor);
            }
        }
    }

}