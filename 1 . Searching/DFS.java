import java.util.*;

class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency list

    // Constructor
    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    // Function to add an edge to the graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Recursive DFS function starting from vertex v
    private void DFSUtil(int v, boolean[] visited) {
        // Mark the current vertex as visited
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the adjacent vertices
        for (Integer neighbor : adj[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // DFS traversal starting from vertex v
    public void DFS(int v) {
        // Mark all vertices as not visited
        boolean[] visited = new boolean[V];

        // Call the recursive helper function to perform DFS
        DFSUtil(v, visited);
    }
}

public class DFS {
    public static void main(String[] args) {
        Graph g = new Graph(7);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);

        System.out.println("Depth-First Traversal (starting from vertex 0): ");
        g.DFS(0);
    }
} 
/*This Java program defines a graph data structure and performs a Depth-First Search (DFS) traversal on the graph starting from a specified vertex. Here's a concise description of its key components and functionality:

Graph class:

Represents a graph with a given number of vertices (V).
Uses an adjacency list to store edges between vertices.
The constructor initializes the graph by creating an adjacency list for each vertex.
The addEdge method adds an edge between two vertices by updating the adjacency list.
DFSUtil method:

A private recursive helper function for DFS traversal.
Marks the current vertex as visited, prints it, and recursively explores its unvisited neighbors.
Prevents revisiting already visited vertices to avoid infinite loops.
DFS method:

Initiates DFS traversal from a specified vertex.
Marks all vertices as not visited, creates a boolean array visited for tracking visited vertices, and calls DFSUtil to start the traversal.
main method:

In the main method, an instance of the Graph class is created with 7 vertices.
Edges are added to the graph to create a specific structure.
DFS traversal is initiated from vertex 0, and the result is printed to the console.
In this example, the DFS traversal starting from vertex 0 would print the vertices in a depth-first order, typically starting with the current vertex and exploring as deeply as possible before backtracking. The output depends on the specific structure of the graph. This program demonstrates the basic DFS algorithm for exploring and traversing graphs in a depth-first manner.*/





Regenerate

