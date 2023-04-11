import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {

        int vertices;
        LinkedList<Edge> [] adjacencylist;
       
        Graph(int vertices) {
        this.vertices = vertices;
        adjacencylist = new LinkedList[vertices];
       // initialize adjacency lists for all the vertices
        for (int i = 0; i <vertices ; i++) {
        adjacencylist[i] = new LinkedList<>();
        }
        }
        
        public void addEgde(int source, int destination, int weight, long time) {   //adding edge to the graph
        Edge edge = new Edge(source, destination, weight, time);
        adjacencylist[source].addFirst(edge);  //for directed graph

        
        
        }
        
   public void printGraph(){  ///printing graph function
        for (int i = 0; i <vertices ; i++) {
        LinkedList<Edge> list = adjacencylist[i];
        for (int j = 0; j <list.size() ; j++) {
        System.out.println("vertex-" + i + " is connected to " +
        list.get(j).destination + " with weight " + list.get(j).weight +
         "and time" +list.get(j).time);
        }
        }
        }
        
    
}