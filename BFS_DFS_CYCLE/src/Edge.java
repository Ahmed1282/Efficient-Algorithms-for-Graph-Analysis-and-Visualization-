public class Edge {
        int source;
        int destination;
        int weight;
        long time;
       
        public Edge(int source, int destination, int weight, long time) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        this.time=time;
        }
        
        public String toString() 
        { return "Edge [source=" + source + ", destination=" + destination + ", weight=" + weight+ 
        ", time=" + time+ "]";
        }
        }
    

