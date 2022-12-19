
//
public class Invoker {
        Aggregator a = new Aggregator();

        public Menu getMenu() {
            return new DisplayMenu(a).execute();
        }
        public Orders getOrder() {
            return (Orders) new OrderItem(a).execute();
        }
        public Tab getTab() {
            return  new DisplayTab(a).execute();
        }
}
