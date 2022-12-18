import java.util.Scanner;

public class Main {

    private static final int MIN_CHOICE = 0;
    private static final int MAX_CHOICE = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        choice = menu(input, MIN_CHOICE, MAX_CHOICE);
        while (choice != 0) {
            switch (choice) {
                case 1:
                    SystemInterface.getMenu();
                    break;
                case 2:
                    SystemInterface.getOrders();
                    break;
                case 3:
                    callTrailer();
                    SystemInterface.getTab();
                    break;
            }
            choice = menu(input, MIN_CHOICE, MAX_CHOICE);
        }

        System.out.println("Menu Terminated");
    }

    private static int menu(Scanner input, int min, int max) {
        int ans;
        System.out.println("\nMenu:\n" +
                "1 - Display Menu\n" +
                "2 - Submit Order\n" +
                "3 - Display Tab\n" +
                "0 - Terminate menu");
        System.out.print("Enter your choice: ");
        ans = getInt(input, min, max);
        return ans;
    }

    private static int getInt(Scanner input, int min, int max) {
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

    private static void callTrailer() {
        System.out.println("Welcome to Chili's");
    }
}
