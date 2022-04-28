//package ninechapter9;
//
//import org.omg.PortableInterceptor.DISCARDING;
//
//import java.util.*;
//
//public class trylint127 {
//    class DirectedGraphNode {
//        int label;
//        List<DirectedGraphNode> neighbors;
//
//        DirectedGraphNode(int x) {
//            label = x;
//            neighbors = new ArrayList<DirectedGraphNode>();
//        }
//    }
//
//    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
//        // write your code here
//        ArrayList<DirectedGraphNode> order = new ArrayList<>();
//        Map<DirectedGraphNode, Integer> indegree = new HashMap<>();
//        for (DirectedGraphNode node : graph) {
//            for (DirectedGraphNode neighbor : node.neighbors) {
//                if (!indegree.containsKey(neighbor)) {
//                    indegree.put(neighbor, indegree.get(neighbor) + 1);
//                } else {
//                    indegree.put(neighbor, 1);
//                }
//            }
//        }
//        Queue<DirectedGraphNode> queue = new ArrayDeque<>();
//        for (DirectedGraphNode node : graph) {
//            if (!indegree.containsKey(node)) {
//                queue.offer(node);
//                order.add(node);
//            }
//        }
//        while (!queue.isEmpty()) {
//            DirectedGraphNode node = queue.poll();
//            for (DirectedGraphNode neighbor : node.neighbors) {
//                indegree.put(neighbor, indegree.get(neighbor) - 1);
//                if (indegree.get(neighbor) == 0) {
//                    order.add(neighbor);
//                    queue.offer(neighbor);
//                }
//            }
//        }
//        return order;
//    }
//}
