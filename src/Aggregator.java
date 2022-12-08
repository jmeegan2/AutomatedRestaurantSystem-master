

public class Aggregator {
    private Menu menu;
    private Order order;

    public Aggregator() {
        menu = new Menu();
        order = new Order();
    }
    public Menu getMenu() {
        return menu;
    }
    public Order getOrders() {
        return order;
    }
    public void setOrders(Order order) {
        this.order = order;
    }
}