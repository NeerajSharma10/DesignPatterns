package state;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------VENDING MACHINE-----------");

        int itemCount = 2;
        int itemPrice = 20;

        VendingMachine vendingMachine = new VendingMachine(itemCount, itemPrice);
        vendingMachine.printStatus();

        vendingMachine.selectItem();
        vendingMachine.printStatus();

        vendingMachine.insertCoin(10);
        vendingMachine.printStatus();


        vendingMachine.insertCoin(10);
        vendingMachine.printStatus();

        vendingMachine.selectItem();
        vendingMachine.printStatus();

        vendingMachine.dispense();
        vendingMachine.printStatus();

        vendingMachine.insertCoin(20);
        vendingMachine.selectItem();
        vendingMachine.dispense();
        vendingMachine.printStatus();

        vendingMachine.insertCoin(5);
        vendingMachine.printStatus();

        vendingMachine.refillItems(2);
        vendingMachine.printStatus();



    }
}
