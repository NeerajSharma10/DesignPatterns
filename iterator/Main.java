package iterator;

public class Main {
    public static void main(String[] args) {

        MyList list = new MyList();
        Iterator it = list.getIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
