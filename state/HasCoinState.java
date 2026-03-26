package state;

public class HasCoinState extends VendingMachineState{
    @Override
    public VendingMachineState insertCoin(VendingMachine machine, int coins) {
        machine.addCoins(coins);
        System.out.println("You have " + coins + " coins ");
        return machine.getHasCoinState();
    }

    @Override
    public VendingMachineState selectItem(VendingMachine machine) {

        if(machine.getInsertedCoins() >= machine.getItemPrice()) {
            System.out.println("Item dispensing successfully");

            int change = machine.getItemPrice() - machine.getInsertedCoins();
            if(change > 0) {
                System.out.println("Changed returned to " + change);
            }

            machine.setInsertedCoins(0);
            return machine.getDispenseState();
        } else {
            int needed = machine.getItemPrice() - machine.getInsertedCoins();
            System.out.println("Insufficient coins needed " + needed);
            return machine.getHasCoinState();
        }

    }

    @Override
    public VendingMachineState dispense(VendingMachine machine) {
        System.out.println("Please select an item");
        return machine.getHasCoinState();
    }

    @Override
    public VendingMachineState returnCoin(VendingMachine machine) {
        System.out.println("Coins returned successfully  " + machine.getInsertedCoins());
        machine.setInsertedCoins(0);
        return machine.getNoCoinState();
    }

    @Override
    public VendingMachineState refillItems(VendingMachine machine, int noOfItems) {
        System.out.println("Cannot refill items " + noOfItems);
        return machine.getHasCoinState();
    }

    @Override
    public String getStateName() {
        return "HAS_COIN";
    }
}
