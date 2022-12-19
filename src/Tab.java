
//
import javax.xml.namespace.QName;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Tab {
    // Declare instance variables for menu and orders
    private Menu menu;
    private Orders order;
    // Declare a static variable to track whether the tab has been paid
    public static boolean paid = false;

    // Constructor to initialize menu and orders
    public Tab(Menu m, Orders o) {
        menu = m;
        order = o;
    }


    // Method to display the current tab
    public void getTab() {
        // Create a DecimalFormat object to format prices with 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        // Set the paid variable to true
        paid = true;
        // Declare a variable to keep track of the current item in the loop
        int i = 0;

        // Print a separator line
        System.out.println("\n" + "**********************************************");
        // Print the title for the tab
        System.out.println("******************Current Tab*****************");
        String name = "";
        TextAppend custName = new TextField(name);
        custName.write();
        // Get the total cost of the items on the tab
        double total = getTotal();
        // Calculate the tax on the total cost
        double tax = total * 0.06;
        // Add the tax to the total cost
        total = total + tax;
        // Print a blank line
        System.out.println();
        // Print the tax amount
        System.out.println("Tax: $" + df.format(tax));
        // Print a blank line
        System.out.println();
        // Print the total cost including tax
        System.out.println("Total: $" + df.format(total));
        // Print a blank line
        System.out.println();
    }

    // Method to calculate the total cost of the items on the tab
    public double getTotal() {
        // Declare a variable to keep track of the current item in the loop
        int i = 0;
        // Declare a variable to store the total cost
        double total = 0;
        // Loop through the items in the order
        while (i < order.getOrder().size()) {

            // Get the menu item based on its menu number
            MenuItem m = menu.getMenu().get(order.getOrder().get(i).getMenuNum());
            // Print the menu number, description, and price for the item
            System.out.println("Item #: "+ m.getMenuNum() + " " + m.getDescription() + "Price: $" + (m.getPrice()));
            // Add the price of the item to the total cost
            total += m.getPrice();
            // Increment the loop counter
            i++;
        }
        // Return the total cost
        return total;
    }
}
