public class TextField implements TextAppend {

    //Two instance variables
    String name;

    public TextField(String name){
        this.name = Client.nameInput;
    }

    @Override
    public void write() {
        System.out.println("Order for: " + name );
    }
}
