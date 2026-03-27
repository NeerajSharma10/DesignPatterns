package chain;

public class Director extends Approver{
    @Override
    void approve(int amount) {
        if (amount <= 5000) {
            System.out.println("Director approved");
        } else if (next != null) {
            next.approve(amount);
        }
    }
}
