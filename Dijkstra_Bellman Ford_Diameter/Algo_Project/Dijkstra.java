
import java.util.*;
public class Dijkstra{


 
    // Member variables of this class
    private int dist[];
    private Set<Integer> settled;
    private PriorityQueue<Edge> pq;
    // Number of vertices
    private int V;
    List<List<Edge> > adj;
 
    // Constructor of this class
    public Dijkstra(int V)
    {
 
        // This keyword refers to current object itself
        this.V = V;
        dist = new int[V];
        settled = new HashSet<Integer>();
        pq = new PriorityQueue<Edge>(V, new Edge());
    }
 
    // Method 1
    // Dijkstra's Algorithm
    public void dijkstra(List<List<Edge> > adj, int src)
    {
        this.adj = adj;
 
        for (int i = 0; i < V; i++)
            dist[i] = Integer.MAX_VALUE;
 
        // Add source node to the priority queue
        pq.add(new Edge(src, 0));
 
        // Distance to the source is 0
        dist[src] = 0;
 
        while (settled.size() != V) {
 
            // Terminating condition check when
            // the priority queue is empty, return
            if (pq.isEmpty())
                return;
 
            // Removing the minimum distance node
            // from the priority queue
            int u = pq.remove().source;
 
            // Adding the node whose distance is
            // finalized
            if (settled.contains(u))
 
                // Continue keyword skips execution for
                // following check
                continue;
 
            // We don't have to call e_Neighbors(u)
            // if u is already present in the settled set.
            settled.add(u);
 
            e_Neighbours(u);
        }
    }
 
    // Method 2
    // To process all the neighbours
    // of the passed node
    private void e_Neighbours(int u)
    {
 
        int edgeDistance = -1;
        int newDistance = -1;
 
        // All the neighbors of v
        for (int i = 0; i < adj.get(u).size(); i++) {
            Edge v = adj.get(u).get(i);
 
            // If current node hasn't already been processed
            if (!settled.contains(v.source)) {
                edgeDistance = v.weight;
                newDistance = dist[u] + edgeDistance;
 
                // If new distance is cheaper in cost
                if (newDistance < dist[v.source])
                    dist[v.weight] = newDistance;
 
                // Add the current node to the queue
                pq.add(new Edge(v.source, dist[v.source]));
            }
        }

 
       
 
// Class 2
// Helper class implementing Comparator interface
// Representing a node in the graph
class Edge implements Comparator<Edge> {
 
    // Member variables of this class
    public int source;
    public int weight;
   
 
    // Constructors of this class
 
    // Constructor 1
    public Edge() {}
 
    // Constructor 2
    public Edge(int source, int weight)
    {
 
        // This keyword refers to current instance itself
        this.source = source;
        this.weight = weight;
    
    }
 
    // Method 1
    @Override public int compare(Edge node1, Edge node2)
    {
 
        if (node1.weight < node2.weight)
            return -1;
 
        if (node1.weight > node2.weight)
            return 1;
 
        return 0;
    }
}
    }
}
