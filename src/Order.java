import java.util.*;

public class Order {
    public static ArrayList<MenuItem> order;

    public Order() {
        order = new ArrayList<MenuItem>();
    }
    public ArrayList<MenuItem> getOrder() {
        return order;
    }
    public void addOrders(MenuItem i) {
        order.add(i);
    }
    public void print() {
        int i = 0;
        for(MenuItem menuItem: order) {
            System.out.println(menuItem.getDescription());
            i++;

        }
    }
}