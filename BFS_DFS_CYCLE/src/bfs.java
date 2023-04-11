import java.io.*;
import java.util.*;

public class bfs {

	private int V; 
    private LinkedList<Integer> adj[]; 
 
    // Constructor
    bfs(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
 
    void BFS(int s)
    {
       
        boolean visited[] = new boolean[V];
 
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        visited[s]=true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            
            s = queue.poll();
            System.out.print(s+" -> ");
 
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
}
    
    
    
}
