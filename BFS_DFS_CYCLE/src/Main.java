import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.*;


public class Main{



public static void main(String[] args) {
        int count = 0;
        DatasetRead read = new DatasetRead();
        LinkedList<Integer> temp = new LinkedList<>();
        LinkedList<Integer> temp2 = new LinkedList<>();
        List<Edge> edges = read.readData("C:\\Users\\OGDCL\\OneDrive\\Desktop\\Algo Project\\soc-sign-bitcoinalpha.csv");
        for (Edge e : edges) {
            System.out.println(e);
            temp.add(e.source);
            temp2.add(e.destination);
            count++;
        }
        System.out.println(count);
        Collections.sort(temp);
        Collections.sort(temp2);
        int var1 = temp.stream().max(Integer::compare).get();
        int var2 = temp.stream().max(Integer::compare).get();
        int vertices = 0;

        if (var1>var2)
            vertices = var1;
        else
            vertices = var2;

        Graph graph = new Graph(vertices+1);

        for (Edge E:edges) 
            graph.addEgde(E.source, E.destination, E.weight, E.time);
        	
        bfs B_F_S = new bfs(vertices+1);
        for (Edge E:edges)
        {
        	B_F_S.addEdge(E.source,E.destination);
        }
        System.out.println("Breadth First Search of Graph:");
        B_F_S.BFS(vertices);
        
        System.out.print("\n");
        
        dfs D_F_S = new dfs(vertices+1);
        for (Edge E:edges)
        {
        	D_F_S.addEdge(E.source,E.destination);
        }
        System.out.println("Depth First Search of Graph:");
        D_F_S.DFS(vertices);
        
        System.out.print("\n");
        
        cycle detection=new cycle(vertices+1);
        for(Edge E:edges){

            detection.addEdge(E.source, E.destination);

        }
        System.out.println("Cylcles in Graph:"+detection.isCyclic());
        
        System.out.print("\n");
        
       
     // graph.printGraph();
    }
    
}
// graph.printGraph();}
