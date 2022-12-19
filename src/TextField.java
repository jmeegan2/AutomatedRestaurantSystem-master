public class TextField implements TextAppend {

    //Two instance variables
    String name;

    public TextField(String name){
        this.name = Client.nameInput;
    }

    @Override
    public void write() {
        System.out.println("Location: 1000 Old Faithful Rd, Yellowstone"
                +" \nOrder for: " + name );
    }
}
