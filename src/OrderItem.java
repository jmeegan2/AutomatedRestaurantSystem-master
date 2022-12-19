import java.util.*;

// This class represents an order item in a restaurant
public class OrderItem implements CommandInterface {
    // Aggregator object for storing menu and order information
    private Aggregator a;
    // Flag for indicating if the order has been submitted
    public static boolean submitted = false;
    // Scanner for reading input from the user
    Scanner input = new Scanner(System.in);
    // Minimum and maximum valid input values for menu item selection
    private static final int min = 1;
    private static final int max = 5;

    // Constructor for creating a new OrderItem
    public OrderItem(Aggregator a) {
        this.a = a;
    }

    // Method for placing an order
    public Object execute() {
        int choice;
        // String for storing user input (unused in this implementation)
        String g = "";
        // Initialize scanner for reading user input
        Scanner input = new Scanner(System.in);
        // Print the menu
        a.getMenu().print();
        // Prompt the user to enter a menu item number

        System.out.println("Please enter the number of the item you would like to order. To exit, enter 0: ");
        // Read the user input
        choice = getInt(input,min,max);
        // Create a new order
        Orders order = new Orders();
        // Set the order in the aggregator
        a.setOrders(order);
        // Loop until the user exits
        while(choice!=0) {
            // Add the selected menu item to the order
            switch(choice) {
                case 1:
                    a.getOrders().addOrders(new MenuItem(0,"Lobster Roll", 20.00));
                    break;
                case 2:
                    a.getOrders().addOrders(new MenuItem(1,"Maine Clam Chowder", 10.00));
                    break;
                case 3:
                    a.getOrders().addOrders(new MenuItem(2,"Blueberry Pie", 8.00));
                    break;
                case 4:
                    a.getOrders().addOrders(new MenuItem(3,"Steamed Mussels", 15.00));
                    break;
                case 5:
                    a.getOrders().addOrders(new MenuItem(4,"Grilled Atlantic Salmon", 18.00));
                    break;
            }
            // Print the menu again
            a.getMenu().print();
            // Prompt the user to enter another menu item number
            System.out.println("Please enter the number of the item you would like to order. To exit, enter 0: ");
            // Read the user input
            choice = getInt(input,min,max);
            // If the user has chosen to exit, break out of the loop
            if(choice == 0)
                break;
        }
        // Set the submitted flag to true
        submitted = true;
        // Confirm that the order has been placed
        return null;
    }
    public static int getInt(Scanner input, int min, int max) {
        while (!input.hasNextInt()) {
            System.out.println("Invalid.");
            input.next();
        }
        int choice = input.nextInt();
        return choice;
    }
}