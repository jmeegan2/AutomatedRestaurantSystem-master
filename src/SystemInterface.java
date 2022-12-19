public class SystemInterface {
    // Static field to hold the singleton instance
    private static SystemInterface instance;

    // Invoker object for managing commands
    private static Invoker invoker = new Invoker();

    // Private constructor to prevent external instantiation
    private SystemInterface() {}

    // Static method to return the singleton instance
    public static SystemInterface getInstance() {
        if (instance == null) {
            instance = new SystemInterface();
        }
        return instance;
    }

    // Method for displaying the restaurant's menu
    public static String getMenu() {
        // Get the menu from the invoker
        Menu m = invoker.getMenu();
        // Print the menu
        m.print();
        // Return the menu as a string
        return m + " ";
    }

    // Method for displaying the current order
    public static String getOrders() {
        // Get the current order from the invoker
        Orders o = invoker.getOrder();
        // Return the order as a string
        return o + " ";
    }

    // Method for displaying the current tab
    public static String getTab() {
        // Get the current tab from the invoker
        Tab t = invoker.getTab();
        // Print the tab
        t.getTab();
        // Return the tab as a string
        return t + " ";
    }
}
