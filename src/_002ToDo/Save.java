package _002ToDo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Created by stevebowling on 10/13/16.
 */
public class Save extends Add{
    public static void save () throws IOException{
        String sum1=" ";
        for (int i = 0; i < gradeBook1.size(); i++) {
            sum1 = sum1 + gradeBook1.get(i);
        }
        PrintWriter outFile = new PrintWriter(new FileWriter("personal.txt"));
        outFile.println(sum1);
        outFile.close();


        String sum2=" ";
        for (int i = 0; i < gradeBook2.size(); i++) {
            sum2 = sum2 + gradeBook2.get(i);
        }
        PrintWriter outFile1 = new PrintWriter(new FileWriter("grocery.txt"));
        outFile1.println(sum2);
        outFile1.close();


        String sum3=" ";
        for (int i = 0; i < gradeBook3.size(); i++) {
            sum3 = sum3+ gradeBook3.get(i);
        }
        PrintWriter outFile2 = new PrintWriter(new FileWriter("work.txt"));
        outFile.println(sum3);
        outFile.close();
    }
}
