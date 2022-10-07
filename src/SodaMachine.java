import java.util.ArrayList;
import java.util.Map;

public class SodaMachine {

    private final ArrayList<Soda> sodas;
    private final Inventory inventory;
    private double currentCredit;
    private final double changeBalance;

    public SodaMachine() {
        this.sodas = getSodas();
        this.inventory = new Inventory(sodas, 20);
        this.currentCredit = 0.00;
        this.changeBalance = 10.00;
    }

    private ArrayList<Soda> getSodas() {

        ArrayList<Soda> newSodas = new ArrayList<>();
        newSodas.add(new Soda("Coca-Cola", 5.50));
        newSodas.add(new Soda("Pepsi", 5.00));
        newSodas.add(new Soda("Guaraná", 5.00));
        newSodas.add(new Soda("Sprite", 5.00));
        newSodas.add(new Soda("Fanta laranja", 4.50));

        return newSodas;
    }

    public double getCurrentCredit() {
        return currentCredit;
    }

    public ArrayList<Soda> getSodaList() {
        return sodas;
    }

    public Map<Soda,Integer> getInventory() { // para teste
        return inventory.getSodaInventory();
    }
    public double getChangeBalance() { // para teste
        return changeBalance;
    }

    public void addCurrentCredit(double value) {
        if(value == 0.1 || value == 0.25 || value == 0.5 || value ==  1.00) {
            this.currentCredit = currentCredit + value;

        } else {
            System.out.println("Valor inválido!");
        }

    }


}
