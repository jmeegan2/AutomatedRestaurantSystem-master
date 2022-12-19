import java.util.*;

// This class represents an order for a restaurant
public class Orders {
    // List of menu items in the order
    public static ArrayList<MenuItem> order;

    // Constructor for creating a new order
    public Orders() {
        // Initialize the list of menu items
        order = new ArrayList<MenuItem>();
    }

    // Getter for the list of menu items
    public ArrayList<MenuItem> getOrder() {
        return order;
    }

    // Method for adding a menu item to the order
    public void addOrders(MenuItem i) {
        // Add the menu item to the list
        order.add(i);
    }

    // Method for printing the order to the console
    public void print() {
        int i = 0;
        // Iterate through each menu item in the order and print its description
        for(MenuItem menuItem: order) {
            System.out.println(menuItem.getDescription());
            i++;
        }
    }
}
