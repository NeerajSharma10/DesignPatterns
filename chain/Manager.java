package chain;

public class Manager extends Approver {

    @Override
    void approve(int amount) {
        if (amount <= 1000) {
            System.out.println("Manager approved");
        } else if (next != null) {
            next.approve(amount);
        }
    }
}
