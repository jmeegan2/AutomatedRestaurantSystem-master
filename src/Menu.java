//
import java.util.ArrayList;

// This class represents a menu of items that a restaurant offers
public class Menu {
    // List of menu items
    private ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

    // Constructor that initializes the menu with a set of items
    public Menu(){
        menu.add(new MenuItem(1,"Lobster Roll           ", 20.00));
        menu.add(new MenuItem(2,"Maine Clam Chowder     ", 10.00));
        menu.add(new MenuItem(3,"Blueberry Pie          ", 8.00));
        menu.add(new MenuItem(4,"Steamed Mussels        ", 15.00));
        menu.add(new MenuItem(5,"Grilled Atlantic Salmon", 18.00));
    }

    // Prints the menu to the console
    public void print(){
        int count = 0;
        // Iterate through each menu item and print its details
        for(MenuItem menuItem: menu) {
            System.out.println("Item #: " +(count + 1) + " | " + "Description: " + menuItem.getDescription() + " | " +"Price: $" +menuItem.getPrice());
            count++;
        }
    }

    // Returns the list of menu items
    public ArrayList<MenuItem> getMenu(){
        return menu;
    }
}


