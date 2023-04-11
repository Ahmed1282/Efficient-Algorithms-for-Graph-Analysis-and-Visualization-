import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class cycle {

    private final int V;
    private final List<List<Integer>> adj;

    public cycle(int V)
    {
        this.V = V;
        adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            adj.add(new LinkedList<>());
    }


    private boolean isCyclicUtil(int i, boolean[] visited,
                              		boolean[] recStack)
    {
    	
        if (recStack[i])
            return true;

        if (visited[i])
            return false;

        visited[i] = true;

        recStack[i] = true;
        List<Integer> children = adj.get(i);

        for (Integer c: children)
            if (isCyclicUtil(c, visited, recStack))
                return true;

        recStack[i] = false;

        return false;
    }

    public void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }


    public boolean isCyclic()
    {

        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for (int i = 0; i < V; i++)
            if (isCyclicUtil(i, visited, recStack))
                return true;

        return false;
    }


}

