/*import java.io.FileWriter;
import java.io.IOException;

public class createfile {
    try {
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("storing_time.txt", true);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        myWriter.write(System.currentTimeMillis()+ "<--START TIME, [" + val + "] , END TIME--> " + System.currentTimeMillis() + '\n');
        try {
            myWriter.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        //System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred, WHILE WRITING TO THE storing_prims FILE");
        e.printStackTrace();
                    }
}
*/
