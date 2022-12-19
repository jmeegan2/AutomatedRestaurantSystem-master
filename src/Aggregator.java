//
public class Aggregator {
    // Declare instance variables for menu and orders
    private Menu menu;
    private Orders order;

    // Constructor to initialize menu and orders
    public Aggregator() {
        menu = new Menu();
        order = new Orders();
    }

    // Method to get the menu
    public Menu getMenu() {
        // Return the menu object
        return menu;
    }

    // Method to get the orders
    public Orders getOrders() {
        // Return the orders object
        return order;
    }

    // Method to set the orders
    public void setOrders(Orders order) {
        // Set the orders object to the specified object
        this.order = order;
    }
}
