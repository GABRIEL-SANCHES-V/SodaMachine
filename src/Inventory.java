import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<Soda,Integer> inventory;

    protected Inventory(ArrayList<Soda> sodas, int sodaQuantity){
        this.inventory = getInventory(sodas, sodaQuantity);
    }

    private Map<Soda,Integer> getInventory(ArrayList<Soda> sodas, int sodaQuantity){
        Map<Soda,Integer> newInventory = new HashMap<>();

        for (Soda soda : sodas) {
            newInventory.put(soda, sodaQuantity);
        }

        return newInventory;
    }

    protected Map<Soda,Integer> getSodaInventory(){
        return inventory;
    }

}
