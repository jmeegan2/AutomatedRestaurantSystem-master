//
public class MenuItem {
    // Unique number identifying the menu item
    private int menuNum;
    // Description of the menu item
    private String itemDescription;
    // Price of the menu item
    private double itemPrice;

    // Constructor for creating a new menu item
    public MenuItem(int menuNum, String itemDescription, double itemPrice) {
        this.menuNum = menuNum;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    // Getter for the menu number
    public int getMenuNum() {
        return menuNum;
    }

    // Getter for the item description
    public String getDescription() {
        return itemDescription;
    }

    // Getter for the item price
    public double getPrice() {
        return itemPrice;
    }
}
