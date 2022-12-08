public class PreDecorator extends Decorator {

    public PreDecorator(Tab r){
        super(r);
    }

    @Override
    public void prtReceipt() {
        callTrailer();
    }
}
