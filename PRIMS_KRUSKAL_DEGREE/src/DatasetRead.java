import java.io.*;
import java.util.ArrayList;
import java.util.List;


    public class DatasetRead {

        public List<Edge> readData (String file){
            List<Edge> EdgeList = new ArrayList<>();
            try {BufferedReader br = new BufferedReader(new FileReader(file));
                String line = br.readLine();
                while (line != null)
                {
                    String[] attributes = line.split(",");
                    Edge edge = createEdge(attributes);
                    EdgeList.add(edge) ;
                    line = br.readLine();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            return EdgeList; }

        private static Edge createEdge(String[] metadata) {
            int source = Integer.parseInt(metadata[0]);
            int destination = Integer.parseInt(metadata[1]);
            int weight = Integer.parseInt(metadata[1]);
            long time = Integer.parseInt(metadata[3]);
            return new Edge(source, destination, weight, time);
        }
    }