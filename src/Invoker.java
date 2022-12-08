

public class Invoker {
        Aggregator a = new Aggregator();

        public Menu getMenu() {
            return new DisplayMenu(a).execute();
        }
        public Order getOrder() {
            return (Order) new SubmitOrder(a).execute();
        }
        public Tab getTab() {
            return  new DisplayTab(a).execute();
        }
}
