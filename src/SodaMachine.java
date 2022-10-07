import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SodaMachine {

    private final Map<String,Soda> sodas;
    private final Inventory inventory;
    private double currentCredit;
    private final double changeBalance;

    public SodaMachine() {
        this.sodas = getSodas();
        this.inventory = new Inventory(sodas, 20);
        this.currentCredit = 0.00;
        this.changeBalance = 10.00;
    }

    private Map<String,Soda> getSodas() {

        Map<String,Soda> newSodas = new HashMap<>();

        newSodas.put("Coca-Cola", new Soda("Coca-Cola", 4.50));
        newSodas.put("Pespi", new Soda("Pepsi", 4.00));
        newSodas.put("Guaraná", new Soda("Guaraná", 4.00));
        newSodas.put("Sprite", new Soda("Sprite", 4.00));
        newSodas.put("Fanta laranja", new Soda("Fanta laranja", 3.50));

        return newSodas;
    }

    public double getCurrentCredit() {
        return currentCredit;
    }

    public Map<String,Soda> getSodaList() {
        return sodas;
    }

    public Map<String,Integer> getInventory() { // para teste
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
