package _002ToDo;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

/**
 * Created by stevebowling on 10/11/16.
 */
public class Add {

    public static ArrayList<String> gradeBook1 = new ArrayList<>();
    public static ArrayList<String> gradeBook2 = new ArrayList<>();
    public static ArrayList<String> gradeBook3 = new ArrayList<>();
    public static void add() throws IOException {

        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println("Witch list would you like to add to. \n Please choose :\n 1 to Add to your Personal List. \n 2 to Add to your Grocery List." +
                "\n 3 to Add to your Work List. ");
        choose = sc.nextInt();
        String sum1 = " ";
        if (choose == 1) {

            String ag;

            while (true) {
                Scanner tp = new Scanner(System.in);
                System.out.println("Please enter task to your Personal List:");
                ag = tp.nextLine();
                gradeBook1.add(ag);
                String moreG;
                Scanner more = new Scanner(System.in);
                System.out.println("Enter more tasks y/n ");
                moreG = more.nextLine();


                if (moreG.toLowerCase().substring(0, 1).equals("n")) {
                    System.out.println("Thank You:");
                    for (int i = 0; i < gradeBook1.size(); i++) {
                        sum1 = (sum1 + "\n") + gradeBook1.get(i);
                    }

                   PrintWriter outFile = new PrintWriter(new FileWriter("personal.txt", true));
                    outFile.println(sum1);
                    outFile.close();
                    break;
                }
            }
        }

        else if (choose==2){

            String ag;

            while (true) {
                Scanner tp = new Scanner(System.in);
                System.out.println("Please enter task to your Grocery List:");
                ag = tp.nextLine();
                gradeBook2.add(ag);

                String moreG;
                Scanner more = new Scanner(System.in);
                System.out.println("Enter more tasks y/n ");
                moreG = more.nextLine();

                String sum2 = " ";
                if (moreG.toLowerCase().substring(0, 1).equals("n")) {
                    System.out.println("Thank You:");
                    for (int i = 0; i < gradeBook2.size(); i++) {
                        sum2 = (sum2 +  "\n") + gradeBook2.get(i);
                    }

                    PrintWriter outFile = new PrintWriter(new FileWriter("grocery.txt", true));
                    outFile.println(sum2);
                    outFile.close();
                    break;
                }
            }

        }
        else if (choose==3){

            String ag;

            while (true) {
                Scanner tp = new Scanner(System.in);
                System.out.println("Please enter task to your Work List:");
                ag =tp.nextLine();
                gradeBook3.add(ag);

                String moreG;
                Scanner more = new Scanner(System.in);
                System.out.println("Enter more tasks y/n ");
                moreG = more.nextLine();

                String sum3 = " ";
                if (moreG.toLowerCase().substring(0, 1).equals("n")) {
                    System.out.println("Thank You:");
                    for (int i = 0; i < gradeBook3.size(); i++) {
                        sum3 = (sum3 + "\n") + gradeBook3.get(i);
                    }

                    PrintWriter outFile = new PrintWriter(new FileWriter("work.txt", true));
                    outFile.println(sum3);
                    outFile.close();
                    break;
                }
            }

        }Menu.menu();

        }
    }

