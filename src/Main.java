import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SodaMachine machine = new SodaMachine();
        ArrayList<Soda> sodaList = machine.getSodaList();

        for (Soda soda : sodaList){
            System.out.printf("%-13s -> %.2f\n", soda.getSodaName(), soda.getSodaPrice());
        }

        System.out.println("=================================================");

        for (Soda soda : sodaList) {
            System.out.printf("%-13s -> %3s\n", soda.getSodaName(), machine.getInventory().get(soda));
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
