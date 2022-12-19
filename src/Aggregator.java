

public class Aggregator {
    private Menu menu;
    private Orders order;

    public Aggregator() {
        menu = new Menu();
        order = new Orders();
    }
    public Menu getMenu() {
        return menu;
    }
    public Orders getOrders() {
        return order;
    }
    public void setOrders(Orders order) {
        this.order = order;
    }
}