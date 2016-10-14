package _002ToDo;
import java.util.Scanner;
import java.io.IOException;
/**
 * Created by stevebowling on 10/11/16.
 */
public class Add extends Recall{
    public static void add() throws IOException {

        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println("Witch list would you like to add to. \n Please choose :\n 1 to Add to your Personal List. \n 2 to Add to your Grocery List." +
                "\n 3 to Add to your Work List. ");
        choose = sc.nextInt();
        switch (choose) {
            case 1: {

                String ag;
                while (true) {
                    String priority;
                    Scanner tp = new Scanner(System.in);
                    System.out.println("Please enter task to your Personal List:");
                    ag = tp.nextLine();
                    Scanner pri = new Scanner(System.in);
                    System.out.println("Is the task High Priority? y/n");
                    priority = pri.nextLine();
                    if (priority.toLowerCase().substring(0, 1).equals("y")) {
                        gradeBook1.add(0, "\u001B[31m" + ag.toUpperCase() + "\u001B[0m");
                    } else if (priority.toLowerCase().substring(0, 1).equals("n")) {
                        gradeBook1.add(ag);
                    }
                    String moreG;
                    Scanner more = new Scanner(System.in);
                    System.out.println("Enter more tasks y/n");
                    moreG = more.nextLine();
                    if (moreG.toLowerCase().substring(0, 1).equals("n")) {
                        System.out.println("Thank You:");
                        break;
                    }
                }
                break;
            }
            case 2: {

                String ag;
                String priority;

                while (true) {
                    Scanner tp = new Scanner(System.in);
                    System.out.println("Please enter task to your Grocery List:");
                    ag = tp.nextLine();
                    Scanner pri = new Scanner(System.in);
                    System.out.println("Is the task High Priority? y/n");
                    priority = pri.nextLine();
                    if (priority.toLowerCase().substring(0, 1).equals("y")) {
                        gradeBook2.add(0, "\u001B[31m" + ag.toUpperCase() + "\u001B[0m");
                    } else if (priority.toLowerCase().substring(0, 1).equals("n")) {
                        gradeBook2.add(ag);
                    }

                    String moreG;
                    Scanner more = new Scanner(System.in);
                    System.out.println("Enter more tasks y/n ");
                    moreG = more.nextLine();
                    if (moreG.toLowerCase().substring(0, 1).equals("n")) {
                        System.out.println("Thank You:");
                        break;
                    }
                }

                break;
            }
            case 3: {

                String ag;
                String priority;

                while (true) {
                    Scanner tp = new Scanner(System.in);
                    System.out.println("Please enter task to your Work List:");
                    ag = tp.nextLine();
                    Scanner pri = new Scanner(System.in);
                    System.out.println("Is the task High Priority? y/n");
                    priority = pri.nextLine();
                    if (priority.toLowerCase().substring(0, 1).equals("y")) {
                        gradeBook2.add(0, "\u001B[31m" + ag.toUpperCase() + "\u001B[0m");
                    } else if (priority.toLowerCase().substring(0, 1).equals("n")) {
                        gradeBook2.add(ag);
                    }


                    String moreG;
                    Scanner more = new Scanner(System.in);
                    System.out.println("Enter more tasks y/n ");
                    moreG = more.nextLine();
                    if (moreG.toLowerCase().substring(0, 1).equals("n")) {
                        System.out.println("Thank You:");
                        break;
                    }
                }

                break;
            }
        }
        Menu.menu();

        }
    }

