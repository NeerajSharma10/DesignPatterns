package state;

public class SoldOutState extends VendingMachineState{
    @Override
    public VendingMachineState insertCoin(VendingMachine machine, int coins) {
        System.out.println("Machine is in sold out state");
        return machine.getSoldOutState();
    }

    @Override
    public VendingMachineState selectItem(VendingMachine machine) {
        System.out.println("Machine is in sold out state");
        return machine.getSoldOutState();
    }

    @Override
    public VendingMachineState dispense(VendingMachine machine) {
        System.out.println("Machine is in sold out state");
        return machine.getSoldOutState();
    }

    @Override
    public VendingMachineState returnCoin(VendingMachine machine) {
        System.out.println("Machine is in sold out state");
        return machine.getSoldOutState();
    }

    @Override
    public VendingMachineState refillItems(VendingMachine machine, int numOfItems) {
        machine.incrementItemCount(numOfItems);
        System.out.println("Items updated successfully");
        return machine.getNoCoinState();
    }

    @Override
    public String getStateName() {
        return "SOLD_OUT";
    }
}
