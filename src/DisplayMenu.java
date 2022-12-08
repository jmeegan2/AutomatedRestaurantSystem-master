
public class DisplayMenu implements CommandInterface {
        private Aggregator a;

        public DisplayMenu(Aggregator a) {
            this.a = a;
        }
        @Override
        public Menu execute() {
            System.out.println("Menu: ");
            return a.getMenu();
        }
}
