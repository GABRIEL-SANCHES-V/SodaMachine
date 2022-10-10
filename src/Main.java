import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SodaMachine machine = new SodaMachine();
        Map<String,Soda> sodaList = machine.getSodaList();

        machine.addCurrentCredit(10, 4,2,4);

        System.out.println(machine.getCurrentCredit());


        System.out.println();

        machine.sale("Coca-Cola", machine);

        for (String soda : sodaList.keySet()) {
            System.out.printf("%-13s -> %3s\n", sodaList.get(soda).getSodaName(), machine.getInventory().get(soda));
        }

        System.out.println(machine.getCurrentCredit());
    }
}
