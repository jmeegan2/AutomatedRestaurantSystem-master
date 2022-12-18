import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

    public Menu(){
        menu.add(new MenuItem(1,"Grilled Chicken", 14.95));
        menu.add(new MenuItem(2,"Filet Mignon",  25.95));
        menu.add(new MenuItem(3,"Asparagus",  4.95));
        menu.add(new MenuItem(4,"Caesar salad", 4.00));
        menu.add(new MenuItem(5,"Fruit Cup",  2.00));
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

