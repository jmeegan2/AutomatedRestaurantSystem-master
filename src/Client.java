import java.util.Scanner;

public class Client {


    static String nameInput;


    // Constants for minimum and maximum menu choices

    private static final int MIN_CHOICE = 0;
    private static final int MAX_CHOICE = 3;

    public static void main(String[] args) {


        // Create scanner for user input
        Scanner inputScanner = new Scanner(System.in);
        int menuChoice;

        // Get the singleton instance of the SystemInterface class
        SystemInterface systemInterface = SystemInterface.getInstance();

        // Display menu and get user's choice
        menuChoice = displayMenu(inputScanner, MIN_CHOICE, MAX_CHOICE);
        // Keep displaying menu and getting user's choice until they choose to exit
        while (menuChoice != 0) {
            switch (menuChoice) {
                case 1:
                    // Display full menu
                    SystemInterface.getMenu();
                    break;
                case 2:
                    // Place an order
                    System.out.println("\nEnter the name for order: ");
                    Scanner stringScanner = new Scanner(System.in);
                    nameInput = stringScanner.next();
                    SystemInterface.getOrders();
                    break;
                case 3:
                    // Display current tab
                    SystemInterface.getTab();
                    break;

            }
            menuChoice = displayMenu(inputScanner, MIN_CHOICE, MAX_CHOICE);

        }

        System.out.println("Menu Terminated");

    }


    // Displays menu and gets user's choice
    private static int displayMenu(Scanner inputScanner, int minChoice, int maxChoice) {
        int userChoice;
        System.out.println
                ("\nPlease select an option from the following menu:\n" +
                        "1 - Display the full menu\n" +
                        "2 - Place an order\n" +
                        "3 - Display the current tab\n" +
                        "0 - Exit the menu");
        System.out.print("Enter your choice: ");
        userChoice = getValidInt(inputScanner, minChoice, maxChoice);
        return userChoice;
    }

    // Gets a valid integer from the user within a specified range
    private static int getValidInt(Scanner inputScanner, int min, int max) {
        while (!inputScanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            inputScanner.next();
        }
        int userChoice = inputScanner.nextInt();
        if (userChoice < min || userChoice > max) {
            System.out.println("Invalid range. Please enter a number between " + min + " and " + max + ".");
            userChoice = getValidInt(inputScanner, min, max);
        }
        return userChoice;

    }


}

