import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SodaMachine machine = new SodaMachine();
        Map<String,Soda> sodaList = machine.getSodaList();

        for (String soda : sodaList.keySet()){
            System.out.printf("%-13s -> %.2f\n", sodaList.get(soda).getSodaName(), sodaList.get(soda).getSodaPrice());
        }

        System.out.println("=================================================");

        for (String soda : sodaList.keySet()) {
            System.out.printf("%-13s -> %3s\n", sodaList.get(soda).getSodaName(), machine.getInventory().get(soda));
        }

        System.out.println();

        System.out.println(machine.getCurrentCredit());
        System.out.println(machine.getChangeBalance());

        machine.addCurrentCredit(1);
        machine.addCurrentCredit(1);
        machine.addCurrentCredit(1);
        machine.addCurrentCredit(1);
        machine.addCurrentCredit(1);
        machine.addCurrentCredit(1);
        machine.addCurrentCredit(1);
        machine.addCurrentCredit(1);
        machine.addCurrentCredit(1);
        machine.addCurrentCredit(1);
        machine.addCurrentCredit(0.5);

        System.out.println(machine.getCurrentCredit());
    }
}
