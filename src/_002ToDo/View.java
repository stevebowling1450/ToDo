package _002ToDo;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;

/**
 * Created by stevebowling on 10/11/16.
 */
public class View extends Add{

    public static void view()throws IOException{
        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println("Witch list would you like to see. \n Please choose :\n 1  Your Personal List. \n 2  Your Grocery List." +
                "\n 3 Your Work List. ");
        choose = sc.nextInt();
        if (choose==1) {
            System.out.println("This is your personal list: ");
            for (int i = 0; i < gradeBook1.size(); i++)
            System.out.println(gradeBook1.get(i)+"\n");

//               File file = new File("personal.txt");
//                FileReader fileReader = new FileReader(file);
//                BufferedReader bufferedReader = new BufferedReader(fileReader);
//                StringBuffer stringBuffer = new StringBuffer();
//                String line;
//                while ((line = bufferedReader.readLine()) != null) {
//                    stringBuffer.append(line);
//                    stringBuffer.append("\n");
//                }
//                fileReader.close();
//                System.out.println("Your Personal List:");
//                System.out.println(stringBuffer.toString());

        }
        else if (choose==2) {
            System.out.println("This is your personal list: ");
            for (int i = 0; i < gradeBook2.size(); i++)
                System.out.println(gradeBook2.get(i)+"\n");
//
//                File file = new File("grocery.txt");
//                FileReader fileReader = new FileReader(file);
//                BufferedReader bufferedReader = new BufferedReader(fileReader);
//                StringBuffer stringBuffer = new StringBuffer();
//                String line;
//                while ((line = bufferedReader.readLine()) != null) {
//                    stringBuffer.append(line);
//                    stringBuffer.append("\n");
//                }
//                fileReader.close();
//                System.out.println("Your Grocery List:");
//                System.out.println(stringBuffer.toString());

        }
        else if (choose==3) {
            System.out.println("This is your personal list: ");
            for (int i = 0; i < gradeBook3.size(); i++)
                System.out.println(gradeBook3.get(i)+"\n");

//                File file = new File("work.txt");
//                FileReader fileReader = new FileReader(file);
//                BufferedReader bufferedReader = new BufferedReader(fileReader);
//                StringBuffer stringBuffer = new StringBuffer();
//                String line;
//                while ((line = bufferedReader.readLine()) != null) {
//                    stringBuffer.append(line);
//                    stringBuffer.append("\n");
//                }
//                fileReader.close();
//                System.out.println("Your Work List:");
//                System.out.println(stringBuffer.toString());

        }
        Menu.menu();

    }
}
