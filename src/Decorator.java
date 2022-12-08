public class Decorator implements Receipt {
    private Tab trailer;

    public Decorator(Tab r){
        trailer = r;
    }
    public void callTrailer(){
        trailer.getTab();
    }
    public void prtReceipt(){
        callTrailer();
    }
}
