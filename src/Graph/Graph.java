package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Graph {
    // 存储顶点集合 存储图对应的邻接矩阵 表示边的数目
    private ArrayList<String> VertexList;
    private int[][] edges;
    private int numOfedges;
    private boolean isVisted[];

    public Graph(int n) {
        edges = new int[n][n];
        VertexList = new ArrayList<>(n);
        numOfedges = 0;

    }

    //get the first adjacent vertex subscript
    public int getFirstNeighbor(int index) {
        for (int j = 0; j < VertexList.size(); j++) {
            if (edges[index][j] > 0) {
                return j;
            }
        }
        return -1;
    }

    public int getNextNeighbor(int v1, int v2) {
        for (int j = v2 + 1; j < VertexList.size(); j++) {
            if (edges[v1][j] > 0) {
                return j;
            }
        }
        return -1;
    }

    public void dfs(boolean[] isVisted, int i) {

        // first, start from A - 0,and print this vertex
        System.out.print(getValueByIndex(i) + "->");
        //set i as visited
        isVisted[i] = true;
        //search the first neighbour of i
        int w = getFirstNeighbor(i);
        while (w != -1) {
            if (!isVisted[w]) {
                dfs(isVisted, w);
            }
            // if w is visited, we need go to the next neighbor
            else {
                w = getNextNeighbor(i, w);
            }
        }
    }

    // overload dsf,iterate all the vertex.
    public void dfs() {
        isVisted = new boolean[5];
        for (int i = 0; i < getNumOfVertex(); i++) {
            if (!isVisted[i]) {
                dfs(isVisted, i);
            }
        }
    }

    //dfs method
    private void bfs(boolean[] isVisited, int i) {

        int u;//the head of the queue corresponding subscript
        int w; //the adjacent w
        // queue, record the order
        LinkedList queue = new LinkedList();
        // visit the node, and print the information
        System.out.print(getValueByIndex(i) + "->");
        //mark it as visited
        isVisited[i] = true;
        //add the node into the queue
        queue.addLast(i);
        while (!queue.isEmpty()) {
            //remove the head's subscript of the queue
            u = (Integer) queue.removeFirst();
            //get the first neighbor subscript
            w = getFirstNeighbor(u);
            while (w != -1) {   //找到
                // whether is visited or not
                if (!isVisited[w]) {
                    System.out.print(getValueByIndex(w) + "->");
                    //mark as visited
                    isVisited[w] = true;
                    queue.addLast(w);
                }
                // let u as the precursor，search the next node of w
                w = getNextNeighbor(u, w); // the sign of the bfs
            }
        }

    }

    //traverse all the nodes for BFS
    private void bfs() {
        isVisted = new boolean[5];
        for (int i = 0; i < getNumOfVertex(); i++) {
            if (!isVisted[i]) {
                bfs(isVisted, i);
            }
        }
    }

    public void insertVertex(String vertex) {
        VertexList.add(vertex);
    }

    public void insertEdge(int v1, int v2, int weight) {
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfedges++;
    }

    public int getNumOfVertex() {
        return VertexList.size();
    }

    public int getNumOfedges() {
        return numOfedges;
    }

    //return i corresponding data
    public String getValueByIndex(int i) {
        return VertexList.get(i);
    }

    //return the weight between v1 and v2
    public int getWeight(int v1, int v2) {
        return edges[v1][v2];
    }

    //print the matrix
    public void showGraph() {
        for (int[] link : edges) {
            System.out.println(Arrays.toString(link));
        }
    }

    public static void main(String[] args) {
        Graph gg = new Graph(5);
        gg.VertexList.add("A");
        gg.VertexList.add("B");
        gg.VertexList.add("C");
        gg.VertexList.add("D");
        gg.VertexList.add("E");
        gg.insertEdge(0, 1, 1);
        gg.insertEdge(0, 2, 1);
        gg.insertEdge(1, 2, 1);
        gg.insertEdge(1, 3, 1);
        gg.insertEdge(1, 4, 1);


        gg.showGraph();

        gg.dfs();
        System.out.println();
        gg.bfs();
    }
}
