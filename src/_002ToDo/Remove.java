package _002ToDo;
import java.util.Scanner;
import java.io.IOException;
/**
 * Created by stevebowling on 10/11/16.
 */
public class Remove extends Recall {
    public static void remove()throws IOException{
        int choose;
        int rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Witch list would you like to Remove from. \n Please choose :\n 1  Your Personal List. \n 2  Your Grocery List." +
                "\n 3 Your Work List. ");
        choose = sc.nextInt();

        if (choose==1) {
            System.out.println("This is your personal list: ");
            for (int i = 0; i < gradeBook1.size(); i++)
                System.out.println(i +". "+gradeBook1.get(i));
            System.out.println("Which item to be removed:");
            rem=sc.nextInt();
            gradeBook1.remove(rem);
        }
        else if (choose==2) {
            System.out.println("This is your personal list: ");
            for (int i = 0; i < gradeBook2.size(); i++)
                System.out.println(i+". "+gradeBook2.get(i));
            System.out.println("Which item to be removed:");
            rem=sc.nextInt();
            gradeBook2.remove(rem);
        }
        else if (choose==3) {
            System.out.println("This is your personal list: ");
            for (int i = 0; i < gradeBook3.size(); i++)
                System.out.println(i+". "+gradeBook3.get(i));
            System.out.println("Which item to be removed:");
            rem=sc.nextInt();
            gradeBook1.remove(rem);
        }
        Menu.menu();

    }
}
