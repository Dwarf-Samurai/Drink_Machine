package Machine;

public class Main {
    public static void main(String[] args) {
        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine();
        HotDrinkVendingMachine machineHot = new HotDrinkVendingMachine();

        machine.addBottleOfWater(new BottleOfWater("Pepsi", 100, 2));
        machine.addBottleOfWater(new BottleOfWater("Cola", 125, 1));
        machine.addBottleOfWater(new BottleOfWater("Sprit", 75, 2.5));

        machineHot.addHotDrink(new HotDrink("Akbar", 2, 20));
        machineHot.addHotDrink(new HotDrink("Nesti", 2.5, 30));
        machineHot.addHotDrink(new HotDrink("3in1", 0.5, 40));

        System.out.println(machine.getProduct("Cola"));
        System.out.println(machineHot.getProductVolume("Akbar", 2.5, 30));
        System.out.println(machineHot.getProduct("Akbar"));
        System.out.println("*********");

        printGetProduct(machine);
        System.out.println("*********");
        printGetProduct(machineHot);
    }

    public static void printGetProduct(VendingMachine vendingMachine) {
        System.out.println(vendingMachine.getProduct("Sprit"));
        System.out.println(vendingMachine.getProduct("3in1" ));
    }
}
