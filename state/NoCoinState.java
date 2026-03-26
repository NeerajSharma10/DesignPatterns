package state;

public class NoCoinState extends VendingMachineState{
    @Override
    public VendingMachineState insertCoin(VendingMachine machine, int coins) {
        machine.addCoins(coins);
        System.out.println("Inserted " + coins + " coin" + " and total coins are " + machine.getInsertedCoins());
        return machine.getHasCoinState();
    }

    @Override
    public VendingMachineState selectItem(VendingMachine machine) {
        System.out.println("Please insert a coin");
        return machine.getNoCoinState();
    }

    @Override
    public VendingMachineState dispense(VendingMachine machine) {
        System.out.println("Please insert a coin first then select an item");
        return machine.getNoCoinState();
    }

    @Override
    public VendingMachineState returnCoin(VendingMachine machine) {
        System.out.println("No Coin to return");
        return machine.getNoCoinState();
    }

    @Override
    public VendingMachineState refillItems(VendingMachine machine, int numOfItems) {
        machine.incrementItemCount(numOfItems);
        System.out.println("Refilled " + numOfItems + " items");
        return machine.getNoCoinState();
    }

    @Override
    public String getStateName() {
        return "NO_COIN";
    }
}
