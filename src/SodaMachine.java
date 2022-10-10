import java.util.HashMap;
import java.util.Map;

public class SodaMachine {

    private final Map<String,Soda> sodas;
    private final Inventory inventory;
    private double currentCredit;
    private  double changeBalance;

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

    private double getChangeBalance() { // para teste
        return changeBalance;
    }

    public void addCurrentCredit(int quantityOf10, int quantityOf25, int quantityOf50, int quantityOf100) {
        this.currentCredit += (quantityOf10 * 0.1);
        this.currentCredit += (quantityOf25 * 0.25);
        this.currentCredit += (quantityOf50 * 0.5);
        this.currentCredit += (quantityOf100);
    }

    public void sale(String sodaName, SodaMachine machine){
        if(machine.getSodaList().get(sodaName).getSodaPrice() > machine.currentCredit) {

            if(machine.inventory.getSodaInventory().get(sodaName) > 0) {

                this.changeBalance += currentCredit;
                this.inventory.withdrawal(sodaName, machine.inventory);
                this.currentCredit -= machine.getSodaList().get(sodaName).getSodaPrice();
                this.changeBalance -= currentCredit;
                System.out.printf("Troco: R$ %.2f\n", currentCredit);

            } else {
                System.out.println("Refrigerante em falta.");
            }

        } else {
            System.out.printf("Saldo insuficiente\nTroco: R$ %.2f\n", currentCredit);
        }
    }


}
