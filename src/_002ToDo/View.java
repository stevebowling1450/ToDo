package _002ToDo;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by stevebowling on 10/11/16.
 */
public class View extends Recall{

    public static void view()throws IOException{
        int choose;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Witch list would you like to see. \n Please choose :\n 1  Your Personal List. \n 2  Your Grocery List." +
                    "\n 3 Your Work List. ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("This is your personal list: ");
                    for (int i = 0; i < gradeBook1.size(); i++)
                        System.out.println(i + ". " + gradeBook1.get(i));

                    break;
                case 2:
                    System.out.println("This is your personal list: ");
                    for (int i = 0; i < gradeBook2.size(); i++)
                        System.out.println(i + ". " + gradeBook2.get(i));
                    break;
                case 3:
                    System.out.println("This is your personal list: ");
                    for (int i = 0; i < gradeBook3.size(); i++)
                        System.out.println(i + ". " + gradeBook3.get(i));
                    break;
                default: System.out.println("Please enter a number from 1 to 3");
                    view();
                    break;
            }
        }catch (InputMismatchException ime){
            System.out.println("Please enter a number from 1 to 3");
            view();
        }
        Menu.menu();

    }
}
