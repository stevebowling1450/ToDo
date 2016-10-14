package _002ToDo;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by stevebowling on 10/11/16.
 */
public class Help {
    public static void help() throws IOException{
        int ans;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 for help with Add to your list.\n2 for help with view your list.\n" +
                    "3 for help with Remove from your list ");
            ans = sc.nextInt();
            switch (ans) {
                case 1:
                    System.out.println("Use this to add and set priority to you task.");
                    break;
                case 2:
                    System.out.println("Use this to just view your current list of task.");
                    break;
                case 3:
                    System.out.println("Use this to Remove task from your list by choosing the appropriate number. ");
                    break;
                default: System.out.println("Please enter a number from 1 to 3");
                    help();
                    break;
            }
        }catch (InputMismatchException ime){
            System.out.println("Please enter a number from 1 to 3");
                help();
        }
        Menu.menu();
    }

}
