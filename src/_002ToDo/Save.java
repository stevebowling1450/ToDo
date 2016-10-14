package _002ToDo;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 * Created by stevebowling on 10/13/16.
 */
public class Save extends Add{
    public static void save () throws IOException{

        PrintWriter outFile = new PrintWriter(new FileWriter("personal.txt"));
        for (int i = 0; i < gradeBook1.size(); i++) {
            outFile.println(gradeBook1.get(i));
        }
        outFile.close();

        PrintWriter outFile1 = new PrintWriter(new FileWriter("grocery.txt"));
        for (int i = 0; i < gradeBook2.size(); i++) {
            outFile1.println(gradeBook2.get(i));
        }
        outFile1.close();

        PrintWriter outFile2 = new PrintWriter(new FileWriter("work.txt"));
        for ( int i = 0; i < gradeBook3.size(); i++) {
            outFile2.println(gradeBook3.get(i));
        }
        outFile2.close();
    }
}
