public class Soda {

    private String sodaName;
    private double sodaPrice;

    protected Soda(String sodaName, double sodaPrice) {
        this.sodaName = sodaName;
        this.sodaPrice = sodaPrice;
    }

    protected void setChangeValueSoda(double newValueSoda){
        this.sodaPrice = newValueSoda;
    }
}
