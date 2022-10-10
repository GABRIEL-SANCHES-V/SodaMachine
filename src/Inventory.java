import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String,Integer> inventory;

    protected Inventory(Map<String,Soda> sodas, int sodaQuantity){
        this.inventory = getInventory(sodas, sodaQuantity);
    }

    private Map<String,Integer> getInventory(Map<String,Soda> sodas, int sodaQuantity){
        Map<String,Integer> newInventory = new HashMap<>();

        for (String soda : sodas.keySet()) {
            newInventory.put(soda, sodaQuantity);
        }

        return newInventory;
    }

    protected Map<String,Integer> getSodaInventory(){
        return inventory;
    }

    protected void withdrawal(String sodaName, Inventory inventory){
        int quantityInInventory = inventory.getSodaInventory().get(sodaName);
        quantityInInventory--;
        this.inventory.replace(sodaName,quantityInInventory);
    }

}
