public class main {
  
    public static void main(String srgs[]){
       // Dijkstra d = new Dijkstra();


    System.out.println("Dijkstra: ");

    int V = 5;
    int source = 0;

    // Adjacency list representation of the
    // connected edges by declaring List class object
    // Declaring object of type List<Node>
    List<List<Edge> > adj
        = new ArrayList<List<Edge> >();

    // Initialize list for every node
    for (int i = 0; i < V; i++) {
        List<Edge> item = new ArrayList<Edge>();
        adj.add(item);
    }

    // Inputs for the GFG(dpq) graph
    adj.get(0).add(new Edge(1, 9 ));
    adj.get(0).add(new Edge(2, 6));
    adj.get(0).add(new Edge(3, 5));
    adj.get(0).add(new Edge(4, 3));

    adj.get(2).add(new Edge(1, 2));
    adj.get(2).add(new Edge(3, 4));

    // Calculating the single source shortest path
    Dijkstra dpq = new Dijkstra(V);
    dpq.dijkstra(adj, source);

    // Printing the shortest path to all the nodes
    // from the source node
    System.out.println("The shorted path from node :");

    for (int i = 0; i < dpq.dist.length; i++)
        System.out.println(source + " to " + i + " is "
                           + dpq.dist[i]);
}




    
}
