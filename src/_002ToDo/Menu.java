package _002ToDo;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by stevebowling on 10/11/16.
 */
public class Menu {

    // here is my Menu, this is going to be the starter.
    public static void menu() throws IOException {

        int choose;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to My ToDo App. \n Please choose :\n 1 to Add to your list. \n 2 to View your list." +
                    "\n 3 to Remove from your list. \n 4 for help. \n 5 to Save & Quit. ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    Add.add();
                    break;
                case 2:
                    View.view();
                    break;
                case 3:
                    Remove.remove();
                    break;
                case 4:
                    Help.help();
                    break;
                case 5:
                    System.out.println("Thank you for using My ToDo App.");
                    Save.save();
                    break;
                default: System.out.println("Please enter a number from 1 to 5");
                    menu();
                    break;
            }
        }catch (InputMismatchException ime){
            System.out.println("Please enter a number from 1 to 5");
            menu();
        }
    }
}
