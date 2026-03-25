package visitor;

import java.awt.*;

public class Pen implements Item{
    private int price = 200;
    private int gstTax = 100;

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
