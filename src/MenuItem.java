
public class MenuItem {
    private int menuNum;
    private String itemDescription;
    private double itemPrice;

    public MenuItem(int menuNum, String itemDescription, double itemPrice) {
        this.menuNum = menuNum;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }
    public int getMenuNum() {
        return menuNum;
    }
    public String getDescription() {
        return itemDescription;
    }
    public double getPrice() {
        return itemPrice;
    }
}