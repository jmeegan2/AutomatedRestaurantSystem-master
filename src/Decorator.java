public abstract class Decorator implements TextAppend {

    TextAppend textAppend;

    public Decorator(TextAppend textAppend){
        this.textAppend = textAppend;
    }
    @Override
    public void write() {
        //aggregation relationship
        textAppend.write();
    }


}
