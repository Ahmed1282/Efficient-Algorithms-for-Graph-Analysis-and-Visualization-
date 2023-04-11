public class AverageDegree {
    int vertices;
    int edges;


    public AverageDegree(int vertices, int edges){
        this.vertices = vertices;
        this.edges = edges;
    }

    public int getDegree()
    {
        return edges/vertices;
    }
}
