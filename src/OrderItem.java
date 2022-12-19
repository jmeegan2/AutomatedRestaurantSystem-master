import java.util.*;

public class OrderItem implements CommandInterface {
    private Aggregator a;
    public static boolean submitted = false;
    Scanner input = new Scanner(System.in);
    private static final int min = 1;
    private static final int max = 5;

    public OrderItem(Aggregator a) {
        this.a = a;
    }
    public Object execute() {
        int choice;
        String g = "";
        Scanner input = new Scanner(System.in);
        a.getMenu().print();
        System.out.println("Place your order, 0 to exit: ");
        choice = getInt(input,min,max);
        Orders order = new Orders();
        a.setOrders(order);
        while(choice!=0) {
            switch(choice) {
                case 1:
                    a.getOrders().addOrders(new MenuItem(0,"Chicken Sandwich", 12.23));
                    break;
                case 2:
                    a.getOrders().addOrders(new MenuItem(1,"Rib eye Steak",  19.95));
                    break;
                case 3:
                    a.getOrders().addOrders(new MenuItem(2,"Fries",  3.00));
                    break;
                case 4:
                    a.getOrders().addOrders(new MenuItem(3,"Vegetable salad", 4.00));
                    break;
                case 5:
                    a.getOrders().addOrders(new MenuItem(4,"Ice cream",  3.00));
                    break;
            }
            a.getMenu().print();
            System.out.print("Place order now, 0 to exit: ");
            choice = getInt(input,min,max);
            if(choice == 0)
                break;
        }
        submitted = true;
        System.out.println("Your order has been placed. ");
        return null;
    }
    public static int getInt(Scanner input, int min, int max) {
        while (!input.hasNextInt()) {
            System.out.println("Invalid.");
            input.next();
        }
        int choice = input.nextInt();
        return choice;
    }
}