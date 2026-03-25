package visitor;

public class Book implements Item {
    private int price = 100;
    private int gstTax = 10;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getPrice() {
        return price;
    }

    public int getGstTax() {
        return gstTax;
    }
}
