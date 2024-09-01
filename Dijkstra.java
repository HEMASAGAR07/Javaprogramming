package DSA_LAB;

import java.util.*;

public class Dijkstra {
    private int vertices;
    private List<List<Node>> adjacencyList;

    public Dijkstra(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            this.adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        this.adjacencyList.get(source).add(new Node(destination, weight));
        this.adjacencyList.get(destination).add(new Node(source, weight));
    }

    public void dijkstra(int source) {
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        priorityQueue.add(new Node(source, 0));
        distance[source] = 0;

        while (!priorityQueue.isEmpty()) {
            int currentVertex = priorityQueue.poll().vertex;

            for (Node neighbor : adjacencyList.get(currentVertex)) {
                int newDistance = distance[currentVertex] + neighbor.weight;

                if (newDistance < distance[neighbor.vertex]) {
                    distance[neighbor.vertex] = newDistance;
                    priorityQueue.add(new Node(neighbor.vertex, newDistance));
                }
            }
        }

        // Print the shortest distances from the source to all vertices
        System.out.println("Shortest distances from vertex " + source + " to all other vertices:");
        for (int i = 0; i < vertices; i++) {
            System.out.println("Vertex " + i + ": " + distance[i]);
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        Dijkstra graph = new Dijkstra(vertices);

        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 7);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 5, 1);
        graph.addEdge(4, 3, 2);
        graph.addEdge(4, 5, 5);

        int sourceVertex = 0;
        graph.dijkstra(sourceVertex);
    }

    static class Node {
        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
}
