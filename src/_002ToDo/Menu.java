package _002ToDo;
import java.io.IOException;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/11/16.
 */
public class Menu {
    // here is my Menu, this is going to be the starter.
    public static void menu() throws IOException {
        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to My ToDo App. \n Please choose :\n 1 to Add to your list. \n 2 to View your list." +
                "\n 3 to Remove from your list. \n 4 for help. \n 5 to Quit. ");
        choose= sc.nextInt();
        if (choose==1){
            Add.add();
        }else if (choose==2){
            View.view();
        }else if (choose==3){
            Remove.remove();
        }


    }
}
