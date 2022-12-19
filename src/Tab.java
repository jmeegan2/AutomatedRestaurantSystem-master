

import java.text.DecimalFormat;

public class Tab {
    private Menu menu;
    private Orders order;
    public static boolean paid = false;

    public Tab(Menu m, Orders o) {
        menu = m;
        order = o;
    }
    public void getTab() {
        DecimalFormat df = new DecimalFormat("#.##");
        paid = true;
        int i = 0;
        System.out.println("********************");
        double total = getTotal();
        double tax = total * 0.06;
        total = total + tax;
        System.out.println();
        System.out.println("Tax: $" + df.format(tax));
        System.out.println();
        System.out.println("Total: $" + df.format(total));
        System.out.println();
    }
    public double getTotal() {
        int i = 0;
        double total = 0;
        while (i < order.getOrder().size()) {
            MenuItem m = menu.getMenu().get(order.getOrder().get(i).getMenuNum());
            System.out.println(m.getMenuNum() + " " + m.getDescription() + " $" + m.getPrice());
            total += m.getPrice();
            i++;
        }
        return total;
    }
}