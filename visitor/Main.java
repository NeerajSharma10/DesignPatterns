package visitor;

public class Main {
    public static void main(String[] args) {

        Item [] items = {new Book(), new Pen()};

        Visitor v = new PriceVisitor();

        for(Item item : items) {
            item.accept(v);
        }

        Visitor v2 = new TaxVisitor();

        for(Item item : items) {
            item.accept(v2);
        }

    }
}
