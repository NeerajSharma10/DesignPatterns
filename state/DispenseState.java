package state;

public class DispenseState extends VendingMachineState{

    @Override
    public VendingMachineState insertCoin(VendingMachine machine, int coins) {
        System.out.println("Dispensing Items please wait ");
        return machine.getDispenseState();
    }

    @Override
    public VendingMachineState selectItem(VendingMachine machine) {
        System.out.println("Dispensing Items please wait ");
        return machine.getDispenseState();
    }

    @Override
    public VendingMachineState dispense(VendingMachine machine) {
        System.out.println("Dispensed items successfully");
        machine.decrementItemCount();

        if(machine.getItemCount() > 0) {
            return machine.getNoCoinState();
        } else {
            return machine.getSoldOutState();
        }

    }

    @Override
    public VendingMachineState returnCoin(VendingMachine machine) {
        System.out.println("Cannot return while dispensing items");
        return machine.getDispenseState();
    }

    @Override
    public VendingMachineState refillItems(VendingMachine machine, int noOfItems) {
        System.out.println("Cannot refill items");
        return machine.getDispenseState();
    }

    @Override
    public String getStateName() {
        return "DISPENSE";
    }

}
