import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSaleSodaMachine {

    public TestSaleSodaMachine() {
    }

    @Test
    public void test01(){

        SodaMachine machine = new SodaMachine();

        machine.addCurrentCredit(10, 4,2,7);

        machine.sale("Coca-Cola", machine, 2);

        assertEquals(machine.getInventory().get("Coca-Cola"), 18);

        double thing = machine.getCurrentCredit();

        assertEquals(thing, 1.00);

    }

    @Test
    public void test02(){

        SodaMachine machine = new SodaMachine();

        machine.addCurrentCredit(100, 40,20,70);

        machine.sale("Coca-Cola", machine, 20);

        assertEquals(machine.getInventory().get("Coca-Cola"), 0);

        double thing = machine.getCurrentCredit();

        assertEquals(thing, 10.00);

    }

    @Test
    public void test03(){

        SodaMachine machine = new SodaMachine();

        machine.addCurrentCredit(100, 40,20,70);

        assertEquals(machine.sale("Coca-Cola", machine, 21), 2);


    }

    @Test
    public void test04(){

        SodaMachine machine = new SodaMachine();

        machine.addCurrentCredit(0, 0,0,2);

        assertEquals(machine.sale("Coca-Cola", machine, 1), 1);

        double thing = machine.getCurrentCredit();

        assertEquals(thing, 2.00);
    }

}