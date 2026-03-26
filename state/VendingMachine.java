package state;

public class VendingMachine {

    private VendingMachineState currentState;
    private int itemCount;
    private int itemPrice;
    private int insertedCoins;  // current coins

    //State objects(we will initialize these)
    VendingMachineState noCoinState;
    VendingMachineState dispenseState;
    VendingMachineState soldOutState;
    VendingMachineState hasCoinState;

    public VendingMachine(int itemCount, int itemPrice) {
        this.itemCount = itemCount;
        this.itemPrice = itemPrice;
        this.insertedCoins = 0;
        noCoinState = new NoCoinState();
        dispenseState = new DispenseState();
        soldOutState = new SoldOutState();
        hasCoinState = new HasCoinState();

        //set Initial State
        if(itemCount > 0) {
            currentState = noCoinState;
        } else {
            currentState = soldOutState;
        }

    }


    public void insertCoin(int coins) {
        currentState = currentState.insertCoin(this, coins);
    }

    public void selectItem() {
        currentState = currentState.selectItem(this);
    }

    public void dispense() {
        currentState = currentState.dispense(this);
    }

    public void returnCoin() {
        currentState = currentState.returnCoin(this);
    }

    public void refillItems(int numOfItems) {
        currentState = currentState.refillItems(this, numOfItems);
    }

    public void printStatus() {
        System.out.println("STATUS");
        System.out.println("Current state: " + currentState.getStateName());
        System.out.println("Item count: " + itemCount);
        System.out.println("Current Inserted coins: " + insertedCoins);
        System.out.println();
    }

    public VendingMachineState getCurrentState() {
        return currentState;
    }

    public int getItemCount() {
        return itemCount;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getInsertedCoins() {
        return insertedCoins;
    }

    public VendingMachineState getNoCoinState() {
        return noCoinState;
    }

    public VendingMachineState getDispenseState() {
        return dispenseState;
    }

    public VendingMachineState getSoldOutState() {
        return soldOutState;
    }

    public VendingMachineState getHasCoinState() {
        return hasCoinState;
    }

    public void decrementItemCount() {
        itemCount--;
    }

    public void incrementItemCount(int count) {
        itemCount+= count;
    }

    public void setInsertedCoins(int insertedCoins) {
        this.insertedCoins = insertedCoins;
    }

    public void addCoins(int coins) {
        insertedCoins += coins;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}
