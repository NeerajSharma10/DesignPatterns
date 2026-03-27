package chain;

public class Ceo extends Approver {
    @Override
    void approve(int amount) {
        System.out.println("CEO approved");
    }
}
