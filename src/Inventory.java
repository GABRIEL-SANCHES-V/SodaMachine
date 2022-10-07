import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<String,Integer> inventory;

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

}
