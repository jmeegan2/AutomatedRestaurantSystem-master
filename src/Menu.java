import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

    public Menu(){
        menu.add(new MenuItem(1,"Chicken Sandwich", 12.23));
        menu.add(new MenuItem(2,"Rib eye Steak",  19.95));
        menu.add(new MenuItem(3,"Fries",  3.00));
        menu.add(new MenuItem(4,"Vegetable salad", 4.00));
        menu.add(new MenuItem(5,"Ice cream",  3.00));
    }
    public void print(){
        int count = 0;
        for(MenuItem menuItem: menu) {
            System.out.println((count + 1) + " " + menuItem.getDescription() + " " + menuItem.getPrice());
            count++;
        }
    }
    public ArrayList<MenuItem> getMenu(){
        return menu;
    }
}

