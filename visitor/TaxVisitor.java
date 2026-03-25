package visitor;

public class TaxVisitor implements Visitor {

    @Override
    public void visit(Book book) {
        System.out.println(book.getGstTax());
    }

    @Override
    public void visit(Pen pen) {
        System.out.println(pen.getGstTax());
    }
}
