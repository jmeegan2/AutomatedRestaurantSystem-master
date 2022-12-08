import java.util.Scanner;

public class SystemInterface {
    private static Invoker invoker = new Invoker();
    public static String getMenu() {
        Menu m = invoker.getMenu();
        m.print();
        return m + " ";
    }
    public static String getOrders() {
        Order o = invoker.getOrder();
        return o + " ";
    }
    public static String getTab() {
        Tab t = invoker.getTab();
        t.getTab();
        return t + " ";
    }
}