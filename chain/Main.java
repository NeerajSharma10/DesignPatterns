package chain;

public class Main {
    public static void main(String[] args) {

        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new Ceo();

        manager.setNext(director);
        director.setNext(ceo);

        manager.approve(1000); // goes till CEO
    }
}
