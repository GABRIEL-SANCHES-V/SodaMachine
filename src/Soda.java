public class Soda {

    private final String sodaName;
    private double sodaPrice;

    protected Soda(String sodaName, double sodaPrice) {
        this.sodaName = sodaName;
        this.sodaPrice = sodaPrice;
    }

    protected String getSodaName (){
        return sodaName;
    }

    protected double getSodaPrice (){
        return sodaPrice;
    }

    protected void setValueSoda(double newValueSoda){
        this.sodaPrice = newValueSoda;
    }
}
