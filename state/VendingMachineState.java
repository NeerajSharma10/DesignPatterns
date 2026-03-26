package state;

public abstract class VendingMachineState {

    public abstract VendingMachineState insertCoin(VendingMachine machine, int coins);
    public abstract VendingMachineState selectItem(VendingMachine machine);
    public abstract VendingMachineState dispense(VendingMachine machine);
    public abstract VendingMachineState returnCoin(VendingMachine machine);
    public abstract VendingMachineState refillItems(VendingMachine machine, int noOfItems);

    public abstract String getStateName();
}
