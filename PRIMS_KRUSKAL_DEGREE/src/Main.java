
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
        int count = 0;
        DatasetRead read = new DatasetRead();
        LinkedList<Integer> temp = new LinkedList<>();
        LinkedList<Integer> temp2 = new LinkedList<>();
        List<Edge> edges = read.readData("C:\\Users\\DELL\\Downloads\\soc-sign-bitcoinalpha.csv\\soc-sign-bitcoinalpha.csv");
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



        KruskalAlgorithm krAlgo = new KruskalAlgorithm(vertices+1,count);

        int i=0;
        for (Edge E:edges)
        {
            krAlgo.edgeArray[i].source =E.source;
            krAlgo.edgeArray[i].destination=E.destination;
            krAlgo.edgeArray[i].weight=E.weight;
            i++;
        }
        System.out.println("Results by using Kruskal' Algo :");
        krAlgo.applyKruskal();

        //Prims_algo prim=new Prims_algo(vertices+1);
        AverageDegree degree=new AverageDegree(vertices,count);
        System.out.println("Average Degree :"+degree.getDegree());

        cycle detection=new cycle(vertices+1);
        for(Edge E:edges){

            detection.addEdge(E.source, E.destination);

        }
        System.out.println("Cylcles in Graph:"+detection.isCyclic());

        int[][] weight = new int[vertices+1][vertices+1];
        System.out.println("Minimum spanning tree cost using Prims Algo:");
        Prims_algo g = new Prims_algo(vertices+1);

        for(Edge E:edges){

            weight[E.source][E.destination]=E.weight;
            weight[E.destination][E.source]=E.weight;
            g.addEdge(E.source, E.destination);
        }
        int start = 0;
        g.Prim(weight,start);

    }
    
}
