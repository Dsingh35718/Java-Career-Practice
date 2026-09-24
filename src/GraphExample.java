import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphExample {

    // Add an edge between two vertices
    public static void addEdge(ArrayList<ArrayList<Integer>> graph,
                               int source, int destination) {

        // Undirected graph
        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    // Display the graph
    public static void displayGraph(ArrayList<ArrayList<Integer>> graph) {

        for (int i = 0; i < graph.size(); i++) {

            System.out.print(i + " -> ");

            for (int neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }

    // Breadth-First Search (BFS)
    public static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {

        boolean[] visited = new boolean[graph.size()];

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {

            int current = queue.remove();

            System.out.print(current + " ");

            for (int neighbor : graph.get(current)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Depth-First Search (DFS)
    public static void dfs(ArrayList<ArrayList<Integer>> graph,
                           int current,
                           boolean[] visited) {

        // Mark current vertex as visited
        visited[current] = true;

        System.out.print(current + " ");

        // Visit each unvisited neighbor
        for (int neighbor : graph.get(current)) {

            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 4;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 3);

        // Display graph
        System.out.println("Graph Adjacency List:");
        displayGraph(graph);

        // BFS
        System.out.println("\nBFS Traversal starting from vertex 0:");
        bfs(graph, 0);

        // DFS
        System.out.println("\n\nDFS Traversal starting from vertex 0:");

        boolean[] visited = new boolean[graph.size()];

        dfs(graph, 0, visited);
    }
}