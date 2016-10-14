package _002ToDo;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
/**
 * Created by stevebowling on 10/13/16.
 */
public class Recall {
    public static ArrayList<String> gradeBook1 = new ArrayList<>();
    public static ArrayList<String> gradeBook2 = new ArrayList<>();
    public static ArrayList<String> gradeBook3 = new ArrayList<>();

    public static void recall() throws IOException{

        Scanner inFile = new Scanner(new FileReader("personal.txt"));
        while (inFile.hasNextLine()){
            gradeBook1.add(inFile.nextLine());
        }
        Scanner inFile2 = new Scanner(new FileReader("grocery.txt"));
        while (inFile2.hasNextLine()){
            gradeBook2.add(inFile2.nextLine());
        }
        Scanner inFile3 = new Scanner(new FileReader("work.txt"));
        while (inFile3.hasNextLine()){
            gradeBook3.add(inFile3.nextLine()+"\n");
        }
    }
}
