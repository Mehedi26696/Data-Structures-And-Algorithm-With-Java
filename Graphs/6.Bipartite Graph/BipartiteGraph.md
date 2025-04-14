
# Bipartite Graph

A **Bipartite Graph** is a type of graph where the set of vertices can be divided into two disjoint sets such that no two vertices within the same set are adjacent. In other words, all edges connect a vertex from one set to a vertex in the other set.

## Properties of Bipartite Graphs
1. A graph is bipartite if it is 2-colorable.
2. A graph is bipartite if it does not contain any odd-length cycles.
3. It can be represented as \( G = (U, V, E) \), where:
    - \( U \) and \( V \) are two disjoint sets of vertices.
    - \( E \) is the set of edges connecting vertices from \( U \) to \( V \).

## Applications of Bipartite Graphs
- Matching problems (e.g., job assignments, stable marriages).
- Network flow problems.
- Social network analysis.

---

## Algorithm to Check if a Graph is Bipartite
A common approach is to use **Breadth-First Search (BFS)** or **Depth-First Search (DFS)** to check if the graph can be colored using two colors.

### Steps:
1. Assign one color to the starting vertex.
2. Assign the opposite color to all its adjacent vertices.
3. Repeat the process for all vertices using BFS/DFS.
4. If a conflict arises (i.e., two adjacent vertices have the same color), the graph is not bipartite.

---

## Java Implementation

Below is a Java program to check if a graph is bipartite using BFS:

```java
import java.util.*;

public class BipartiteGraph {
     public static boolean isBipartite(int[][] graph) {
          int n = graph.length;
          int[] colors = new int[n]; // 0: uncolored, 1: color1, -1: color2

          for (int i = 0; i < n; i++) {
                if (colors[i] == 0) { // Not yet visited
                     Queue<Integer> queue = new LinkedList<>();
                     queue.add(i);
                     colors[i] = 1; // Assign first color

                     while (!queue.isEmpty()) {
                          int node = queue.poll();
                          for (int neighbor : graph[node]) {
                                if (colors[neighbor] == 0) {
                                     colors[neighbor] = -colors[node]; // Assign opposite color
                                     queue.add(neighbor);
                                } else if (colors[neighbor] == colors[node]) {
                                     return false; // Conflict detected
                                }
                          }
                     }
                }
          }
          return true;
     }

     public static void main(String[] args) {
          int[][] graph = {
                {1, 3},
                {0, 2},
                {1, 3},
                {0, 2}
          };

          if (isBipartite(graph)) {
                System.out.println("The graph is Bipartite.");
          } else {
                System.out.println("The graph is NOT Bipartite.");
          }
     }
}
```

### Explanation of the Code
1. **Graph Representation**: The graph is represented as an adjacency list using a 2D array.
2. **Color Array**: Keeps track of the color assigned to each vertex.
3. **BFS Traversal**: Ensures all connected components are checked for bipartite properties.
4. **Conflict Check**: If two adjacent vertices have the same color, the graph is not bipartite.

---

## Example Input and Output

### Input:
Graph represented as:
```
0 -- 1
|    |
3 -- 2
```
Adjacency List:
```java
int[][] graph = {
     {1, 3},
     {0, 2},
     {1, 3},
     {0, 2}
};
```

### Output:
```
The graph is Bipartite.
```

---

## Key Takeaways
- Bipartite graphs are useful in solving many real-world problems.
- BFS or DFS can efficiently determine if a graph is bipartite.
- Always check for disconnected components in the graph.
