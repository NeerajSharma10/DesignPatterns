package visitor;

public class PriceVisitor implements Visitor {

    @Override
    public void visit(Book book) {
        System.out.println(book.getPrice());
    }

    @Override
    public void visit(Pen pen) {
        System.out.println(pen.getPrice());
    }
}
