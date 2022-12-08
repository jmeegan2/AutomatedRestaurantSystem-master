
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static final int min = 0;
    public static final int max = 3;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        choice = menu(input,min,max);
        while(choice != 0){
            switch (choice) {
                //Case 1 iterates over all the items in Menu object.
                case 1:
                    SystemInterface.getMenu();
                    break;
                //Case 2 iterates over appetizer items in the Menu object.
                case 2:
                    SystemInterface.getOrders();
                    break;
                //Case 3 iterates over main dish items in the Menu objects.
                case 3:
                    calltrailer();
                    SystemInterface.getTab();

                    break;
                //Case 4 iterates over the desert items in the Menu object.
            }
            choice = menu(input,min,max);
        }

        System.out.println("Menu Terminated");
    }
    //Menu that displays the options.
    public static int menu(Scanner input, int min,int max){
        int ans;
        System.out.println("\t--------------------------------------------------------\n" +
                "\t1 – Display Menu (Just displays menu)\n" +
                "\t2 – Submit Order (Go to when ready to order)\n" +
                "\t3 – Display Tab\n" +
                "\t0 - Terminate menu\n" +
                "\t--------------------------------------------------------\n");
        System.out.print("    Enter your choice: ");;
        ans = getInt(input,min,max);
        return ans;
    }
    //Input validation for interger choices.
    public static int getInt(Scanner input, int min, int max) {
        while (!input.hasNextInt()) {
            System.out.println("Invalid.");
            input.next();
        }
        int choice = input.nextInt();
        if (choice < min || choice > max) {
            System.out.println("Invalid range.");
            choice = getInt(input, min, max);
        }
        return choice;
    }
    public static void calltrailer(){
        System.out.println("Welcome to steakhouse");
    }
}